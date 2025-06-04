package com.example.bookstore.config;

import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;

@Configuration
@EnableWebSecurity
public class SecurityConfig {
	
	private final MyUserDetailService myUserDetailService;

	public SecurityConfig(MyUserDetailService myUserDetailService) {
			this.myUserDetailService = myUserDetailService;
	}

	@Bean
	CorsConfigurationSource corsConfigurationSource() {
		CorsConfiguration configuration = new CorsConfiguration();
		configuration.applyPermitDefaultValues();
		configuration.setAllowedMethods(List.of("GET", "POST", "PUT", "DELETE", "OPTIONS", "HEAD"));
		UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
		source.registerCorsConfiguration("/**",configuration);
		return source;
	}

	@Bean
	public UserDetailsService userDetailService() {
			return myUserDetailService;
	}
	
	@Bean
	public PasswordEncoder passwordEncoder() {
			return new BCryptPasswordEncoder();
	}
	
	/**
	 * Configures the AuthenticationProvider.
	 * 
	 * @return the configured AuthenticationProvider
	 */
	@Bean
	public AuthenticationProvider authenticationProvider() {
		DaoAuthenticationProvider daoAuthenticationProvider = new DaoAuthenticationProvider();
		daoAuthenticationProvider.setUserDetailsService(myUserDetailService);
		daoAuthenticationProvider.setPasswordEncoder(passwordEncoder());
		return daoAuthenticationProvider;
	}
			
	@Bean
	public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
		
		http
		.csrf().disable()
		.cors(cors -> cors.configurationSource(corsConfigurationSource()))
		.authorizeHttpRequests((authz) -> authz
			.requestMatchers("/swagger-ui/**", "/v3/api-docs*/**").permitAll()
			.requestMatchers("/api/auth/register").permitAll()
			.requestMatchers("/api/books").permitAll()
			.anyRequest().authenticated())
			.httpBasic(Customizer.withDefaults());
						
		return http.build();
	}
	
	/*
		* In memory hardcoded authentication
		*/
	/*@Bean
	public InMemoryUserDetailsManager userDetailsService() {
			UserDetails user = User.withUsername("user")
					.password(passwordEncoder().encode("pass"))
							.roles("SIMPLE_USER").build();
			return new InMemoryUserDetailsManager(user);
	}*/
	/*@Bean
	public AuthenticationManager authenticationManager(AuthenticationConfiguration authenticationConfiguration) throws Exception {
			return authenticationConfiguration.getAuthenticationManager();
	}*/
}

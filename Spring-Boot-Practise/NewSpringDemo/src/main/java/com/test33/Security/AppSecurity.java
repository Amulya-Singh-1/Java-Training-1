package com.test33.Security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Configuration
@EnableWebSecurity
public class AppSecurity extends WebSecurityConfigurerAdapter {
	
	@Bean
	public AuthenticationProvider authProvider() {
		DaoAuthenticationProvider provider=new DaoAuthenticationProvider();
		provider.setUserDetailsService( userDetailsService() );
		provider.setPasswordEncoder( new BCryptPasswordEncoder() );
		return provider;
	}
	
//	@Bean
//	protected UserDetailsService userDetailService() {
//		List<UserDetails> users=new ArrayList<>();
//		users.add( User.withDefaultPasswordEncoder().username("Amulya").password("idk123").roles("USER").build() );
//		
//		return new InMemoryUserDetailsManager(users);
//	}

}

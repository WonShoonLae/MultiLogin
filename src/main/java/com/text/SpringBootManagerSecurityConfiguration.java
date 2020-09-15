package com.text;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Configuration
@Order(2)
public class SpringBootManagerSecurityConfiguration extends WebSecurityConfigurerAdapter{
	@Autowired
	BCryptPasswordEncoder bCryptPasswordEncoder;
		
	@Autowired
	UserDetailsService managerDetailsServiceImpl;
	
	@Override
	public void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.userDetailsService(managerDetailsServiceImpl).passwordEncoder(bCryptPasswordEncoder);
	}
	
	@Override
	public void configure(HttpSecurity http) throws Exception {
		http
			.antMatcher("/manager/**")
			.authorizeRequests().anyRequest().authenticated()
			.and().formLogin().loginPage("/manager/login")
				.defaultSuccessUrl("/manager/dashboard", true)
				.failureUrl("/manager/accessdenied")
			.permitAll()
			.and().logout().logoutUrl("/manager/logout").logoutSuccessUrl("/manager/login");
			//.and().logout().logoutSuccessUrl("/user/login");
		
		http.csrf().disable();
	}
}

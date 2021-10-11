package com.tusker.tutorial.springin6min.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

import java.util.Collections;

@Configuration
//@EnableWebSecurity
class SecurityConfiguration extends WebSecurityConfigurerAdapter {

	PasswordEncoder passwordEncoder = PasswordEncoderFactories.createDelegatingPasswordEncoder();

	@Bean
    UserDetailsService users(){
		return new InMemoryUserDetailsManager( Collections.singleton( User.withUsername( "tusker" )
				.roles( "ADMIN" ).password(passwordEncoder.encode("pw" ) ).build() ) );
	}

	/*@Override
	protected void configure(HttpSecurity httpSecurity) throws Exception {
		httpSecurity.authorizeRequests().antMatchers("/api/cars","/cars").permitAll()
				.anyRequest().authenticated();
	}*/

	/*public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
		auth.inMemoryAuthentication()
				.withUser("admin").password("admin").roles("ADMIN")
				.and()
				.withUser("tusker").password("pw").roles("USER");
	}*/
}

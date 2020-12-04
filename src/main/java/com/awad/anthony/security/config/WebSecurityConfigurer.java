package com.awad.anthony.security.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.BeanIds;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.awad.anthony.security.repositories.UserRepository;

@Configuration
public class WebSecurityConfigurer extends WebSecurityConfigurerAdapter {
	
	@Autowired
	UserRepository userRepository;
	
	 @Bean(name = BeanIds.AUTHENTICATION_MANAGER)
	 @Override
	 public AuthenticationManager authenticationManagerBean() throws Exception {
		// returns the authentication manager which contains the users that can fetch use our private scope
		 return super.authenticationManagerBean();
	 }

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		//here we set our users that will access our private scope can be fetched from a database
//		super.configure(auth);
		
		 PasswordEncoder encoder = new MyPasswordEncoder();
		UserDetails userBuilder = User.withUsername("anthony").password("1234").roles("CLIENT").build() ;
		auth.inMemoryAuthentication()
			.withUser(userBuilder)
			.passwordEncoder(encoder);

		
	}
	
	
	

}

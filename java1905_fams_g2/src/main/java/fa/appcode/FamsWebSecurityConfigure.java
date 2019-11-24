package fa.appcode;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;


import fa.appcode.service.MyUserDetailService;

@Configuration
@EnableWebSecurity
public class FamsWebSecurityConfigure extends WebSecurityConfigurerAdapter {
	@Autowired
	private MyUserDetailService myUserDetailsService;

	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		// TODO Auto-generated method stub
		auth.userDetailsService(myUserDetailsService).passwordEncoder(passwordEncoder());
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		// TODO Auto-generated method stub
		 http.csrf().disable()
	        .authorizeRequests()
	        .antMatchers("/login","/css/**","/js/**").permitAll()		
	        .antMatchers("/goAdminPage").hasAnyRole("System Admin")
	        .antMatchers("/goRecPage").hasAnyRole("FA REC")
	        .anyRequest()
	        .authenticated()
	        .and()
	        .formLogin()
	        .loginPage("/login").permitAll()
	        .usernameParameter("username")
	        .passwordParameter("password")
	        .defaultSuccessUrl("/goIndex",true)
	        .failureUrl("/login?error")
	        .and()
	        .logout().logoutSuccessUrl("/login").permitAll();
	}
}

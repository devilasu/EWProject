/**
* @author			: YJ Kim
* @date				: 2023.02.26
* @description		: 스프링시큐리티 설정
* ===========================================================
* DATE					AUTHOR				NOTE
* -----------------------------------------------------------
* 2023.02.26				YJ Kim				최초 생성
*/
package com.tog.ewp.config.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;


@Configuration
@EnableWebSecurity
public class SpringSecurityConfig{
	
	/**
	* @methodName    : passwordEncoder
	* @author        : YJ Kim
	* @date          : 2023.02.26
	* @description   : 비밀번호 해시 암호화
	*/
	@Bean
	public BCryptPasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
	
	@Bean
	public SecurityFilterChain configure(HttpSecurity http) throws Exception{
		http
		.authorizeRequests()
		.anyRequest().permitAll();
		return http.build();
	}
}

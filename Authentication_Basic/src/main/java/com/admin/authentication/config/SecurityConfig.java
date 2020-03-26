package com.admin.authentication.config;

import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

public class SecurityConfig extends WebSecurityConfigurerAdapter {
    public static final String REALM_NAME = "sonnguyen";

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.csrf().
                disable().
                authorizeRequests().
                anyRequest().authenticated().
                and().httpBasic().realmName(REALM_NAME).authenticationEntryPoint(new CustomAuthenticationEntryPoint());
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        super.configure(auth);
    }

}

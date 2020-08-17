package com.iosoft2020.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.iosoft2020.service.UserService;

@Configurable
@EnableWebSecurity
//@EnableGlobalMethodSecurity(securedEnabled = true)
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Bean
    public BCryptPasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Autowired
    private UserService userDetailsService;

    @Override
    public void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(userDetailsService).passwordEncoder(passwordEncoder());

        //        auth.inMemoryAuthentication().withUser("admin").password("{noop}123").roles("USER");
    }

    @Override
    public void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests().antMatchers("/", "/login.html", "/login", "/webjars/**").permitAll()
                .antMatchers("/**")
                .hasAnyRole("USER", "ADMIN").anyRequest().authenticated()
                .and()
                .formLogin().loginPage("/login.html")
                .loginProcessingUrl("/login")
                .defaultSuccessUrl("/menu.html")
                .failureUrl("/login?error=true")
                .permitAll().and().logout().logoutUrl("/logout")
                .logoutSuccessUrl("/login.html")
                .invalidateHttpSession(true)
                .permitAll().and().csrf().disable();

    }

}


package com.jc.elementos.controller;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
@Configuration

@EnableWebMvc

@ComponentScan("com.jc.elementos.controller")

public class WebApConfig extends WebMvcConfigurerAdapter {
    
}

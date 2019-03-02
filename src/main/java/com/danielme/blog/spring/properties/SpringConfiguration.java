package com.danielme.blog.spring.properties;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:config.properties")
@ComponentScan("com.danielme.blog.spring.properties")
public class SpringConfiguration {

}

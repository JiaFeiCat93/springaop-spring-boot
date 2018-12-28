package com.qetch.springaop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@EnableAutoConfiguration
@SpringBootApplication
public class SpringAOPApplication { // extends SpringBootServletInitializer - used with external Tomcat

	public static void main(String[] args) throws Exception {
		SpringApplication.run(SpringAOPApplication.class, args);
	}

	/**
	 * The following code is needed to be used with external Tomcat.
	 */
	/*@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(SpringAOPApplication.class);
	}*/
	
}

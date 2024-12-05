package com.FinfirmProject.FinfirmProject;
import jakarta.servlet.Filter;
import jakarta.servlet.Servlet;
import org.apache.wicket.protocol.http.WicketFilter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ServletComponentScan
@ComponentScan(basePackages = "com.FinfirmProject.FinfirmProject") // Make sure the scan is correct
public class FinfirmProjectApplication {
	private static final Logger log = LoggerFactory.getLogger(FinfirmProjectApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(FinfirmProjectApplication.class, args);
		log.info("Application started :: ");
	}

	@Bean
	public ServletRegistrationBean wicketFilter() {
		ServletRegistrationBean registration = new ServletRegistrationBean((Servlet) new WicketFilter(), "/wicket/*");
		registration.addInitParameter("applicationClassName", WicketApplication.class.getName());
		registration.setName("WicketFilter");
		return registration;
	}

}
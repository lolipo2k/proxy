package com.github.novicezk.midjourney;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
import org.springframework.scheduling.annotation.EnableScheduling;
import spring.config.BeanConfig;
import spring.config.WebMvcConfig;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@EnableScheduling
@SpringBootApplication
@Import({BeanConfig.class, WebMvcConfig.class})
public class ProxyApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProxyApplication.class, args);
	}

	@Bean
    public WebMvcConfigurer configure() {
            return new WebMvcConfigurer() {
    @Override
    public void addCorsMappings(CorsRegistry reg) {
            reg.addMapping("/**").allowedOrigins("*");
   }
  };
  
 }

}

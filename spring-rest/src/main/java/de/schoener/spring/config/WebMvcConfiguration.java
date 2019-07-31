package de.schoener.spring.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

import de.schoener.spring.PackageScanner;

@Configuration
@EnableWebMvc
@ComponentScan(basePackageClasses = { PackageScanner.class })
public class WebMvcConfiguration extends WebMvcConfigurationSupport {
}

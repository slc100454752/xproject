package com.slc.XProject;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class})
@MapperScan(basePackages = { "com.slc.XProject.mapper" }, sqlSessionFactoryRef = "sqlSessionFactory")
@Configuration
@EnableAutoConfiguration
public class XProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(XProjectApplication.class, args);
	}
}

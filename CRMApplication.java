package com;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.github.pagehelper.autoconfigure.PageHelperAutoConfiguration;

@SpringBootApplication(exclude = PageHelperAutoConfiguration.class)
@MapperScan("com.dao")
public class CRMApplication {
	public static void main(String[] args) {
		SpringApplication.run(CRMApplication.class, args);
	}
}

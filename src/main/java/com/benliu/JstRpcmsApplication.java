package com.benliu;

import java.util.Arrays;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootApplication(scanBasePackages = {"com.benliu"})
@MapperScan({"com.benliu.mapper"})
public class JstRpcmsApplication {

	public static void main(String[] args) {
		
		ApplicationContext ctx = SpringApplication.run(JstRpcmsApplication.class, args);
		
		if(log.isDebugEnabled()) {
			String[] beanNames = ctx.getBeanDefinitionNames();
	        Arrays.parallelSort(beanNames);
	        for (String beanName : beanNames) {
	            log.debug(beanName);
	        }
		}
	}

}

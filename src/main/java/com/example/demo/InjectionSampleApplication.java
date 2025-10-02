package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.example.Example;

@SpringBootApplication
public class InjectionSampleApplication {
	/** 起動 */
	public static void main(String[] args) {
		SpringApplication.run(InjectionSampleApplication.class, args)
				.getBean(InjectionSampleApplication.class).exe();
	}

	/** DI */
	@Autowired
	private Example example;

	/** 実行 */
	private void exe() {
		example.run();
	}
}

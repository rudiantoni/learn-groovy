package com.example.myapps.restgroovy

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

import java.util.stream.Collectors

@SpringBootApplication
class RestGroovyApplication {

	static void main(String[] args) {
		def List<Integer> teste = [1, 2, 3, 4, 5]
		println teste

		println teste.stream().filter {it == 4}.collect(Collectors.toList())

		SpringApplication.run(RestGroovyApplication, args)
	}

}

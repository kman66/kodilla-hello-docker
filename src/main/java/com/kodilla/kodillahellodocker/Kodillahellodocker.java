package com.kodilla.kodillahellodocker;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class Kodillahellodocker {

	@GetMapping
	public String hello(@RequestParam Optional<String> name) {
		return name.map(n -> "Hello " + n + "!").orElse("Hello, World!");
	}
}

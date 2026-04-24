package dev.karavadir.api;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class CoreRestController {

	@GetMapping("/hello/{name}")
	public String sayHello(@PathVariable("name") String name) {
		return "Hello "+ name;
	}

	@GetMapping("/health")
	public String healthCheck() {
		return "OK";
	}
}

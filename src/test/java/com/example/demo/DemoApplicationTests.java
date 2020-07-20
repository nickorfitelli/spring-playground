package com.example.demo;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.WebRequest;
import java.util.Map;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoApplicationTests {

	@GetMapping("/math/pi")
	public double getIndex() {
		return 3.141592653589793;
	}

}
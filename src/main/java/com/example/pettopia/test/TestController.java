package com.example.pettopia.test;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@Slf4j
public class TestController {
	@GetMapping("/index")
	public String getMethodName() {
		return "index";
	}
	

	@GetMapping("/calendar")
	public String calendar() {
		return "calendar";
	}
	
	
	
	
}
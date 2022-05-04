package com.example.demo.controller;

import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class SpringJnkController {

	
	public static org.slf4j.Logger logger= LoggerFactory.getLogger(SpringJnkController.class);
	
	public String getMessage() {return "message sent";}
}

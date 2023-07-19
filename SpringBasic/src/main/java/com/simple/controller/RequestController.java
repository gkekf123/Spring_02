package com.simple.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

// 주제별로 하나씩 만들어 진다
@Controller("/request") // 각 메서드의 공통분모
public class RequestController {

	@RequestMapping("/req_ex01") // == "/request/req_ex01"
	public String ex01 () {
		
		return "request/req_ex01";
	}
	
	@RequestMapping("/basic1")
	public void basic1() {
		System.out.println("basic요청");
	}
	
}

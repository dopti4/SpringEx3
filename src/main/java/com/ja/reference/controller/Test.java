package com.ja.reference.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/test/*")
public class Test {
	
	//@RequestMapping("/test1")
	//@PostMapping("/test1")		//get방식 ㄴㄴ post방식으로 하고싶을 때
	@GetMapping						//get방식으로 할 때
	public String test1() {
		
		System.out.println("안녕1");
		
		return "test1";
	}
	
	@RequestMapping("/test2")
	public String test2(HttpSession session) {		//세션 객체 받을 수 있다!
		
		//session.invalidate();
		session.setAttribute("xxx", 1111);
		session.getAttribute("xxx");
		
		return "test1";
	}
	
	@RequestMapping("/test3")
	public String test3(Model model) {				//Model 객체 이용해서 셋어트리뷰트 가능
		
		String title = "제목입니다";
		
		model.addAttribute("title", title);			//사실상 request.setAttribute처럼 담아서 jsp로 포워딩
		
		
		return "test1";
	}
}

package com.ja.reference.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ja.reference.vo.MemberVo;

@Controller
@RequestMapping("/board/*")
public class MappingTest2 {
	
	@RequestMapping("/test1")
	public String test1(HttpServletRequest request) {
		
		String aa = request.getParameter("aa");
		String bb = request.getParameter("bb");
		
		System.out.println("안녕1" + aa + bb);
		
		return "test1";
	}
	
	@RequestMapping("/test2")
	public String test2(int aa, int bb) {		//request 객체 쓸 필요없이 매개변수 세팅 해주면 끝(이 방식으로 간다).
		
		System.out.println("안녕2" + aa + bb);
		
		return "test1";
	}
	
	@RequestMapping("/test3")
	public String test3(
					@RequestParam("aa") int v1,	//변수명이랑 url이랑 이름 다르게 지정하고 싶을 때! 
					@RequestParam("bb") int v2) {
		
		System.out.println("안녕3" + v1 + v2);
		
		return "test1";
	}
	
	@RequestMapping("/test4")
	public String test4(MemberVo vo) {		//매개변수 하나하나 쓸 필요없이 VO에 생성해주고 넣어주면 끝.
		
		System.out.println(vo.getM_id());
		System.out.println(vo.getM_pw());
		System.out.println(vo.getM_nick());
		
		return "test1";
	}
	
	@RequestMapping("/test5/{pid}/{xxx}")	//? 안 쓰고 값만 넣고 싶을 때(명령어로 들어온 값을 매개변수에 세팅해주겠다.)
	public String test5(
					@PathVariable("pid") int pid, 
					@PathVariable("xxx") int xxx) {
		
		System.out.println(pid);
		System.out.println(xxx);
		
		return "test1";
	}
	
}

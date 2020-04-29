package com.ja.reference.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller						//어노테이션 해주고~
@RequestMapping("/member/*")	//이렇게 해주면 /member/test1 이런식으로 모든 url 앞에 member 붙이면 된다.
public class MappingTest {
	
	@RequestMapping("/test1")	//매핑도 해주고~(url 명령 받으면 실행)
	public void test1() {
		System.out.println("안녕1");
	}
	
	@RequestMapping("/test2")	//핸들러 통해서 포워딩 해주는 걸 리퀘스트매핑으로 처리하면 끝.
	public String test2() {		//리턴타입 String으로 해주고 리턴 jsp 해주면 된다. 
		System.out.println("안녕2");
		
		return "test1";
	}
	
	//리다이렉트 쓰는 법 저번이랑 똑같다.
	@RequestMapping("/test3")	//test3 실행 - test2 실행 - test1으로 포워딩 - test1.jsp 출력
	public String test3() {
		System.out.println("안녕3");
		
		return "redirect:./test2";
	}
	
	@RequestMapping("/member/test4")
	public String test4() {
		System.out.println("안녕4");
		
		return "test1";
	}
	
}

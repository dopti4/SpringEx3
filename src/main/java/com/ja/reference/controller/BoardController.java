package com.ja.reference.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ja.reference.service.BoardService;
import com.ja.reference.vo.BoardVo;

@Controller
@RequestMapping("/board/*")
public class BoardController {
	
	@Autowired			//서비스 주입
	private BoardService boardService;
	
	@RequestMapping("/read_content_page.do")
	public String xxxxx(int b_no, Model model) {
		
		//서비스에 만든 메소드 실행.
		BoardVo boardVo = boardService.getContent(b_no);
		
		//model에 담아서 날린다.
		model.addAttribute("boardVo", boardVo);
		
		return "read_content_page";
	}
	
	
	
	//그냥 한 번 해본 거
	@RequestMapping("/insert_content_process.do")
	public void tttt(BoardVo aaa) {
		
		boardService.insertContent(aaa);
		System.out.println(aaa);
		
	}
	
}

package com.ja.reference.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ja.reference.mapper.BoardSQLMapper;
import com.ja.reference.vo.BoardVo;

@Service		//컨트롤러에 주입이 돼야하니 어노테이션 서비스
public class BoardService {			//이름 좀 추상적이게
	
	@Autowired
	private BoardSQLMapper boardSQLMapper;
	
	//리턴 타입 VO
	public BoardVo getContent(int b_no) {
		
		//DB 연동
		return boardSQLMapper.selectByNo(b_no);
		
		//return new BoardVo(1, 2, "안녕", "내용", null, 0);
		
	}
	
	
	//그냥 혼자 한 번~~
	public void insertContent(BoardVo aaa) {
		
		boardSQLMapper.insert(aaa);
		
	}
	
}

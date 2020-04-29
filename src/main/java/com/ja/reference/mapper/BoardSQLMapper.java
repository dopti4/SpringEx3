package com.ja.reference.mapper;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import com.ja.reference.vo.BoardVo;

//여긴 어노테이션 x
public interface BoardSQLMapper {
	
	
	//DAO 객체 만들자. 이걸로 끝
	@Select("SELECT * FROM FB_Board WHERE b_no = #{no}")	//#{}
	public BoardVo selectByNo(int no);
	
	@Select("SELECT * FROM FB_Board")
	public ArrayList<BoardVo> selectAll();
	
	@Insert("INSERT INTO FB_Board VALUES(FB_Board_seq.NEXTVAL, #{m_no}, #{b_title}, #{b_content}, SYSDATE)")
	public void insert(BoardVo xxx);	//매개변수에 Vo 넣어주면 된다. 거기에 다 있으니까.
}

package com.ja.reference.vo;

public class MemberVo {				//VO에는 어노테이션 안 붙인다!
	
	private int m_no;
	private String m_id;
	private String m_pw;
	private String m_nick;
	
	//기본 생성자 필수!
	public MemberVo() {
		super();
	}

	public MemberVo(int m_no, String m_id, String m_pw, String m_nick) {
		super();
		this.m_no = m_no;
		this.m_id = m_id;
		this.m_pw = m_pw;
		this.m_nick = m_nick;
	}

	public int getM_no() {
		return m_no;
	}

	public void setM_no(int m_no) {
		this.m_no = m_no;
	}

	public String getM_id() {
		return m_id;
	}

	public void setM_id(String m_id) {
		this.m_id = m_id;
	}

	public String getM_pw() {
		return m_pw;
	}

	public void setM_pw(String m_pw) {
		this.m_pw = m_pw;
	}

	public String getM_nick() {
		return m_nick;
	}

	public void setM_nick(String m_nick) {
		this.m_nick = m_nick;
	}
	
	
	
}

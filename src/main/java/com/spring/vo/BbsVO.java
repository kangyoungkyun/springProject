package com.spring.vo;

import java.util.Date;

/*
 * 
 *
 create table table_board(
    
		bid int not null auto_increment,
        subject varchar(200) not null,
        content text null,
        writer varchar(50) not null,
        regdate timestamp not null default now(),
        hit int default 0,
        primary key(bid)
    );
    
    insert into table_board(subject,content, writer) values('test subject', 'hello world', 'kang');
    
 *
 *
 */
 

public class BbsVO {
	
	private Integer bid;
	private String subject;
	private String content;
	private String writer;
	private Date regdate;
	private int hit;
	public Integer getUid() {
		return bid;
	}
	public void setUid(Integer uid) {
		this.bid = uid;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public Date getRegdate() {
		return regdate;
	}
	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}
	public int getHit() {
		return hit;
	}
	public void setHit(int hit) {
		this.hit = hit;
	}
	@Override
	public String toString() {
		return "BbsVO [bid=" + bid + ", subject=" + subject + ", content=" + content + ", writer=" + writer
				+ ", regdate=" + regdate + ", hit=" + hit + "]";
	}
	
	
	
}
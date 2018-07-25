package com.spring.vo;

/*
 db table 생성
create table member(
	uid varchar(50) not null,
    pwd varchar(50) not null,
    username varchar(50) not null,
    email varchar(100),
    regdate timestamp default now(),
    updateDate timestamp default now(),
    primary key(uid)
	);
    
*/



public class MemberVO {

	private String uid;
	private String pwd;
	private String username;
	private String email;
	private String regdate;
	private String updateDate;
	
	

	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getRegdate() {
		return regdate;
	}
	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}
	public String getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(String updateDate) {
		this.updateDate = updateDate;
	}

	@Override
	public String toString() {
		return "MemberVO [uid=" + uid + ", pwd=" + pwd + ", username=" + username + ", email=" + email + ", regdate="
				+ regdate + ", updateDate=" + updateDate + ", getUid()=" + getUid() + ", getPwd()=" + getPwd()
				+ ", getUsername()=" + getUsername() + ", getEmail()=" + getEmail() + ", getRegdate()=" + getRegdate()
				+ ", getUpdateDate()=" + getUpdateDate() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
}

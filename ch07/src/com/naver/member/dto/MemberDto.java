package com.naver.member.dto;

public class MemberDto {

	private String name;
	private String id;
	
	public MemberDto(){
		
	}
	public MemberDto(String name,String id){
		this.name=name;
		this.id=id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name =name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id =id;
	}
	@Override
	public String toString() {
		return "MemberDto [name=" + name + ", id=" + id + "]";
	}

	
	
	
	
}

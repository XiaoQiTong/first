package com.ran.entity;

import java.io.Serializable;

public class Student implements Serializable{

	private static final long serialVersionUID = 1L;

	private Long sNo;
	
	private String sName;
	
	private Integer sAge;
	
	private String sAddress;
	
	public Student() {
	}

	public Student(Long sNo, String sName, Integer sAge, String sAddress) {
		this.sNo = sNo;
		this.sName = sName;
		this.sAge = sAge;
		this.sAddress = sAddress;
	}

	public Long getsNo() {
		return sNo;
	}

	public void setsNo(Long sNo) {
		this.sNo = sNo;
	}

	public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}

	public Integer getsAge() {
		return sAge;
	}

	public void setsAge(Integer sAge) {
		this.sAge = sAge;
	}

	public String getsAddress() {
		return sAddress;
	}

	public void setsAddress(String sAddress) {
		this.sAddress = sAddress;
	}

	@Override
	public String toString() {
		return "Student [sNo=" + sNo + ", sName=" + sName + ", sAge=" + sAge + ", sAddress=" + sAddress + "]";
	}
	
	
}

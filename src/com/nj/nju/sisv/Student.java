package com.nj.nju.sisv;

public class Student extends Person {
	{
		this.setName("学生");
		this.setPwd("stu");
	}

	@Override
	public String toString() {
		return this.getName() + "  " + this.getPwd();
	}
}

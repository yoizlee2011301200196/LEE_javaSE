// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) ansi 
// Source File Name:   Person.java

package testReflection;

import java.io.Serializable;

public class Student extends Person implements Serializable {
	private static final long serialVersionUID = -6849794470710L;
	private int studentID;
	String hobby;
	public String school;

	public Student() {
		super();
	}

	public Student(int studentID) {
		super();
		this.studentID = studentID;
	}

	public Student(String name, int age, int studentID) {
		super(name, age);
		this.studentID = studentID;
	}

	public int getStudentID() {
		return studentID;
	}

	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}

	@Override
	public String toString() {
		return "Student ["+"name="+this.getName()+", age="+this.getAge()+", studentID=" + studentID + "]";
	}
}

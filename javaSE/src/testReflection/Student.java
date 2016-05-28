<<<<<<< HEAD
// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) ansi 
// Source File Name:   Person.java

package testReflection;

import java.io.PrintStream;

// Referenced classes of package testReflection:
//            Person

class Student extends Person
    implements Comparable
{

    public Student()
    {
    }

    public Student(int studentID)
    {
        this.studentID = studentID;
    }

    public Student(String name, int age, int studentID)
    {
        super(name, age);
        this.studentID = studentID;
    }

    public int getStudentID()
    {
        System.out.println(studentID);
        return studentID;
    }

    public void setStudentID(int studentID)
    {
        this.studentID = studentID;
    }

    public boolean equals(Object obj)
    {
        if(this == obj)
            return true;
        if(!super.equals(obj))
            return false;
        if(getClass() != obj.getClass())
            return false;
        Student other = (Student)obj;
        return studentID == other.studentID;
    }

    public String toString()
    {
        return (new StringBuilder("Student [studentID=")).append(studentID).append("]").toString();
    }

    public int compareTo(Object o)
    {
        if(o instanceof Student)
        {
            Student s = (Student)o;
            if(equals(s))
                return 0;
            else
                return studentID - s.getStudentID();
        } else
        {
            return -1;
        }
    }

    private int studentID;
=======
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
	
	
>>>>>>> 2ca98f20d34559ac9216771390bbc27988fef3f5
}

// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) ansi 
// Source File Name:   Student.java

package testLinkedHashSet;

import java.io.PrintStream;

// Referenced classes of package testLinkedHashSet:
//            Person, Birthday

public class Student extends Person
{

    public Student()
    {
    }

    public Student(String name, Birthday bornday, Integer age)
    {
        super(name, bornday, age);
    }

    public void speak(String word)
    {
        System.out.println(word);
    }

    public void sleep(Integer hour)
    {
        System.out.println((new StringBuilder("I sleeped ")).append(hour).append(" hours!").toString());
    }

    public void love()
    {
        System.out.println("I love LQ");
    }

    public String toString()
    {
        return (new StringBuilder("Student [getName()=")).append(getName()).append(", getBornday()=").append(getBornday().toString()).append(", getAge()=").append(getAge()).append("]").toString();
    }

    public int hashCode()
    {
        return super.hashCode();
    }

    public boolean equals(Object obj)
    {
        return super.equals(obj);
    }
}

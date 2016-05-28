// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) ansi 
// Source File Name:   TestLinkedHashSet.java

package testLinkedHashSet;

import java.io.PrintStream;
import java.util.*;

// Referenced classes of package testLinkedHashSet:
//            Student, Birthday, DateException

public class TestLinkedHashSet
{

    public TestLinkedHashSet()
    {
    }

    public void test1()
    {
        Set setStudents = new LinkedHashSet();
        try
        {
            setStudents.add(new Student("AA", new Birthday(Integer.valueOf(1993), Integer.valueOf(7), Integer.valueOf(1)), Integer.valueOf(23)));
            setStudents.add(new Student("CC", new Birthday(Integer.valueOf(1991), Integer.valueOf(1), Integer.valueOf(3)), Integer.valueOf(25)));
            setStudents.add(new Student("BB", new Birthday(Integer.valueOf(1993), Integer.valueOf(10), Integer.valueOf(17)), Integer.valueOf(23)));
            setStudents.add(new Student("DD", new Birthday(Integer.valueOf(1993), Integer.valueOf(3), Integer.valueOf(14)), Integer.valueOf(23)));
        }
        catch(DateException e)
        {
            System.out.println(e.getMessage());
        }
        System.out.println("set students 遍历方式1");
        Student stu;
        for(Iterator iterator = setStudents.iterator(); iterator.hasNext(); System.out.println(stu.toString()))
            stu = (Student)iterator.next();

        System.out.println("set students 遍历方式2");
        for(Iterator it = setStudents.iterator(); it.hasNext(); System.out.println(it.next()));
    }

    public void test2()
    {
        Set setStudents = new HashSet();
        try
        {
            setStudents.add(new Student("AA", new Birthday(Integer.valueOf(1993), Integer.valueOf(7), Integer.valueOf(1)), Integer.valueOf(23)));
            setStudents.add(new Student("CC", new Birthday(Integer.valueOf(1991), Integer.valueOf(1), Integer.valueOf(3)), Integer.valueOf(25)));
            setStudents.add(new Student("BB", new Birthday(Integer.valueOf(1993), Integer.valueOf(10), Integer.valueOf(17)), Integer.valueOf(23)));
            setStudents.add(new Student("DD", new Birthday(Integer.valueOf(1993), Integer.valueOf(3), Integer.valueOf(14)), Integer.valueOf(23)));
        }
        catch(DateException e)
        {
            System.out.println(e.getMessage());
        }
        System.out.println("set students 遍历方式1");
        Student stu;
        for(Iterator iterator = setStudents.iterator(); iterator.hasNext(); System.out.println(stu.toString()))
            stu = (Student)iterator.next();

        System.out.println("set students 遍历方式2");
        for(Iterator it = setStudents.iterator(); it.hasNext(); System.out.println(it.next()));
    }

    public void testdate()
    {
        System.out.println((new Date()).getYear() + 1900);
    }
}

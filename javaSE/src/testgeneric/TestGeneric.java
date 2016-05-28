// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) ansi 
// Source File Name:   TestGeneric.java

package testgeneric;

import java.io.PrintStream;
import java.util.*;

// Referenced classes of package generic:
//            GenericStatic, B

public class TestGeneric
{

    public TestGeneric()
    {
    }

    public void test1()
    {
        Set list1 = null;
        LinkedHashSet list2 = new LinkedHashSet();
        list2.add(Integer.valueOf(1));
        list2.add(Integer.valueOf(2));
        list2.add(Integer.valueOf(3));
        list1 = list2;
        Integer i;
        for(Iterator iterator = list1.iterator(); iterator.hasNext(); System.out.println(i.toString()))
            i = (Integer)iterator.next();

    }

    public void test3()
    {
        Set list1 = new LinkedHashSet();
        LinkedHashSet list2 = new LinkedHashSet();
        list2.add(Integer.valueOf(1));
        list2.add(Integer.valueOf(2));
        list2.add(Integer.valueOf(3));
        list1 = list2;
        Number i;
        for(Iterator iterator = list1.iterator(); iterator.hasNext(); System.out.println(i.toString()))
            i = (Number)iterator.next();

    }

    public void test4()
    {
        Set list1 = new LinkedHashSet();
        LinkedHashSet list2 = new LinkedHashSet();
        list2.add(Integer.valueOf(1));
        list2.add(Integer.valueOf(2));
        list2.add(Integer.valueOf(3));
        list1 = list2;
        Object i;
        for(Iterator iterator = list1.iterator(); iterator.hasNext(); System.out.println(i.toString()))
            i = iterator.next();

    }

    public void test2()
    {
        Set list1 = null;
        LinkedHashSet list2 = new LinkedHashSet();
        list2.add(Integer.valueOf(1));
        list2.add(Integer.valueOf(2));
        list2.add(Integer.valueOf(3));
        list1 = list2;
        Object i;
        for(Iterator iterator = list1.iterator(); iterator.hasNext(); System.out.println(i.toString()))
            i = iterator.next();

    }

    public void test5()
    {
        GenericStatic gStatic = new GenericStatic();
        GenericStatic.show(Integer.valueOf(1));
        GenericStatic.show("A");
        GenericStatic.show(Boolean.valueOf(true));
    }

    public void test6()
    {
        B b = new B();
        b.show();
        b.show("this is B");
    }
}

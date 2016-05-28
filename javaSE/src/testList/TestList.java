// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) ansi 
// Source File Name:   TestList.java

package testList;

import java.io.PrintStream;
import java.util.*;

import org.junit.Test;

// Referenced classes of package testList:
//            Person, Birthday, DateException

public class TestList
{

    @Test
    public void test1()
    {
        List list = new ArrayList();
        Person collPersons[] = new Person[3];
        try
        {
            collPersons[0] = new Person("AA", 23, new Birthday(Integer.valueOf(1993), Integer.valueOf(7), Integer.valueOf(1)));
            collPersons[1] = new Person("CC", 23, new Birthday(Integer.valueOf(1993), Integer.valueOf(10), Integer.valueOf(17)));
            collPersons[2] = new Person("BB", 25, new Birthday(Integer.valueOf(1991), Integer.valueOf(1), Integer.valueOf(3)));
        }
        catch(DateException e)
        {
            e.printStackTrace();
        }
        Collection coll = Arrays.asList(collPersons);
        list.addAll(coll);
        System.out.println("arraylist person 遍历方式1");
        Person p;
        for(Iterator iterator = list.iterator(); iterator.hasNext(); System.out.println(p.toString()))
            p = (Person)iterator.next();

        System.out.println("arraylist person 遍历方式2");
        for(Iterator it = list.iterator(); it.hasNext(); System.out.println(it.next()));
        System.out.println("arraylist person 遍历方式3");
        for(int i = 0; i < list.size(); i++)
            System.out.println(list.get(i));

        System.out.println("其他方法测试：");
        p = (Person)list.get(1);
        System.out.println(list.indexOf(p));
        System.out.println(list.lastIndexOf(p));
        try
        {
            list.add(new Person("DD", 50, new Birthday(Integer.valueOf(1966), Integer.valueOf(12), Integer.valueOf(12))));
        }
        catch(DateException e)
        {
            e.printStackTrace();
        }
        System.out.println(list.isEmpty());
        System.out.println(list.size());
        System.out.println(list.contains(p));
        System.out.println(list.remove(p));
        System.out.println(list.toString());
        System.out.println(list.subList(0, 2));
        Object obj[] = list.toArray();
        Object aobj[];
        int k = (aobj = obj).length;
        for(int j = 0; j < k; j++)
        {
            Object o = aobj[j];
            if(o instanceof Person)
            {
                Person per = (Person)o;
                System.out.println(per.toString());
            }
        }

    }
    @Test
    public void test2()
    {
        List list = new LinkedList();
        try
        {
            list.add(new Person("AA", 23, new Birthday(Integer.valueOf(1993), Integer.valueOf(7), Integer.valueOf(1))));
            list.add(new Person("CC", 23, new Birthday(Integer.valueOf(1993), Integer.valueOf(10), Integer.valueOf(17))));
            list.add(new Person("BB", 25, new Birthday(Integer.valueOf(1991), Integer.valueOf(1), Integer.valueOf(3))));
        }
        catch(DateException e)
        {
            e.printStackTrace();
        }
        Person p;
        for(Iterator iterator = list.iterator(); iterator.hasNext(); System.out.println(p.toString()))
            p = (Person)iterator.next();

    }
    @Test
    public void test3()
    {
        Vector vec = new Vector();
        try
        {
            vec.add(new Person("AA", 23, new Birthday(Integer.valueOf(1993), Integer.valueOf(7), Integer.valueOf(1))));
            vec.add(new Person("CC", 23, new Birthday(Integer.valueOf(1993), Integer.valueOf(10), Integer.valueOf(17))));
            vec.add(new Person("BB", 25, new Birthday(Integer.valueOf(1991), Integer.valueOf(1), Integer.valueOf(3))));
        }
        catch(DateException e)
        {
            e.printStackTrace();
        }
        System.out.println(vec.firstElement());
        System.out.println(vec.lastElement());
        Person p;
        for(Iterator iterator = vec.iterator(); iterator.hasNext(); System.out.println(p.toString()))
            p = (Person)iterator.next();

    }
}

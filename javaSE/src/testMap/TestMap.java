// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) ansi 
// Source File Name:   TestMap.java

package testMap;

import java.io.PrintStream;
import java.util.*;

// Referenced classes of package testMap:
//            Person, Birthday, DateException

public class TestMap
{

    public TestMap()
    {
    }

    public void test1()
    {
        HashMap map = new HashMap();
        try
        {
            map.put("1", new Person("BB", 23, new Birthday(Integer.valueOf(1993), Integer.valueOf(10), Integer.valueOf(17))));
            map.put("3", new Person("AA", 23, new Birthday(Integer.valueOf(1993), Integer.valueOf(7), Integer.valueOf(1))));
            map.put("e", new Person("DD", 50, new Birthday(Integer.valueOf(1966), Integer.valueOf(12), Integer.valueOf(12))));
            map.put("e", new Person("EE", 50, new Birthday(Integer.valueOf(1966), Integer.valueOf(12), Integer.valueOf(12))));
            map.put("4", new Person("CC", 49, new Birthday(Integer.valueOf(1967), Integer.valueOf(12), Integer.valueOf(11))));
        }
        catch(DateException e)
        {
            e.printStackTrace();
        }
        System.out.println("hashmap String-Person 遍历方式1");
        Set setStrings = map.keySet();
        String s;
        for(Iterator iterator = setStrings.iterator(); iterator.hasNext(); System.out.println((new StringBuilder(String.valueOf(s))).append("-->").append(map.get(s)).toString()))
            s = (String)iterator.next();

        System.out.println("hashmap String-Person 遍历方式2");
        Collection collection = map.values();
        Person p;
        for(Iterator iterator1 = collection.iterator(); iterator1.hasNext(); System.out.println(p.toString()))
            p = (Person)iterator1.next();

        System.out.println("hashmap String-Person 遍历方式3");
        Set entrys = map.entrySet();
        java.util.Map.Entry entry;
        for(Iterator iterator2 = entrys.iterator(); iterator2.hasNext(); System.out.println((new StringBuilder(String.valueOf((String)entry.getKey()))).append("-->").append(entry.getValue()).toString()))
            entry = (java.util.Map.Entry)iterator2.next();

    }

    public void test2()
    {
        HashMap map = new LinkedHashMap();
        try
        {
            map.put("1", new Person("BB", 23, new Birthday(Integer.valueOf(1993), Integer.valueOf(10), Integer.valueOf(17))));
            map.put("3", new Person("AA", 23, new Birthday(Integer.valueOf(1993), Integer.valueOf(7), Integer.valueOf(1))));
            map.put("2", new Person("DD", 50, new Birthday(Integer.valueOf(1966), Integer.valueOf(12), Integer.valueOf(12))));
            map.put("4", new Person("CC", 49, new Birthday(Integer.valueOf(1967), Integer.valueOf(12), Integer.valueOf(11))));
        }
        catch(DateException e)
        {
            e.printStackTrace();
        }
        System.out.println("hashmap String-Person 遍历方式1");
        Set setStrings = map.keySet();
        String s;
        for(Iterator iterator = setStrings.iterator(); iterator.hasNext(); System.out.println((new StringBuilder(String.valueOf(s))).append("-->").append(map.get(s)).toString()))
            s = (String)iterator.next();

        System.out.println("hashmap String-Person 遍历方式2");
        Collection collection = map.values();
        Person p;
        for(Iterator iterator1 = collection.iterator(); iterator1.hasNext(); System.out.println(p.toString()))
            p = (Person)iterator1.next();

        System.out.println("hashmap String-Person 遍历方式3");
        Set entrys = map.entrySet();
        java.util.Map.Entry entry;
        for(Iterator iterator2 = entrys.iterator(); iterator2.hasNext(); System.out.println((new StringBuilder(String.valueOf((String)entry.getKey()))).append("-->").append(entry.getValue()).toString()))
            entry = (java.util.Map.Entry)iterator2.next();

    }

    public void test3()
    {
        HashMap map = new HashMap();
        try
        {
            map.put(new Person("BB", 23, new Birthday(Integer.valueOf(1993), Integer.valueOf(10), Integer.valueOf(17))), "1");
            map.put(new Person("AA", 23, new Birthday(Integer.valueOf(1993), Integer.valueOf(7), Integer.valueOf(1))), "3");
            map.put(new Person("DD", 50, new Birthday(Integer.valueOf(1966), Integer.valueOf(12), Integer.valueOf(12))), "2");
            map.put(new Person("DD", 50, new Birthday(Integer.valueOf(1966), Integer.valueOf(12), Integer.valueOf(12))), "5");
            map.put(new Person("EE", 50, new Birthday(Integer.valueOf(1966), Integer.valueOf(12), Integer.valueOf(12))), "2");
            map.put(new Person("CC", 49, new Birthday(Integer.valueOf(1967), Integer.valueOf(12), Integer.valueOf(11))), "4");
        }
        catch(DateException e)
        {
            e.printStackTrace();
        }
        System.out.println("hashmap String-Person 遍历方式1");
        Set setStrings = map.keySet();
        Person s;
        for(Iterator iterator = setStrings.iterator(); iterator.hasNext(); System.out.println((new StringBuilder()).append(s).append("-->").append((String)map.get(s)).toString()))
            s = (Person)iterator.next();

        System.out.println("hashmap String-Person 遍历方式2");
        Collection collection = map.values();
        String p;
        for(Iterator iterator1 = collection.iterator(); iterator1.hasNext(); System.out.println(p.toString()))
            p = (String)iterator1.next();

        System.out.println("hashmap String-Person 遍历方式3");
        Set entrys = map.entrySet();
        java.util.Map.Entry entry;
        for(Iterator iterator2 = entrys.iterator(); iterator2.hasNext(); System.out.println((new StringBuilder()).append(entry.getKey()).append("-->").append((String)entry.getValue()).toString()))
            entry = (java.util.Map.Entry)iterator2.next();

    }
}

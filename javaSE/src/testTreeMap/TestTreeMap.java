// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) ansi 
// Source File Name:   TestTreeMap.java

package testTreeMap;

import java.io.PrintStream;
import java.util.*;

import org.junit.Test;

// Referenced classes of package testTreeMap:
//            Student, Person

public class TestTreeMap
{

    public TestTreeMap()
    {
    }
    @Test
    public void test1()
    {
        TreeMap treeMap = new TreeMap();
        treeMap.put(new Student("DD", Integer.valueOf(23), Integer.valueOf(3)), "wo");
        treeMap.put(new Student("DD", Integer.valueOf(23), Integer.valueOf(2)), "hh");
        treeMap.put(new Student("DD", Integer.valueOf(22), Integer.valueOf(3)), "gg");
        treeMap.put(new Student("BB", Integer.valueOf(23), Integer.valueOf(3)), "mm");
        System.out.println("treemap Student-String 遍历方式1");
        Set set = treeMap.keySet();
        Student s;
        for(Iterator iterator = set.iterator(); iterator.hasNext(); System.out.println((new StringBuilder(String.valueOf(s.toString()))).append("-->").append((String)treeMap.get(s)).toString()))
            s = (Student)iterator.next();

        System.out.println("treemap Student-String 遍历方式2");
        Collection collection = treeMap.values();
        String str;
        for(Iterator iterator1 = collection.iterator(); iterator1.hasNext(); System.out.println(str))
            str = (String)iterator1.next();

        System.out.println("treemap Student-String 遍历方式3");
        Set entrysEntries = treeMap.entrySet();
        java.util.Map.Entry entry;
        for(Iterator iterator2 = entrysEntries.iterator(); iterator2.hasNext(); System.out.println((new StringBuilder()).append(entry.getKey()).append("-->").append((String)entry.getValue()).toString()))
            entry = (java.util.Map.Entry)iterator2.next();

    }

    public void test2()
    {
        Comparator comparator = new Comparator() {
        	@Override
            public int compare(Object o1, Object o2)
            {
                if(o1 == o2)
                    return 0;
                if(o1 instanceof Person && o2 instanceof Person){
                	Person p1 = (Person)o1;
                	Person p2 = (Person)o2;
                	int nameres = p1.getName().compareTo(p2.getName());
                	if(nameres == 0)
                		return p1.getAge().compareTo(p2.getAge());
                	else
                		return nameres;
                }
                return -1;
            }
        };
        TreeMap treeMap = new TreeMap(comparator);
        treeMap.put(new Person("DD", Integer.valueOf(23)), "wo");
        treeMap.put(new Person("BB", Integer.valueOf(24)), "hh");
        treeMap.put(new Person("DD", Integer.valueOf(22)), "gg");
        treeMap.put(new Person("BB", Integer.valueOf(23)), "mm");
        System.out.println("treemap Person-String 遍历方式1");
        Set set = treeMap.keySet();
        Person p;
        for(Iterator it = set.iterator(); it.hasNext(); System.out.println((new StringBuilder(String.valueOf(p.toString()))).append("-->").append((String)treeMap.get(p)).toString()))
            p = (Person)it.next();

        System.out.println("treemap Person-String 遍历方式2");
        Collection collection = treeMap.values();
        for(Iterator itString = collection.iterator(); itString.hasNext(); System.out.println((String)itString.next()));
        System.out.println("treemap Person-String 遍历方式3");
        Set sets = treeMap.entrySet();
        java.util.Map.Entry entry;
        for(Iterator itEntry = sets.iterator(); itEntry.hasNext(); System.out.println((new StringBuilder()).append(entry.getKey()).append("-->").append((String)entry.getValue()).toString()))
            entry = (java.util.Map.Entry)itEntry.next();

    }
}

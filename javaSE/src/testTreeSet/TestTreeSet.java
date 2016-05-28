// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) ansi 
// Source File Name:   TestTreeSet.java

package testTreeSet;

import java.io.PrintStream;
import java.util.*;

import org.junit.Test;

// Referenced classes of package testTreeSet:
//            Person, Goods

public class TestTreeSet
{
    @Test
    public void test1()
    {
        TreeSet setString = new TreeSet();
        setString.add("AA");
        setString.add("CC");
        setString.add("BB");
        System.out.println("String treeset 遍历方式1");
        String s;
        for(Iterator iterator1 = setString.iterator(); iterator1.hasNext(); System.out.println(s))
            s = (String)iterator1.next();

        System.out.println("String treeset 遍历方式2");
        for(Iterator iterator = setString.iterator(); iterator.hasNext(); System.out.println((String)iterator.next()));
    }
    @Test
    public void test2()
    {
        TreeSet setPersons = new TreeSet();
        setPersons.add(new Person("AA", Integer.valueOf(12)));
        setPersons.add(new Person("DD", Integer.valueOf(16)));
        setPersons.add(new Person("CC", Integer.valueOf(12)));
        setPersons.add(new Person("BB", Integer.valueOf(14)));
        setPersons.add(new Person("CC", Integer.valueOf(14)));
        System.out.println("setPerson 遍历方式1");
        Person p;
        for(Iterator iterator = setPersons.iterator(); iterator.hasNext(); System.out.println(p.toString()))
            p = (Person)iterator.next();

        System.out.println("setPerson 遍历方式2");
        for(Iterator it = setPersons.iterator(); it.hasNext(); System.out.println(((Person)it.next()).toString()));
    }
    @Test
    public void test3()
    {
        Comparator comparator = new Comparator() {
        	@Override
            public int compare(Object o1, Object o2)
            {
            	if(o1 instanceof Goods && o2 instanceof Goods){
            		Goods g1 = (Goods)o1;
            		Goods g2 = (Goods)o2;
            		int nameres = g1.getName().compareTo(g2.getName());
            		if(nameres == 0)
            		{
            			int productdateres = g1.getProductDate().compareTo(g2.getProductDate());
            			if(productdateres == 0)
            				return g1.getLimitday().compareTo(g2.getLimitday());
            			else
            				return productdateres;
            		} else
            		{
            			return nameres;
            		}     		
            	}
            	return -1;
            }
        };
        TreeSet setGood = new TreeSet(comparator);
        setGood.add(new Goods("EE", new Date(1993, 7, 1), Integer.valueOf(12)));
        setGood.add(new Goods("BB", new Date(1993, 8, 1), Integer.valueOf(12)));
        setGood.add(new Goods("EE", new Date(1993, 7, 1), Integer.valueOf(24)));
        setGood.add(new Goods("BB", new Date(1993, 7, 1), Integer.valueOf(12)));
        System.out.println("set Goods 遍历方式1");
        Goods g;
        for(Iterator iterator = setGood.iterator(); iterator.hasNext(); System.out.println(g.toString()))
            g = (Goods)iterator.next();

        System.out.println("set Goods 遍历方式2");
        for(Iterator it = setGood.iterator(); it.hasNext(); System.out.println(it.next()));
    }
    @Test
    public void testdate()
    {
        Date date = new Date(1993, 7, 1, 10, 50, 59);
        System.out.println(date.toString());
        Date date2 = new Date();
        date2.setYear(1993);
        date2.setMonth(7);
        date2.setDate(1);
        System.out.println(date2.toString());
        Date date3 = new Date();
        System.out.println(date3.toString());
    }
}

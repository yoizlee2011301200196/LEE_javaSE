// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) ansi 
// Source File Name:   TestReflection.java

package testReflection;

import java.io.PrintStream;
import java.lang.reflect.*;
import java.util.Scanner;

import org.junit.Test;

// Referenced classes of package testReflection:
//            PrintClass, Student

public class TestReflection
{
	@Test
    public void test1()
    {
        System.out.println("Input the name of a class:");
        Scanner in = new Scanner(System.in);
        String classname = in.next();
        PrintClass.printClass(classname);
    }
	@Test
    public void test2()
    {
        Class class1;
        Student student1;
        class1 = Student.class;
        student1 = null;
        Student student3;
        Class class3;
        try
        {
            student1 = (Student)class1.newInstance();
        }
        catch(ReflectiveOperationException e)
        {
            e.printStackTrace();
        }
        System.out.println(student1.toString());
        System.out.println();
        String classnameString = "testReflection.Student";
        try
        {
            Class class2 = Class.forName(classnameString);
            try
            {
                Constructor constructor = class2.getConstructor(new Class[] {
                    Integer.TYPE
                });
                try
                {
                    Student student2;
					try {
						student2 = (Student)constructor.newInstance(new Object[] {
						    Integer.valueOf(12)
						});
						System.out.println(student2.toString());
					} catch (InstantiationException | IllegalArgumentException
							| InvocationTargetException e) {
						e.printStackTrace();
					}
                }
                catch(IllegalAccessException e)
                {
                    e.printStackTrace();
                }
            }
            catch(NoSuchMethodException e)
            {
                e.printStackTrace();
            }
            catch(SecurityException e)
            {
                e.printStackTrace();
            }
        }
        catch(ClassNotFoundException e)
        {
            e.printStackTrace();
        }
        System.out.println();
        student3 = new Student();
        class3 = student3.getClass();
        Method method1;
		try {
			method1 = class3.getMethod("getStudentID", new Class[0]);
			Field field;
			try {
				field = class3.getDeclaredField("studentID");
				field.setAccessible(true);
				try
				{
					field.set(student3, Integer.valueOf(3));
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
			} catch (NoSuchFieldException e1) {
				e1.printStackTrace();
			}
			try
			{
				method1.invoke(student3, new Object[0]);
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		} catch (NoSuchMethodException | SecurityException e1) {
			e1.printStackTrace();
		}
    }
}

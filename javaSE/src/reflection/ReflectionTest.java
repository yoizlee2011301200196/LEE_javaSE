// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) ansi 
// Source File Name:   ReflectionTest.java

package reflection;

import java.io.PrintStream;
import java.lang.reflect.*;
import java.util.Scanner;

public class ReflectionTest
{

    public ReflectionTest()
    {
    }

    public static void main(String args[])
    {
        String name;
        if(args.length > 0)
        {
            name = args[0];
        } else
        {
            Scanner in = new Scanner(System.in);
            System.out.println("Enter class name (e.g. java.util.Date): ");
            name = in.next();
        }
        try
        {
            Class cl = Class.forName(name);
            Class supercl = cl.getSuperclass();
            String modifiers = Modifier.toString(cl.getModifiers());
            if(modifiers.length() > 0)
                System.out.print((new StringBuilder(String.valueOf(modifiers))).append(" ").toString());
            System.out.print((new StringBuilder("class ")).append(name).toString());
            if(supercl != null && supercl != Object.class)
                System.out.print((new StringBuilder(" extends ")).append(supercl.getName()).toString());
            System.out.println("\n{\n");
            printConstructors(cl);
            System.out.println();
            printMethods(cl);
            System.out.println();
            printFields(cl);
            System.out.println("}");
        }
        catch(ClassNotFoundException e)
        {
            e.printStackTrace();
        }
        System.exit(0);
    }

    public static void printConstructors(Class cl)
    {
        Constructor constructors[] = cl.getDeclaredConstructors();
        Constructor aconstructor[];
        int k = (aconstructor = constructors).length;
        for(int i = 0; i < k; i++)
        {
            Constructor c = aconstructor[i];
            String name = c.getName();
            System.out.print("   ");
            String modifiers = Modifier.toString(c.getModifiers());
            if(modifiers.length() > 0)
                System.out.print((new StringBuilder(String.valueOf(modifiers))).append(" ").toString());
            System.out.print((new StringBuilder(String.valueOf(name))).append("(").toString());
            Class paramTypes[] = c.getParameterTypes();
            for(int j = 0; j < paramTypes.length; j++)
            {
                if(j > 0)
                    System.out.print(", ");
                System.out.print(paramTypes[j].getName());
            }

            System.out.println(");");
        }

    }

    public static void printMethods(Class cl)
    {
        Method methods[] = cl.getDeclaredMethods();
        Method amethod[];
        int k = (amethod = methods).length;
        for(int i = 0; i < k; i++)
        {
            Method m = amethod[i];
            Class retType = m.getReturnType();
            String name = m.getName();
            System.out.print("   ");
            String modifiers = Modifier.toString(m.getModifiers());
            if(modifiers.length() > 0)
                System.out.print((new StringBuilder(String.valueOf(modifiers))).append(" ").toString());
            System.out.print((new StringBuilder(String.valueOf(retType.getName()))).append(" ").append(name).append("(").toString());
            Class paramTypes[] = m.getParameterTypes();
            for(int j = 0; j < paramTypes.length; j++)
            {
                if(j > 0)
                    System.out.print(", ");
                System.out.print(paramTypes[j].getName());
            }

            System.out.println(");");
        }

    }

    public static void printFields(Class cl)
    {
        Field fields[] = cl.getDeclaredFields();
        Field afield[];
        int j = (afield = fields).length;
        for(int i = 0; i < j; i++)
        {
            Field f = afield[i];
            Class type = f.getType();
            String name = f.getName();
            System.out.print("   ");
            String modifiers = Modifier.toString(f.getModifiers());
            if(modifiers.length() > 0)
                System.out.print((new StringBuilder(String.valueOf(modifiers))).append(" ").toString());
            System.out.println((new StringBuilder(String.valueOf(type.getName()))).append(" ").append(name).append(";").toString());
        }

    }
}

// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) ansi 
// Source File Name:   TestReflection.java

package testReflection;

import java.io.PrintStream;
import java.lang.reflect.*;

class PrintClass
{

    public static void printClass(String classname)
    {
        try
        {
            Class class1 = Class.forName(classname);
            Class superClass = class1.getSuperclass();
            Class interfaces[] = class1.getInterfaces();
            String classmodifier = Modifier.toString(class1.getModifiers());
            if(classmodifier.length() > 0)
                System.out.print((new StringBuilder(String.valueOf(classmodifier))).append(" ").toString());
            System.out.print((new StringBuilder(String.valueOf(class1.getName()))).append(" ").toString());
            if(superClass != null)
                System.out.print((new StringBuilder("extends ")).append(superClass.getName()).toString());
            if(interfaces.length > 0)
            {
                System.out.print(" implements ");
                for(int i = 0; i < interfaces.length; i++)
                {
                    if(i > 0)
                        System.out.print(", ");
                    System.out.print(interfaces[i].getName());
                }

            }
            System.out.println(" {");
            System.out.println();
            printFields(class1);
            System.out.println();
            printConstructors(class1);
            System.out.println();
            printMethods(class1);
            System.out.println();
            System.out.println("}");
        }
        catch(ClassNotFoundException e)
        {
            e.printStackTrace();
        }
    }

    public static void printFields(Class class1)
    {
        Field field[] = class1.getDeclaredFields();
        for(int i = 0; i < field.length; i++)
        {
            String modifiers = Modifier.toString(field[i].getModifiers());
            if(modifiers.length() > 0)
                System.out.print((new StringBuilder(String.valueOf(modifiers))).append(" ").toString());
            System.out.println((new StringBuilder(String.valueOf(field[i].getType().toString()))).append(" ").append(field[i].getName()).append(";").toString());
        }

    }

    public static void printConstructors(Class class1)
    {
        Constructor constructors[] = class1.getDeclaredConstructors();
        for(int i = 0; i < constructors.length; i++)
        {
            String modifiers = Modifier.toString(constructors[i].getModifiers());
            if(modifiers.length() > 0)
                System.out.print((new StringBuilder(String.valueOf(modifiers))).append(" ").toString());
            System.out.print((new StringBuilder(String.valueOf(constructors[i].getName()))).append(" (").toString());
            Class parameters[] = constructors[i].getParameterTypes();
            for(int j = 0; j < parameters.length; j++)
            {
                if(j > 0)
                    System.out.print(", ");
                System.out.print(parameters[j].getName());
            }

            System.out.println(");");
        }

    }

    public static void printMethods(Class class1)
    {
        Method methods[] = class1.getDeclaredMethods();
        for(int i = 0; i < methods.length; i++)
        {
            String modifiers = Modifier.toString(methods[i].getModifiers());
            if(modifiers.length() > 0)
                System.out.print((new StringBuilder(String.valueOf(modifiers))).append(" ").toString());
            Class returnVals = methods[i].getReturnType();
            System.out.print((new StringBuilder(String.valueOf(returnVals.getName()))).append(" ").append(methods[i].getName()).append(" (").toString());
            Class parameters[] = methods[i].getParameterTypes();
            for(int j = 0; j < parameters.length; j++)
            {
                if(j > 0)
                    System.out.print(", ");
                System.out.print(parameters[j].getName());
            }

            System.out.println(");");
        }

    }
}

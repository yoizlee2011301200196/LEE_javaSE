// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) ansi 
// Source File Name:   TestException.java

package testException;

import java.io.PrintStream;

// Referenced classes of package exceptiontest:
//            MyException

public class TestException
{

    public TestException()
    {
    }

    public static void main(String args[])
    {
        System.out.println("test Exception");
    }

    public void test()
    {
        try
        {
            int a[] = new int[5];
            System.out.println(a[6]);
            throw new MyException("test myException");
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            e.printStackTrace();
        }
        catch(MyException e)
        {
            System.out.println(e.getMessage());
        }
        System.out.println("handle over");
    }
}

// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) ansi 
// Source File Name:   TestException.java

package exceptiontest;

import java.io.PrintStream;

class MyException extends Exception
{

    public MyException()
    {
    }

    public MyException(String msg)
    {
        super(msg);
        System.out.println("handle myException");
    }

    private static final long serialVersionUID = 0xfffffff416829584L;
}

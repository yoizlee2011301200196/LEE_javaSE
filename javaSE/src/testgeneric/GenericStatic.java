// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) ansi 
// Source File Name:   TestGeneric.java

package testgeneric;

import java.io.PrintStream;

// Referenced classes of package generic:
//            MyException

class GenericStatic
{

    GenericStatic()
    {
    }

    public static void show(Object t)
    {
        try
        {
            throw new MyException();
        }
        catch(MyException e)
        {
            System.out.println(t.toString());
        }
    }
}

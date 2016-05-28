// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) ansi 
// Source File Name:   TestStaticProxy.java

package testProxy;

import java.io.PrintStream;

// Referenced classes of package testProxy:
//            Function

class Proxyed
    implements Function
{

    Proxyed()
    {
    }

    public void action()
    {
        System.out.println("这是被代理类");
    }
}

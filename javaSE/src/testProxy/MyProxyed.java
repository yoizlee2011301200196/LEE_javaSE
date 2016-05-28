// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) ansi 
// Source File Name:   TestDynamicProxy.java

package testProxy;

import java.io.PrintStream;

// Referenced classes of package testProxy:
//            MyFunction

class MyProxyed
    implements MyFunction
{

    MyProxyed()
    {
    }

    public void myAction()
    {
        System.out.println("这是我的被代理类！");
    }
}

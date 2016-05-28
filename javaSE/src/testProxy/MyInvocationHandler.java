// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) ansi 
// Source File Name:   TestDynamicProxy.java

package testProxy;

import java.io.PrintStream;
import java.lang.reflect.*;

class MyInvocationHandler
    implements InvocationHandler
{

    MyInvocationHandler()
    {
    }

    public Object getProxy(Object object)
    {
        this.object = object;
        return Proxy.newProxyInstance(object.getClass().getClassLoader(), object.getClass().getInterfaces(), this);
    }

    public Object invoke(Object proxy, Method method, Object args[])
        throws Throwable
    {
        System.out.println("这是我的代理类");
        return method.invoke(object, args);
    }

    Object object;
}

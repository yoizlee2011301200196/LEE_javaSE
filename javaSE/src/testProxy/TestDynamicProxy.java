// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) ansi 
// Source File Name:   TestDynamicProxy.java

package testProxy;

import java.io.PrintStream;

// Referenced classes of package testProxy:
//            MyProxyed, MyInvocationHandler, MyFunction, Proxyed, 
//            Function

public class TestDynamicProxy
{

    public TestDynamicProxy()
    {
    }

    public static void main(String args[])
    {
        MyProxyed myProxyed = new MyProxyed();
        MyInvocationHandler myInvocationHandler = new MyInvocationHandler();
        MyFunction myFunction = (MyFunction)myInvocationHandler.getProxy(myProxyed);
        myFunction.myAction();
        System.out.println();
        Proxyed proxyed = new Proxyed();
        MyInvocationHandler myInvocationHandler2 = new MyInvocationHandler();
        Function function = (Function)myInvocationHandler2.getProxy(proxyed);
        function.action();
    }
}

// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) ansi 
// Source File Name:   TestStaticProxy.java

package testProxy;

import java.io.PrintStream;

// Referenced classes of package testProxy:
//            Function

class MyProxy
    implements Function
{

    public MyProxy(Function function)
    {
        this.function = function;
    }

    public void action()
    {
        System.out.println("这是代理类！");
        System.out.println("我可以调用被代理类的方法，也可以不调用！");
        System.out.println("下面我调用一下被代理类的方法，嘿嘿：");
        function.action();
    }

    Function function;
}

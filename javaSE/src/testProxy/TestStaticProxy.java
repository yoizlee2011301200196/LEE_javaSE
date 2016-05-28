// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) ansi 
// Source File Name:   TestStaticProxy.java

package testProxy;


// Referenced classes of package testProxy:
//            Proxyed, MyProxy

public class TestStaticProxy
{

    public TestStaticProxy()
    {
    }

    public static void main(String args[])
    {
        Proxyed proxyed = new Proxyed();
        MyProxy myProxy = new MyProxy(proxyed);
        myProxy.action();
    }
}

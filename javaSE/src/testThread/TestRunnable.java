// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) ansi 
// Source File Name:   TestRunnable.java

package testThread;


// Referenced classes of package testThread:
//            A

public class TestRunnable
{

    public TestRunnable()
    {
    }

    public static void main(String args[])
    {
        A a = new A();
        (new Thread(a)).start();
        (new Thread(a)).start();
    }

    public void test1()
    {
        A a = new A();
        (new Thread(a)).start();
        (new Thread(a)).start();
    }
}

// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) ansi 
// Source File Name:   TestThread.java

package testThread;


// Referenced classes of package testThread:
//            Account, Customer

public class TestThread
{

    public TestThread()
    {
    }

    public static void main(String args[])
    {
        Account account = new Account(Integer.valueOf(100));
        Customer cust1 = new Customer("A", Integer.valueOf(12), account);
        Customer cust2 = new Customer("B", Integer.valueOf(13), account);
        Customer cust3 = new Customer("C", Integer.valueOf(14), account);
        cust1.start();
        cust2.start();
        cust3.start();
    }
}

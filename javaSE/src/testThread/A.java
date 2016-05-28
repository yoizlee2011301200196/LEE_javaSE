// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) ansi 
// Source File Name:   TestRunnable.java

package testThread;

import java.io.PrintStream;

class A
    implements Runnable
{

    A()
    {
    }

    public synchronized void run()
    {
        for(; i < 20; i++)
        {
            System.out.println((new StringBuilder(String.valueOf(Thread.currentThread().getName()))).append(":").append(i).toString());
            try
            {
                Thread.currentThread();
                Thread.sleep(10L);
            }
            catch(InterruptedException e)
            {
                e.printStackTrace();
            }
        }

    }

    private int i;
}

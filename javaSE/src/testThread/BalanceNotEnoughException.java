// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) ansi 
// Source File Name:   TestThread.java

package testThread;


class BalanceNotEnoughException extends Exception
{

    public BalanceNotEnoughException()
    {
    }

    public BalanceNotEnoughException(String message)
    {
        super(message);
    }

    private static final long serialVersionUID = 0x2220b8280b9L;
}

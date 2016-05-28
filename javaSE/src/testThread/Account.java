// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) ansi 
// Source File Name:   TestThread.java

package testThread;


// Referenced classes of package testThread:
//            BalanceNotEnoughException

class Account
{

    public Account()
    {
    }

    public Account(Integer balance)
    {
        this.balance = balance;
    }

    public void withdraw(int money)
        throws BalanceNotEnoughException
    {
        if(balance.intValue() >= money)
            balance = Integer.valueOf(balance.intValue() - money);
        else
            throw new BalanceNotEnoughException();
    }

    public Integer getBalance()
    {
        return balance;
    }

    public void setBalance(Integer balance)
    {
        this.balance = balance;
    }

    public String toString()
    {
        return (new StringBuilder("Account [balance=")).append(balance).append("]").toString();
    }

    private Integer balance;
}

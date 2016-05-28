// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) ansi 
// Source File Name:   TestThread.java

package testThread;

import java.io.PrintStream;

// Referenced classes of package testThread:
//            Account, BalanceNotEnoughException

class Customer extends Thread
{

    public Customer()
    {
    }

    public Customer(String name, Integer age, Account account)
    {
        this.name = name;
        this.age = age;
        this.account = account;
    }
    
    public String getCustomerName()
    {
        return name;
    }

    public void setCustomerName(String name)
    {
        this.name = name;
    }

    public Integer getAge()
    {
        return age;
    }

    public void setAge(Integer age)
    {
        this.age = age;
    }

    public Account getAccount()
    {
        return account;
    }

    public void setAccount(Account account)
    {
        this.account = account;
    }

    public String toString()
    {
        return (new StringBuilder("Customer [name=")).append(name).append(", age=").append(age).append(", account=").append(account).append("]").toString();
    }

    private String name;
    private Integer age;
    private Account account;
}

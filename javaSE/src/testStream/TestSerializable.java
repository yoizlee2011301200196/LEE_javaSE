// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) ansi 
// Source File Name:   TestStream.java

package testStream;

import java.io.Serializable;

class TestSerializable
    implements Serializable
{

    public TestSerializable(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    public TestSerializable()
    {
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public String toString()
    {
        return (new StringBuilder("TestSerializable [name=")).append(name).append(", age=").append(age).append("]").toString();
    }

    String name;
    int age;
}

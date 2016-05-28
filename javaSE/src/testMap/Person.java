// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) ansi 
// Source File Name:   Person.java

package testMap;


// Referenced classes of package testMap:
//            Birthday

public class Person
{

    public Person()
    {
    }

    public Person(String name, int age, Birthday bornday)
    {
        this.name = name;
        this.age = age;
        this.bornday = bornday;
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

    public Birthday getBornday()
    {
        return bornday;
    }

    public void setBornday(Birthday bornday)
    {
        this.bornday = bornday;
    }

    public String toString()
    {
        return (new StringBuilder("Person [name=")).append(name).append(", age=").append(age).append(", bornday=").append(bornday).append("]").toString();
    }

    public int hashCode()
    {
        int prime = 31;
        int result = 1;
        result = 31 * result + age;
        result = 31 * result + (bornday != null ? bornday.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }

    public boolean equals(Object obj)
    {
        if(this == obj)
            return true;
        if(obj == null)
            return false;
        if(getClass() != obj.getClass())
            return false;
        Person other = (Person)obj;
        if(age != other.age)
            return false;
        if(bornday == null)
        {
            if(other.bornday != null)
                return false;
        } else
        if(!bornday.equals(other.bornday))
            return false;
        if(name == null)
        {
            if(other.name != null)
                return false;
        } else
        if(!name.equals(other.name))
            return false;
        return true;
    }

    private String name;
    private int age;
    private Birthday bornday;
}

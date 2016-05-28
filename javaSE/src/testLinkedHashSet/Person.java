// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) ansi 
// Source File Name:   Person.java

package testLinkedHashSet;


// Referenced classes of package testLinkedHashSet:
//            Birthday

public abstract class Person
{

    public Person()
    {
    }

    public Person(String name, Birthday bornday, Integer age)
    {
        this.name = name;
        this.bornday = bornday;
        this.age = age;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public Birthday getBornday()
    {
        return bornday;
    }

    public void setBornday(Birthday bornday)
    {
        this.bornday = bornday;
    }

    public Integer getAge()
    {
        return age;
    }

    public void setAge(Integer age)
    {
        this.age = age;
    }

    public abstract void speak(String s);

    public abstract void sleep(Integer integer);

    public abstract void love();

    public String toString()
    {
        return (new StringBuilder("Person [name=")).append(name).append(", bornday=").append(bornday.toString()).append(", age=").append(age).append("]").toString();
    }

    public int hashCode()
    {
        int prime = 31;
        int result = 1;
        result = 31 * result + (age != null ? age.hashCode() : 0);
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
        if(age == null)
        {
            if(other.age != null)
                return false;
        } else
        if(!age.equals(other.age))
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
    private Birthday bornday;
    private Integer age;
}

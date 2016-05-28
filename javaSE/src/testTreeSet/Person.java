// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) ansi 
// Source File Name:   Person.java

package testTreeSet;


public class Person
    implements Comparable
{

    public Person()
    {
    }

    public Person(String name, Integer age)
    {
        this.name = name;
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

    public Integer getAge()
    {
        return age;
    }

    public void setAge(Integer age)
    {
        this.age = age;
    }

    public String toString()
    {
        return (new StringBuilder("Person [name=")).append(name).append(", age=").append(age).append("]").toString();
    }

    public int hashCode()
    {
        int prime = 31;
        int result = 1;
        result = 31 * result + (age != null ? age.hashCode() : 0);
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
        if(name == null)
        {
            if(other.name != null)
                return false;
        } else
        if(!name.equals(other.name))
            return false;
        return true;
    }

    public int compareTo(Object o)
    {
        if(this == o)
            return 0;
        if(o instanceof Person)
        {
            Person p = (Person)o;
            int nameres = getName().compareTo(p.getName());
            if(nameres != 0)
                return nameres;
            else
                return getAge().compareTo(p.getAge());
        } else
        {
            return 0;
        }
    }

    private String name;
    private Integer age;
}

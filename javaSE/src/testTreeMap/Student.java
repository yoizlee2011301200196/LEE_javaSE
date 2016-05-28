// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) ansi 
// Source File Name:   Student.java

package testTreeMap;


// Referenced classes of package testTreeMap:
//            Person

public class Student extends Person
    implements Comparable
{

    public Student()
    {
    }

    public Student(String name, Integer age, Integer id)
    {
        super(name, age);
        this.id = id;
    }

    public Integer getId()
    {
        return id;
    }

    public void setId(Integer id)
    {
        this.id = id;
    }

    public int hashCode()
    {
        int prime = 31;
        int result = super.hashCode();
        result = 31 * result + (id != null ? id.hashCode() : 0);
        return result;
    }

    public boolean equals(Object obj)
    {
        if(this == obj)
            return true;
        if(!super.equals(obj))
            return false;
        if(getClass() != obj.getClass())
            return false;
        Student other = (Student)obj;
        if(id == null)
        {
            if(other.id != null)
                return false;
        } else
        if(!id.equals(other.id))
            return false;
        return true;
    }

    public String toString()
    {
        return (new StringBuilder("Student [id=")).append(id).append(", ").append(super.toString()).append("]").toString();
    }
    @Override
    public int compareTo(Object o)
    {
        if(this == o)
            return 0;
        if(o instanceof Student)
        {
        	Student s = (Student)o;
        	int idres = id.compareTo(s.getId());
        	if(idres == 0)
        	{
        		int nameres = getName().compareTo(s.getName());
        		if(nameres == 0)
        			return getAge().compareTo(s.getAge());
        		else
        			return nameres;
        	} else
        	{
        		return idres;
        	}
        }
        return -1;
    }

    private Integer id;

}

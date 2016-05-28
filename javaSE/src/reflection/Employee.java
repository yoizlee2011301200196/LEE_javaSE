// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) ansi 
// Source File Name:   Employee.java

package reflection;

import java.util.*;

public class Employee
{

    public Employee(String n, double s, int year, int month, int day)
    {
        name = n;
        salary = s;
        GregorianCalendar calendar = new GregorianCalendar(year, month - 1, day);
        hireday = calendar.getTime();
    }

    public String getName()
    {
        return name;
    }

    public double getSalary()
    {
        return salary;
    }

    public Date getHireday()
    {
        return hireday;
    }

    public void raiseSalary(double bypercent)
    {
        double raise = salary * bypercent;
        salary += raise;
    }

    public boolean equals(Object otherObject)
    {
        if(this == otherObject)
            return true;
        if(otherObject == null)
            return false;
        if(getClass() != otherObject.getClass())
            return false;
        Employee other = (Employee)otherObject;
        return Objects.equals(name, other.name) && salary == other.salary && Objects.equals(hireday, other.hireday);
    }

    public int hashCode()
    {
        return Objects.hash(new Object[] {
            name, Double.valueOf(salary), hireday
        });
    }

    public String toString()
    {
        return (new StringBuilder(String.valueOf(getClass().getName()))).append("[name=").append(name).append(",salary=").append(salary).append(",hireday=").append(hireday).append("]").toString();
    }

    private String name;
    private double salary;
    private Date hireday;
}

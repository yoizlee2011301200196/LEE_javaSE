// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) ansi 
// Source File Name:   Manager.java

package equals;


// Referenced classes of package equals:
//            Employee

public class Manager extends Employee
{

    public Manager(String n, double s, int year, int month, int day)
    {
        super(n, s, year, month, day);
        bonus = 0.0D;
    }

    public double getSalary()
    {
        return super.getSalary() + bonus;
    }

    public void setBonus(double b)
    {
        bonus = b;
    }

    public boolean equals(Object otherObject)
    {
        if(!super.equals(otherObject))
            return false;
        Manager other = (Manager)otherObject;
        return bonus == other.bonus;
    }

    public int hashCode()
    {
        return super.hashCode() + 17 * (new Double(bonus)).hashCode();
    }

    public String toString()
    {
        return (new StringBuilder(String.valueOf(super.toString()))).append("[bonus=").append(bonus).append("]").toString();
    }

    private double bonus;
}

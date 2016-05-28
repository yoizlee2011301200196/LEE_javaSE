// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) ansi 
// Source File Name:   Birthday.java

package testLinkedHashSet;

import java.util.Date;

// Referenced classes of package testLinkedHashSet:
//            DateException

public class Birthday
{

    public Birthday()
    {
    }

    public Birthday(Integer year, Integer month, Integer day)
        throws DateException
    {
        if(year.intValue() > 0 && year.intValue() <= 1900 + (new Date()).getYear())
            this.year = year;
        else
            throw new DateException("Input year wrongly!");
        if(month.intValue() > 0 && month.intValue() <= 12)
            this.month = month;
        else
            throw new DateException("Input month wrongly!");
        int monthday[] = {
            0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 
            31, 30, 31
        };
        if(year.intValue() > 0 && year.intValue() <= (new Date()).getYear() + 1900 && (year.intValue() % 4 == 0 && year.intValue() % 100 != 0 || year.intValue() % 400 == 0))
        {
            monthday[2] = 29;
            if(month.intValue() > 0 && month.intValue() <= 12)
                if(day.intValue() > 0 && day.intValue() <= monthday[month.intValue()])
                    this.day = day;
                else
                    throw new DateException("Input day wrongly!");
        } else
        {
            monthday[2] = 28;
            if(month.intValue() > 0 && month.intValue() <= 12)
                if(day.intValue() > 0 && day.intValue() <= monthday[month.intValue()])
                    this.day = day;
                else
                    throw new DateException("Input day wrongly!");
        }
    }

    public int hashCode()
    {
        int prime = 31;
        int result = 1;
        result = 31 * result + (day != null ? day.hashCode() : 0);
        result = 31 * result + (month != null ? month.hashCode() : 0);
        result = 31 * result + (year != null ? year.hashCode() : 0);
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
        Birthday other = (Birthday)obj;
        if(day == null)
        {
            if(other.day != null)
                return false;
        } else
        if(!day.equals(other.day))
            return false;
        if(month == null)
        {
            if(other.month != null)
                return false;
        } else
        if(!month.equals(other.month))
            return false;
        if(year == null)
        {
            if(other.year != null)
                return false;
        } else
        if(!year.equals(other.year))
            return false;
        return true;
    }

    public String toString()
    {
        return (new StringBuilder("Birthday [year=")).append(year).append(", month=").append(month).append(", day=").append(day).append("]").toString();
    }

    public Integer year;
    public Integer month;
    public Integer day;
}

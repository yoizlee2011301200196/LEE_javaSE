// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) ansi 
// Source File Name:   Goods.java

package testTreeSet;

import java.util.Date;

public class Goods
{

    public Goods()
    {
    }

    public Goods(String name, Date productDate, Integer limitday)
    {
        this.name = name;
        this.productDate = productDate;
        this.limitday = limitday;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public Date getProductDate()
    {
        return productDate;
    }

    public void setProductDate(Date productDate)
    {
        this.productDate = productDate;
    }

    public Integer getLimitday()
    {
        return limitday;
    }

    public void setLimitday(Integer limitday)
    {
        this.limitday = limitday;
    }

    public String toString()
    {
        return (new StringBuilder("Goods [name=")).append(name).append(", productDate=").append(productDate).append(", limitday=").append(limitday).append("]").toString();
    }

    public int hashCode()
    {
        int prime = 31;
        int result = 1;
        result = 31 * result + (limitday != null ? limitday.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (productDate != null ? productDate.hashCode() : 0);
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
        Goods other = (Goods)obj;
        if(limitday == null)
        {
            if(other.limitday != null)
                return false;
        } else
        if(!limitday.equals(other.limitday))
            return false;
        if(name == null)
        {
            if(other.name != null)
                return false;
        } else
        if(!name.equals(other.name))
            return false;
        if(productDate == null)
        {
            if(other.productDate != null)
                return false;
        } else
        if(!productDate.equals(other.productDate))
            return false;
        return true;
    }

    private String name;
    private Date productDate;
    private Integer limitday;
}

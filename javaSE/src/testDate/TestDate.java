// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) ansi 
// Source File Name:   TestDate.java

package testDate;

import java.io.PrintStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDate
{

    public TestDate()
    {
    }

    public void test1()
    {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        String str = sdf.format(Long.valueOf(System.currentTimeMillis()));
        System.out.println(str);
        Date date = null;
        try
        {
            date = sdf.parse(str);
        }
        catch(ParseException e)
        {
            e.printStackTrace();
        }
        System.out.println(date.toString());
    }
}

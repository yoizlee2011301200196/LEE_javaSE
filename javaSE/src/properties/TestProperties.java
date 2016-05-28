// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) ansi 
// Source File Name:   TestProperties.java

package properties;

import java.io.*;
import java.util.Properties;

public class TestProperties
{

    public TestProperties()
    {
    }

    public void test()
        throws FileNotFoundException, IOException
    {
        Properties pro = new Properties();
        pro.load(new FileInputStream("jdbc.properties"));
        System.out.println(pro.getProperty("user"));
        System.out.println(pro.getProperty("password"));
    }
}

// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) ansi 
// Source File Name:   TestEnum.java

package testenum;

import java.io.PrintStream;

import org.junit.Test;

// Referenced classes of package testenum:
//            Season, Season1, B

public class TestEnum
{

	@Test
    public void test1()
    {
        System.out.println(Season.SPRING.toString());
        Season season = Season.valueOf("SPRING");
        System.out.println(season.toString());
        season.show();
    }

	@Test
    public void test2()
    {
        System.out.println(Season1.SPRING.toString());
        Season s[] = Season.values();
        int j = s.length;
        for(int i = 0; i < j; i++)
        {
            Season se = s[i];
            System.out.println(se.toString());
        }
    }

	@Test
    public void test3()
    {
        B b = new B() {
            public void dis()
            {
                System.out.println("this is B");
            }
        };
        b.dis();
    }
}

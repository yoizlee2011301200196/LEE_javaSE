// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) ansi 
// Source File Name:   TestFinal.java

package finaltest;

import org.junit.Test;

import finaltest.C.D;


// Referenced classes of package finaltest:
//            C, EE, G

public class TestFinal
{

    public static void main(String args1[])
    {
    	
    }
    @Test
    public void test1()
    {
        C c = new C();
        D d = c.new D();
        d.show();
    }
    @Test
    public void test2()
    {
        G g = EE.method();
        g.show();
    }
}

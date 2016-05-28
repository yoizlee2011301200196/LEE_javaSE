// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) ansi 
// Source File Name:   TestFinal.java

package finaltest;

import java.io.PrintStream;

// Referenced classes of package finaltest:
//            G

class EE
{

    EE()
    {
    }

    public static G method()
    {
        return new G() {

            public void show()
            {
                System.out.println("这是类EE的内部匿名类！");
            }

        };
    }
}

// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) ansi 
// Source File Name:   TestFinal.java

package finaltest;

import java.io.PrintStream;

// Referenced classes of package finaltest:
//            G

class E
{

    E()
    {
    }

    public static G method()
    {
        class _cls1F
            implements G
        {

            public void show()
            {
                System.out.println("这是类E的方法内部类！");
            }

            _cls1F()
            {
            }
        }

        return new _cls1F();
    }
}

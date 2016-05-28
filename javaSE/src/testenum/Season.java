// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) ansi 
// Source File Name:   Season.java

package testenum;

import java.io.PrintStream;

// Referenced classes of package testenum:
//            A

enum Season implements A
{

    SPRING("SPRING"){
        public void show()
        {
            System.out.println("this is spring");
        }
    },
    SUMMER("SUMMER"){
        public void show()
        {
            System.out.println("this is summer");
        }
    },
    AUTUMN("AUTUMN"){
        public void show()
        {
            System.out.println("this is autumn");
        }
    },
    WINTER("WINTER"){
        public void show()
        {
            System.out.println("this is winter");
        }
    };
    private Season(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    private String name;

}

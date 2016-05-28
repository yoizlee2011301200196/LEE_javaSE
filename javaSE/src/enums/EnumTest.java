// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) ansi 
// Source File Name:   EnumTest.java

package enums;

import java.io.PrintStream;
import java.util.Scanner;

// Referenced classes of package enums:
//            Size

public class EnumTest
{

    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a Size: (SMALL, MEDIUM, LARGE, EXTRA_LARGE) ");
        String input = in.next().toUpperCase();
       
        Size size = Size.valueOf(input);
        System.out.println("size= " + size.getSize());
        in.close();
    }
}

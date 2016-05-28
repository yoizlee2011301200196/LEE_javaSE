// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) ansi 
// Source File Name:   EqualsTest.java

package equals;

import java.io.PrintStream;

// Referenced classes of package equals:
//            Employee, Manager

public class EqualsTest
{

    public EqualsTest()
    {
    }

    public static void main(String args[])
    {
        Employee alice1 = new Employee("Alice Adams", 75000D, 1987, 12, 15);
        Employee alice2 = alice1;
        Employee alice3 = new Employee("Alice Adams", 75000D, 1987, 12, 15);
        Employee bob = new Employee("Bob Brandson", 50000D, 1989, 10, 1);
        System.out.println((new StringBuilder("alice1 == alice2: ")).append(alice1 == alice2).toString());
        System.out.println((new StringBuilder("alice1 == alice3: ")).append(alice1 == alice3).toString());
        System.out.println((new StringBuilder("alice1.equals(alice3): ")).append(alice1.equals(alice3)).toString());
        System.out.println((new StringBuilder("alice1.equals(Bob): ")).append(alice1.equals(bob)).toString());
        System.out.println((new StringBuilder("bob.toString(): ")).append(bob).toString());
        Manager carl = new Manager("Carl Cracker", 80000D, 1987, 12, 15);
        Manager boss = new Manager("Carl Cracker", 80000D, 1987, 12, 15);
        boss.setBonus(5000D);
        System.out.println((new StringBuilder("boss.toString(): ")).append(boss).toString());
        System.out.println((new StringBuilder("carl.equals(boss): ")).append(carl.equals(boss)).toString());
        System.out.println((new StringBuilder("alice1.hashCode(): ")).append(alice1.hashCode()).toString());
        System.out.println((new StringBuilder("alice3.hashCode(): ")).append(alice3.hashCode()).toString());
        System.out.println((new StringBuilder("carl.hashCode(): ")).append(carl.hashCode()).toString());
        System.out.println((new StringBuilder("boss.hashCode(): ")).append(boss.hashCode()).toString());
    }
}

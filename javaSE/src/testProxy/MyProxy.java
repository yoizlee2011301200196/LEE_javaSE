// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) ansi 
// Source File Name:   TestStaticProxy.java

package testProxy;

import java.io.PrintStream;

// Referenced classes of package testProxy:
//            Function

class MyProxy
    implements Function
{

    public MyProxy(Function function)
    {
        this.function = function;
    }

    public void action()
    {
        System.out.println("���Ǵ����࣡");
        System.out.println("�ҿ��Ե��ñ�������ķ�����Ҳ���Բ����ã�");
        System.out.println("�����ҵ���һ�±�������ķ������ٺ٣�");
        function.action();
    }

    Function function;
}

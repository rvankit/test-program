package Inheritance;

class A1 {
    void MethodOne(){
        System.out.println(1);
    }
}


class B1 extends A1 {
    void MethodTwo(){
        System.out.println(2);
    }
}


class C1 extends B1
    {
        C1(){
            System.out.println(3);
        }

    }


public class TestInherit{
    public static void main(String[] args)
    {
        C1 c = new C1();
    }
}


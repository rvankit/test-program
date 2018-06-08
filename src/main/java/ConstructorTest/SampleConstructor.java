package ConstructorTest;

public class SampleConstructor {

    public SampleConstructor(){
        System.out.println("First Constructor");
    }

    public void Test(){
        System.out.println("Test Method");
    }

    public static void main(String[] args) {
        SampleConstructor sc = new SampleConstructor();
//        sc.Test();
    }
}

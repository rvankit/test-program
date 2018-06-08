package SampleProgram;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class TriangleComplete {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int b = a.nextInt();
        System.out.println("Enter your name : "+ b);

        for (int i=0;i<10;i++){
            for (int j=10;j>i;j--){
                System.out.print(" ");
            }
            int num = 2*i-1;
            for (int k=0;k<num;k++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
//        String a[] = {"Ankit","Gaurav","Amar","Sahil","Nishant"};
//        String s;
//        Arrays.sort(a);
//        for (int i=0;i<a.length-1;i++){
//            System.out.println(a[i]);
//        }


    }
}

package PracticeArray;

import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) {
        int a[] = {4,3,5,2,6,1};
        Arrays.sort(a);
        for (int s=0;s<a.length;s++){
            System.out.println(a[s]);
        }
    }
}

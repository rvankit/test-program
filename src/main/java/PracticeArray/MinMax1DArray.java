package PracticeArray;

public class MinMax1DArray {
    public static void main(String[] args) {
        int a[] = {6,2,3,4,5,1,7};
        int min=a[0];
        int max=a[0];
        for (int i=0;i<a.length;i++){
            if (a[i] < min){
                min = a[i];
            }
            if (a[i] > max){
                max = a[i];
            }
        }
        System.out.println("Max:" + max + "Min:"+ min);
    }
}

package PracticeArray;

public class SecondLargestElement {
//    Write a java program to find second largest element in an array of integers?
    public static void main(String[] args) {
        int a[] = {1,3,5,6,2,8,6,7};
        int firstLargest = a[0];
        int secondLargest = a[1];

        if (firstLargest>secondLargest){
            System.out.println("first is largest then second");
        }
        else {
            firstLargest = a[1];
            secondLargest = a[0];
        }
        for (int i=1;i<a.length-1;i++){
            for (int j=i+1;j<a.length;j++){
                if (a[i] > a[j]){
                    firstLargest = a[j];
                    secondLargest = a[i];
                }else{
                    firstLargest = a[i];
                    secondLargest = a[j];
                }
            }
        }
        System.out.println("First Largest Number: "+ firstLargest);
        System.out.println("Second Largest Number: "+ secondLargest);

    }
}

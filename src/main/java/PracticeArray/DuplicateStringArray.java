package PracticeArray;

public class DuplicateStringArray {
//    Write a java program to find duplicate elements in an array?
    public static void main(String[] args) {
        String a[] = {"Ankit", "Amar", "Nishant", "Gaurav", "Sahil","Ankit", "Gaurav"};
        for (int i=0;i<a.length-1;i++){
            for (int j=i+1;j<a.length;j++){
                if (a[i] == a[j]){
                    System.out.println("Duplicate string is:"+ a[j]);
                }
            }
        }
    }
}

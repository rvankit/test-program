package PracticeArray;

public class MinNumberArray {
    public static void main(String[] args) {
        int a[][]={{4,5,6},{7,8,9},{5,7,1}};
        int min=a[0][0];
        for (int i=0;i<a.length;i++){
            for (int j=0;j<a.length;j++){
            if (a[i][j]<min){
                min=a[i][j];
            }
            }
        }
        System.out.println(min);
    }
}


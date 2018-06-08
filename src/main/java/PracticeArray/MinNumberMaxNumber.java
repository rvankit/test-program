package PracticeArray;

public class MinNumberMaxNumber {
    public static void main(String[] args) {
        int a[][]={{4,5,6},{7,8,9},{5,7,1}};
        int min=a[0][0];
//        int max=a[0][0];
        int minRow;
        int minColumn=0;
        for (int i=0;i<a.length;i++){
            for (int j=0;j<a.length;j++){
                if (a[i][j]<min){
                    min=a[i][j];
                    minRow= i;
                    minColumn= j;
                    System.out.println("row:"+i + "column:" +j);
                }
            }
        }
        System.out.println(min);

        int k=0;
        int maxColumn=a[0][minColumn];
        while (k<3){
            if (a[k][minColumn]>maxColumn){
                maxColumn = a[k][minColumn];
            }
            k++;

        }
        System.out.println(maxColumn);
    }
}

package SampleProgram;

public class SortingArray {
    public static void main(String[] args) {
        int a[] = {2,3,4,5,1};
        for (int i=0;i<4;i++){
            for (int j=i+1;j<4;j++){
                if (a[i]<a[j]){
                    a[i] = a[i]+a[j];
                    a[j] = a[i]-a[j];
                    a[j] = a[i]-a[j];
                    System.out.println("minimum element is "+a[j]);
                }
            }

        }
    }
}

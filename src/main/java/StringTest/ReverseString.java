package StringTest;

public class ReverseString {
    public static void main(String[] args) {
        String str = "Rahul Singh";
        String tmp = "";

        for (int i=str.length()-1;i>=0;i--){
            tmp = tmp + str.charAt(i);
        }
        System.out.println(tmp);
    }
}

package TestJava;

public class ReverseString {
    public static void main(String[] args) {
        String a = "QA InfoTech Pvt. Ltd.";
        String b = "";
        for (int i=a.length()-1;i>=0;i--){
            b = b + a.charAt(i);
        }
        System.out.println(b);
    }
}

package StringTest;

public class ReverseAlternateWords {
    public static void main(String[] args) {
        String a = "Hike up your life";
        String s = "";
        for (int i=a.length()-1;i>=0;i--){
            s = s + a.charAt(i);
        }
        System.out.println(s);
    }
}

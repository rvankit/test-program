package ExceptionHandling;

public class ExceptionTest {
    public static void main(String[] args) {
        System.out.println("This line will execute");
        try {
            Integer I = new Integer("Test");
        }catch (Exception e){
            System.out.println(e);
        }
        System.out.println("This line will not execute");
    }
}

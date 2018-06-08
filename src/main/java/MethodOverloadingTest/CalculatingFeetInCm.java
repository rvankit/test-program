package MethodOverloadingTest;

public class CalculatingFeetInCm {
    public static void main(String[] args) {
    calcFeetAndInchesToCentimeters(1,1);
    System.out.println(calcFeetAndInchesToCentimeters(7,5));
    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches){
    if ((feet>=0)||(inches<=0)||(inches<= 12)){
        System.out.println("Invalid feet or inches");
     return -1;
    }
        double feetToInches;
        double inchesToCentimeter;
        double totalInches;
        feetToInches = feet * 12;
        totalInches = feetToInches + inches;
        inchesToCentimeter = totalInches*2.54;
        return inchesToCentimeter;
    }
}


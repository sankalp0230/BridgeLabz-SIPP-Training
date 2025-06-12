import java.util.Scanner;

public class KmToMilesConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter distance in kilometers: ");
        double kilometers = sc.nextDouble();
        double conversionFactor = 0.621371;
        double miles = kilometers * conversionFactor;
        System.out.println(kilometers + " kilometers = " + miles + " miles");
        sc.close();
    }
}

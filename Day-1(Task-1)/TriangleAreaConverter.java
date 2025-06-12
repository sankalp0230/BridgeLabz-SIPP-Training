
    
import java.util.Scanner;

public class TriangleAreaConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter base of the triangle (in cm): ");
        double base = scanner.nextDouble();

        System.out.print("Enter height of the triangle (in cm): ");
        double height = scanner.nextDouble();

        double areaCm = 0.5 * base * height;

        double areaInches = areaCm / 6.4516;

        System.out.printf("The area of the triangle is %.2f sq cm and %.2f sq in\n", areaCm, areaInches);

        scanner.close();
    }
}


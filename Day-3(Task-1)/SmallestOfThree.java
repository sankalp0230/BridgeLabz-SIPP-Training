import java.util.Scanner;

public class SmallestOfThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int first = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int second = scanner.nextInt();

        System.out.print("Enter the third number: ");
        int third = scanner.nextInt();

        if (first < second && first < third) {
            System.out.println("The first number is the smallest.");
        } else {
            System.out.println("The first number is NOT the smallest.");
        }
        scanner.close();
    }
}

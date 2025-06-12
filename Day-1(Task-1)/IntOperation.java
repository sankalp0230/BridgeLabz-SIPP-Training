import java.util.Scanner;

public class IntOperation{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter value of a: ");
        int a = scanner.nextInt();
        System.out.print("Enter value of b: ");
        int b = scanner.nextInt();
        System.out.print("Enter value of c: ");
        int c = scanner.nextInt();
       
        int result1 = a + b * c;       
        int result2 = a * b + c;       
        int result3 = c + a / b;       
        int result4 = a % b + c;      

        
        System.out.println("\nThe results of Int Operations are:");
        System.out.println("a + b * c = " + result1);
        System.out.println("a * b + c = " + result2);
        System.out.println("c + a / b = " + result3);
        System.out.println("a % b + c = " + result4);

       
        System.out.println("\nNote: *, /, and % have higher precedence than + or -");
        
        scanner.close();
    }
}

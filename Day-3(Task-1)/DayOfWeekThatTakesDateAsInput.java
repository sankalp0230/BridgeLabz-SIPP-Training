
import java.util.*;
public class DayOfWeekThatTakesDateAsInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the date (dd): ");
        int date = sc.nextInt();
        System.out.println("Enter the month (mm): ");
        int month = sc.nextInt();
        System.out.println("Enter the year (yyyy): ");
        int year = sc.nextInt();
        // Adjust month and year for Zeller's Congruence
        if (month < 3) {
            month += 12;
            year--;
        }   
        // Zeller's Congruence formula
        int k = year % 100; // The year within the century
        int j = year / 100; // The zero-based century (actually floor(year/100))
        int f = date + (13 * (month + 1)) / 5 +
                k + k / 4 + j / 4 - 2 * j;      
                int result = f % 7;
        String dayOfWeek = "";
        switch (result) {
            case 0:
                dayOfWeek = "Saturday";
                break;
                case 1:
                dayOfWeek = "Sunday";
                break;
            case 2:
                dayOfWeek = "Monday";
                break;          
            case 3:
                dayOfWeek = "Tuesday";
                break;
            case 4:
                dayOfWeek = "Wednesday";
                break;
            case 5:
                dayOfWeek = "Thursday";
                break;
            case 6:
                dayOfWeek = "Friday";
                break;  
            default:
                System.out.println("Invalid date input.");
                return;
                }
        System.out.println("The day of the week is: " + dayOfWeek);

    }
}
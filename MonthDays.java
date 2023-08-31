import java.util.*;
public class MonthDays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.print("Enter a year: ");
        int year = sc.nextInt();
        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        
        System.out.print("Enter a month (1-12): ");
        int month = sc.nextInt();
        
        int days = 0;
        switch (month) {
            case 1: // January
            case 3: // March
            case 5: // May
            case 7: // July
            case 8: // August
            case 10: // October
            case 12: // December
                days = 31;
                break;
            case 4: // April
            case 6: // June
            case 9: // September
            case 11: // November
                days = 30;
                break;
            case 2: // February
                days = isLeapYear ? 29 : 28;
                break;
            default:
                System.out.println("Invalid month entered.");
                sc.close();
                return;
        }
        
        System.out.println("Number of days in the specified month: " + days);
        if (month == 2) {
            if (isLeapYear) {
                System.out.println("It's a leap year. February has 29 days.");
            } else {
                System.out.println("It's not a leap year. February has 28 days.");
            }
        }
        
        sc.close();
    }
}

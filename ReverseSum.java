import java.util.Scanner;
public class ReverseSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int number = scan.nextInt();
        
        int reverse = 0;
        int sum = 0;
        int originalNumber = number;
        
        while (number > 0) {
            int digit = number % 10;
            reverse = reverse * 10 + digit;
            sum += digit;
            number /= 10;
        }
        
        System.out.println("Original number: " + originalNumber);
        System.out.println("Reverse number: " + reverse);
        System.out.println("Sum of digits: " + sum);
        
        scan.close();
    }
}

import java.util.Scanner;
public class NumberGuess {
    public static void main(String args[]) {
        int num = 25;
        int attempt = 0;
        int max_tries = 5;
        Scanner sc = new Scanner(System.in);

        while (attempt < max_tries) {
            System.out.println("attempt no " + attempt + " Enter the number in 1 to 100 to guess");
            int gnum = sc.nextInt();
            if (gnum > num && gnum <= 100) {
                System.out.println("Number is higher, try again");
            } else if (gnum < num && gnum >= 1) {
                System.out.println("The number is lesser, try again");
            } else if (gnum == num) {
                System.out.println("Success, you guessed the number correctly");
                break;
            } else {
                // Handle invalid input (out of range)
                System.out.println("Invalid input. Enter a number between 1 and 100.");
            }
            attempt++;
        }

    }
}


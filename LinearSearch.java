
import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

   
        System.out.print("Enter the length of the array: ");
        int length = scanner.nextInt();

        int[] arr = new int[length];

        for (int i = 0; i < length; i++) {
            System.out.print("Enter a value for index " + i + ": ");
            arr[i] = scanner.nextInt();
        }

        System.out.print("Enter the value to search for: ");
        int target = scanner.nextInt();
        
        int index = linearSearch(arr, target);

        if (index != -1) {
            System.out.println("The value " + target + " is found at index " + index);
        } else {
            System.out.println("The value " + target + " is not found in the array.");
        }

        scanner.close();
    }

    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i; 
            }
        }
        return 0; 
    }
}

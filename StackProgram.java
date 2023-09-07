import java.util.Scanner;

public class StackProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the stack: ");
        int size = scanner.nextInt();

        int[] stackArray = new int[size];
        int top = -1;

        boolean exit = false;
        while (!exit) {
            System.out.println("\nSelect an operation:");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    if (top < size - 1) {
                        System.out.print("Enter a value to push: ");
                        int value = scanner.nextInt();
                        stackArray[++top] = value;
                        System.out.println("Pushed " + value + " onto the stack");
                    } else {
                        System.out.println("Stack is full. Cannot push.");
                    }
                    break;
                case 2:
                    if (top >= 0) {
                        int poppedValue = stackArray[top--];
                        System.out.println("Popped " + poppedValue + " from the stack");
                    } else {
                        System.out.println("Stack is empty. Cannot pop.");
                    }
                    break;
                case 3:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }

        scanner.close();
        System.out.println("Exiting the program.");
    }
}
public class Calculation {
    public static void main(String[] args) {
        // Given numbers
        int num1 = 50;
        int num2 = 10;

        // Calculations
        int sum = num1 + num2;
        int product = num1 * num2;
        int difference = num1 - num2;
        double division = (double) num1 / num2;  
        int remainder = num1 % num2;

        // Printing results
        System.out.println("Sum= " + sum);
        System.out.println("Product= " + product);
        System.out.println("Difference= " + difference);
        System.out.println("Division= " + division);
        System.out.println("Remainder= " + remainder);
    }
}
class Swap {
    public static void main(String[] args) {
        // before swapping values
        int num1 = 5;
        int num2 = 7;

        // Swapping using a third variable
        int temp = num1;
        num1 = num2;
        num2 = temp;

        //swapped values
        System.out.println("After swapping:");
        System.out.println("num1= " + num1);
        System.out.println("num2= " + num2);
    }
}
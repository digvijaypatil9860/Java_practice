package Practice;

import java.util.ArrayList;
import java.util.Scanner;

public class ReverseArrayList{
    public static void main(String[] args) {
        
        ArrayList<Integer> arrayList= new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 5 values:");

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter value " + (i + 1) + ": ");
            int value = scanner.nextInt();
            arrayList.add(value);
        }
        
        System.out.println("ArrayList in reverse order:");
        
        for (int i= arrayList.size()-1;i>=0;i--) {
            System.out.println(arrayList.get(i)+ "");
        }

        scanner.close();
    }
}


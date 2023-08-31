import java.util.*;
public class DollarToRupee{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter amount in US Dollars (USD): ");
        double dollars = sc.nextDouble();
        
        double conversionRate = 82.5; 
        
        double rupees = dollars * conversionRate;
        
        System.out.println(dollars + " USD is equal to " + rupees + " INR");
        
        sc.close();
    }
}







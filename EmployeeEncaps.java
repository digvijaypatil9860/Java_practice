

import java.util.Scanner;
public class EmployeeEncaps {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Employee employee=new Employee();

        System.out.println("Enter the Emplyee id");
        employee.setId(sc.nextInt());
        sc.nextLine();
        System.out.println("Enter the employee name");
         employee.setName(sc.nextLine());
        
        System.out.println("Enter the emplyee salary");
       
         employee.setSalary(sc.nextDouble());
         System.out.println("Details of employee:"+"employee id="+employee.getId()+" employee name: "+employee.getName()+" employee salary:=" +employee.getSalary());
          sc.close();
    }
   
}
class Employee{
    private int employee_id;
    private String employee_name;
    private double employee_salary;
    
    public int getId(){
    return employee_id;
    }
    public String getName(){
        return employee_name;
    }
    public double getSalary(){
        return employee_salary;
    }
public void setId(int employee_id){
    this.employee_id=employee_id;
}
public void setName(String employee_name){
    this.employee_name=employee_name;
}
public void setSalary(double employee_salary){
    this.employee_salary=employee_salary;
}
}
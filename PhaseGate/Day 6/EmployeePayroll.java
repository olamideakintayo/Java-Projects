
// EmployeePayroll.java
import java.util.Scanner;
public class EmployeePayroll {
     static Scanner input = new Scanner(System.in);
    
public static void main(String[] args) {
int userInput;

	do {
		System.out.println("\n Welcome to SemiColon Employees Payroll");
		System.out.println("1. Add Employee Payroll");
		System.out.println("2. View Employees Payroll");
		System.out.println("3. Update Employee Payroll");
		System.out.println("4. Exit");
		userInput = input.nextInt();
		input.nextLine();
		
		switch(userInput) {
		case 1 -> Employee.addEmployeePayRoll();
		case 2 -> Employee.viewPayRoll();
           case 3 -> Employee.updatePayRoll();
           case 4 -> System.out.println("GoodBye!! Have a nice day!");
           default -> System.out.println("Invalid Option. Please try again "); 
           }
           } 
           while (userInput != 4); 
           }
		
		
}		
		
		
   

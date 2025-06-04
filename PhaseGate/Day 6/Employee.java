// Employee.java
import java.util.ArrayList;
import java.util.Scanner;

class Employee {
    static Scanner input = new Scanner(System.in);
    static ArrayList<Employee> employees = new ArrayList<>();

    String name;
    double hoursWorked;
    double hourlyPayRate;
    double federalTaxWithholdingRate;
    double stateTaxWithholdingRate;

    
    public Employee(String name, double hoursWorked, double hourlyPayRate, double federalTaxWithholdingRate, double stateTaxWithholdingRate) {
        this.name = name;
        this.hoursWorked = hoursWorked;
        this.hourlyPayRate = hourlyPayRate;
        this.federalTaxWithholdingRate = federalTaxWithholdingRate;
        this.stateTaxWithholdingRate = stateTaxWithholdingRate;
    }

    public String getName() {
        return name;
    }

    public void showPayRoll() {
        double grossPay = hoursWorked * hourlyPayRate;
        double federalTaxWithholding = grossPay * (federalTaxWithholdingRate / 100);
        double stateTaxWithholding = grossPay * (stateTaxWithholdingRate / 100);
        double totalDeduction = federalTaxWithholding + stateTaxWithholding;
        double netPay = grossPay - totalDeduction;

        System.out.println("\nEmployee name: " + name);
        System.out.printf("Hours Worked: %.2f\n", hoursWorked);
        System.out.printf("Pay Rate: $%.2f\n", hourlyPayRate);
        System.out.printf("Gross Pay: $%.2f\n", grossPay);
        System.out.println("Deductions:");
        System.out.printf("  Federal Withholding (%.1f%%): $%.2f\n", federalTaxWithholdingRate, federalTaxWithholding);
        System.out.printf("  State Withholding (%.1f%%): $%.2f\n", stateTaxWithholdingRate, stateTaxWithholding);
        System.out.printf("  Total Deduction: $%.2f\n", totalDeduction);
        System.out.printf("Net Pay: $%.2f\n", netPay);
    }

 public static void addEmployeePayRoll() {
    input.nextLine();

    String name;
    while (true) {
        System.out.print("Enter Employee Name: ");
        name = input.nextLine().trim();

        boolean duplicate = false;
        for (Employee employee : employees) {
            if (employee.getName().equalsIgnoreCase(name)) {
                System.out.println("Error: Employee with name '" + name + "' already exists. Please enter a different name.");
                duplicate = true;
                break;
            }
        }

        if (!duplicate) {
            break;
        }
    }

    double hoursWorked;
    while (true) {
        System.out.print("Enter number of hours worked in a week (max 40): ");
        hoursWorked = input.nextDouble();
        if (hoursWorked <= 40 && hoursWorked >= 0) {
            break;
        } else {
            System.out.println("Error: Hours worked must be between 0 and 40.");
        }
    }

    double hourlyPay;
    while (true) {
        System.out.print("Enter hourly pay rate: ");
        hourlyPay = input.nextDouble();
        if (hourlyPay >= 0) {
            break;
        } else {
            System.out.println("Error: Hourly pay must be non-negative.");
        }
    }

    double federalTax;
    while (true) {
        System.out.print("Enter federal tax withholding rate (0 - 1): ");
        federalTax = input.nextDouble();
        if (federalTax >= 0 && federalTax <= 1) {
            break;
        } else {
            System.out.println("Error: Federal tax rate must be between 0 and 1.");
        }
    }

    double stateTax;
    while (true) {
        System.out.print("Enter state tax withholding rate (0 - 1): ");
        stateTax = input.nextDouble();
        if (stateTax >= 0 && stateTax <= 1) {
            break;
        } else {
            System.out.println("Error: State tax rate must be between 0 and 1.");
        }
    }

    employees.add(new Employee(name, hoursWorked, hourlyPay, federalTax, stateTax));
    System.out.println("Employee added successfully.");
}

    public static void viewPayRoll() {
        if (employees.isEmpty()) {
            System.out.println("There are no employee records available.");
            return;
        }

        for (int i = 0; i < employees.size(); i++) {
            System.out.println("\nEmployee " + (i + 1));
            employees.get(i).showPayRoll();
        }
    }

    public static void updatePayRoll() {
        if (employees.isEmpty()) {
            System.out.println("There are no employee records to update.");
            return;
        }

        System.out.print("Enter the employee name to update: ");
        input.nextLine(); 
        String indexName = input.nextLine().trim();

        Employee foundEmployee = null;
        for (Employee employee : employees) {
            if (employee.getName().equalsIgnoreCase(indexName)) {
                foundEmployee = employee;
                break;
            }
        }

        if (foundEmployee == null) {
            System.out.println("Employee not found.");
            return;
        }

        System.out.print("Enter the new number of hours worked in a week: ");
        foundEmployee.hoursWorked = input.nextDouble();

        System.out.print("Enter the new hourly pay rate: ");
        foundEmployee.hourlyPayRate = input.nextDouble();

        System.out.print("Enter the new federal tax withholding rate: ");
        foundEmployee.federalTaxWithholdingRate = input.nextDouble();

        System.out.print("Enter the new state tax withholding rate: ");
        foundEmployee.stateTaxWithholdingRate = input.nextDouble();

        System.out.println("The Employee PayRoll has been updated");
    }
}

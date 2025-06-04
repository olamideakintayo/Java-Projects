// EmployeePayrollTest.java

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class EmployeePayrollTest {

    @BeforeEach
    public void clearEmployeeList() {
        Employee.employees.clear();
    }

    @Test
    public void testthatAddsEmployeeToTheList() {
        Employee.employees.add(new Employee("John", 40, 20, 10, 5));
        assertEquals(1, Employee.employees.size());
        assertEquals("John", Employee.employees.get(0).getName());
    }


    @Test
    public void testThatChecksIfDuplicateEmployeeISNotAdded() {
        Employee.employees.add(new Employee("Bolaji", 35, 15, 10, 5));

        boolean duplicateFound = false;
        String newName = "Bolaji";
        for (Employee e : Employee.employees) {
            if (e.getName().equalsIgnoreCase(newName)) {
                duplicateFound = true;
                break;
            }
        }
        assertTrue(duplicateFound);
    }

    @Test
    public void testThatCheckIfEmployeeListIsEmptyInitially() {
        assertTrue(Employee.employees.isEmpty());
    }

    @Test
    public void testThatUpdateEmployeeDetails() {
        Employee employee = new Employee("wale", 30, 18, 12, 6);
        Employee.employees.add(employee);

        employee.hoursWorked = 35;
        employee.hourlyPayRate = 20;
        employee.federalTaxWithholdingRate = 15;
        employee.stateTaxWithholdingRate = 7;

        assertEquals(35, employee.hoursWorked);
        assertEquals(20, employee.hourlyPayRate);
        assertEquals(15, employee.federalTaxWithholdingRate);
        assertEquals(7, employee.stateTaxWithholdingRate);
    }
}

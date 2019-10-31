package io.humanresources.api;

import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class TestEmployeeDetails {
    EmployeeBusinessRules employeeBusinessRules = new EmployeeBusinessRules();
    EmployeeDetails employeeDetails = new EmployeeDetails();

    @Test
    public void testCalculateAppraisal() {
        employeeDetails.setName("Ronald");
        employeeDetails.setAge(47);
        employeeDetails.setMonthlySalary(8000);

        double appraisal = employeeBusinessRules.calculateAppraisal(employeeDetails);
        assertEquals(1000, appraisal, 0.0, "1000");
    }

    @Test
    public void testCalculateAnnualSalary() {
        employeeDetails.setName("James");
        employeeDetails.setAge(50);
        employeeDetails.setMonthlySalary(5000);

        double salary = employeeBusinessRules.calculateAnnualSalary(employeeDetails);
        assertEquals(60000, salary, 0.0, "5000");
    }
}

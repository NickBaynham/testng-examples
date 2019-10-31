package io.humanresources.api;

public class EmployeeBusinessRules {

    public double calculateAnnualSalary(EmployeeDetails employeeDetails) {
        double annualSalary = 0;
        annualSalary = employeeDetails.getMonthlySalary() * 12;
        return annualSalary;
    }

    public double calculateAppraisal(EmployeeDetails employeeDetails) {
        double appraisal = 0;

        if (employeeDetails.getMonthlySalary()> 100000) {
            appraisal = 500;
        } else {
            appraisal = 1000;
        }

        return appraisal;
    }
}

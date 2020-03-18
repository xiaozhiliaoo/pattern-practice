package org.lili.structural.adapter.ex2;

/**
 * Created by lili on 2017/7/12.
 */
public class CompanyAAdapter implements EmployeeBrowser {

    public CompanyAAdapter() {
    }

    public Employee getEmployee(String direction, String division, String department, String service, String firstName, String lastName) {
        String distinguishedName = "SELECT *"
               + " FROM t_employee as employee"
               + " WHERE employee.company= 'COMPANY A'"
               + " AND employee.direction = " + direction
               + " AND employee.division = " + division
               + " AND employee.department = " + department
               + " AND employee.service = " + service
               + " AND employee.firstName = " + firstName
               + " AND employee.lastName = " + lastName;
        CompanyAEmployees companyAEmployees = new CompanyAEmployees();
        return companyAEmployees.getEmployee(distinguishedName);
    }
}

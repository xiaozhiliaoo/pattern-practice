package org.lili.structural.adapter.ex2;

/**
 * Created by lili on 2017/7/12.
 */
public class CompanyBAdapter implements EmployeeBrowser {
    public Employee getEmployee(String direction, String division, String department, String service, String firstName, String lastName) {
        CompanyBEmployees companyBEmployees = new CompanyBEmployees();
        String distinguishedName = "ov1 = " + direction
               + ", ov2 = " + division
               + ", ov3 = " + department
               + ", ov4 = " + service
               + ", cn = " + firstName + lastName;
        return companyBEmployees.getEmployee(distinguishedName);
    }
}

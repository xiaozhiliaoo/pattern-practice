package org.lili.structural.adapter.ex2;

/**
 * Created by lili on 2017/7/12.
 */
public interface EmployeeBrowser {
    Employee getEmployee(String direction, String division, String department, String service, String firstName, String lastName);
}

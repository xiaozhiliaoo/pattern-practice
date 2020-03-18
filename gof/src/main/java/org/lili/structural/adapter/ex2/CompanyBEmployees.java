package org.lili.structural.adapter.ex2;

/**
 * Created by lili on 2017/7/12.
 */

/**
 * Think twice before implementing this pattern.
 * This pattern should not be planned at design time.
 * If you plan to use it for a project from scratch,
 * this means that you don't understand this pattern.
 * It should be used only with legacy code. It is the least bad solution.
 *
 * 慎用这个模式，这个模式不应该在设计的时候使用，如果你计划在开始的时候使用这个
 * 模式，说明你没有理解这个模式。他应该和旧代码一起使用，这是最差的方案。
 */
public class CompanyBEmployees {
    public Employee getEmployee(String distinguishedName){
        Employee employee = null;
        return employee;
    }
}

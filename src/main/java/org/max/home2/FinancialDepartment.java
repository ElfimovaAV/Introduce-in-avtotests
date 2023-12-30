package org.max.home2;

/**
 * Элемент - финансовый отдел
 */
public class FinancialDepartment implements Department {

    private String name;

    public String printDepartmentClass() {
        return ("Финансовый отдел " + name);
    }

    public FinancialDepartment(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

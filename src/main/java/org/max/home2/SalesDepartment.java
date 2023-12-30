package org.max.home2;
/**
 * Элемент - отдел продаж
 */
public class SalesDepartment implements Department {

    private String name;

    public String printDepartmentClass() {
        return ("Отдел продаж " + name);
    }

    public SalesDepartment(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

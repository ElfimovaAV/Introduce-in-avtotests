package org.max.home2;

import java.util.List;

/**
 * Составной элемент - список отделов
 */
public class HeadDepartment implements Department {
    private String name;

    private List<Department> childDepartments;

    public HeadDepartment(String name, List<Department> childDepartments) {
        this.name = name;
        this.childDepartments = childDepartments;
    }

    public String printDepartmentClass() {
        String print = name + ": ";
        for (Department childDepartment: childDepartments) {
            print += childDepartment.printDepartmentClass() + ", ";
        }
        return print;
    }

    public void addDepartment(Department department) {
        childDepartments.add(department);
    }

    public void removeDepartment(Department department) {
        childDepartments.remove(department);
    }

    public String getName() {
        return name;
    }
}


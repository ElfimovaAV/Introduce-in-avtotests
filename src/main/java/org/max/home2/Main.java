package org.max.home2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        FinancialDepartment financialDepartment = new FinancialDepartment("Филиал Новосибирск");
        FinancialDepartment financialDepartment1 = new FinancialDepartment( "Филиал Санкт-Петербург");
        SalesDepartment salesDepartment = new SalesDepartment( "Центральный офис Москва");
        SalesDepartment salesDepartment1 = new SalesDepartment( "Филиал Новосибирск");
        List<Department> departments = new ArrayList<>();
        departments.add(financialDepartment1);
        departments.add(salesDepartment1);

        HeadDepartment headDepartment = new HeadDepartment("Управление", departments);

        System.out.println(financialDepartment.printDepartmentClass());
        System.out.println(salesDepartment.printDepartmentClass());
        System.out.println(headDepartment.printDepartmentClass());
    }
}

package max.home2;

import org.junit.Ignore;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.max.home2.Department;
import org.max.home2.FinancialDepartment;
import org.max.home2.HeadDepartment;
import org.max.home2.SalesDepartment;

import java.util.ArrayList;
import java.util.List;

/*@Ignore
public class DepartmentTest {
    static FinancialDepartment financialDepartment;
    static FinancialDepartment financialDepartment1;
    static SalesDepartment salesDepartment;
    static SalesDepartment salesDepartment1;
    static List<Department> departments = new ArrayList<>();
    static HeadDepartment headDepartment;


@BeforeAll
static void init() {
    financialDepartment = new FinancialDepartment("Филиал Новосибирск");
    financialDepartment1 = new FinancialDepartment( "Филиал Санкт-Петербург");
    salesDepartment = new SalesDepartment( "Центральный офис Москва");
    salesDepartment1 = new SalesDepartment( "Филиал Новосибирск");
    departments.add(financialDepartment1);
    departments.add(salesDepartment1);

    headDepartment = new HeadDepartment("Управление", departments);
}

    @Test
    @DisplayName("Проверка названия финансового отдела")
    void checkFinancialDepartmentPrint(){
        Assertions.assertEquals(financialDepartment.printDepartmentClass(), "Финансовый отдел Филиал Новосибирск");
    }
    @Test
    @DisplayName("Проверка названия отдела продаж")
    void checkSalesDepartmentPrint(){
        Assertions.assertEquals(salesDepartment.printDepartmentClass(), "Отдел продаж Центральный офис Москва");
    }

    @Test
    @DisplayName("Проверка названия управления")
    void checkSalesHeadDepartmentPrint(){
        Assertions.assertEquals(headDepartment.printDepartmentClass(), "Управление: Финансовый отдел Филиал Санкт-Петербург, Отдел продаж Филиал Новосибирск, ");
    }

}*/


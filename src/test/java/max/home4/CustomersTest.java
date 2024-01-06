package max.home4;

import org.hibernate.query.Query;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.max.home4.CustomersEntity;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CustomersTest extends AbstractTest {

    @Test
    void testGetCustomers() throws SQLException {
        //given
        String sql = "SELECT * FROM customers";
        Statement stmt  = getConnection().createStatement();
        int countTableSize = 0;
        //when
        ResultSet rs = stmt.executeQuery(sql);
        while (rs.next()) {
            countTableSize++;
        }
        final Query query = getSession().createSQLQuery(sql).addEntity(CustomersEntity.class);
        //then
        Assertions.assertEquals(15, countTableSize);
        Assertions.assertEquals(15, query.list().size());
    }

    @ParameterizedTest
    @CsvSource({"1, Smith", "2, Brown", "3, Thompson", "4, Twist", "5, Bellora", "6, Evans", "7, Radriges",
    "8, Gordon", "9, Lorenson", "10, Visputchu", "11, Smith", "12, Rild", "13, Frankston", "14, Hall", "15, Watson"})
    void testGetCustomersById(int id, String lastName) throws SQLException {
        //given
        String sql = "SELECT * FROM customers WHERE customer_id=" + id;
        Statement stmt  = getConnection().createStatement();
        String name = "";
        String nameByColumn = "";
        //when
        ResultSet rs = stmt.executeQuery(sql);
        while (rs.next()) {
            name = rs.getString(3);
            nameByColumn = rs.getString("last_name");
        }
        //then
        Assertions.assertEquals(lastName, name);
        Assertions.assertEquals(lastName, nameByColumn);
    }
}

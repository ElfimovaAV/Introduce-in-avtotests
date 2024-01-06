package max.home4;

import org.hibernate.query.Query;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.max.home4.CourierInfoEntity;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class CourierTest extends AbstractTest{

    @Test
    void testGetCourier() throws SQLException {
        //given
        String sql = "SELECT * FROM courier_info";
        Statement stmt  = getConnection().createStatement();
        int countTableSize = 0;
        //when
        ResultSet rs = stmt.executeQuery(sql);
        while (rs.next()) {
            System.out.println(rs.getInt(1));
            System.out.println(rs.getString(2));
            System.out.println(rs.getString(3));
            System.out.println(rs.getString(4));
            System.out.println(rs.getString(5));
            System.out.println("\n");
            countTableSize++;
        }
        final Query query = getSession().createSQLQuery(sql).addEntity(CourierInfoEntity.class);
        //then
        Assertions.assertEquals(4, countTableSize);
        Assertions.assertEquals(4, query.list().size());
    }

    @ParameterizedTest
    @CsvSource({"1, Rython", "2, Looran", "3, Kolaris", "4, Frontal"})
    void testGetCourierParametrized(int id, String last_name) throws SQLException {
        //given
        //when
        final Query query = getSession().createQuery("from " + "CourierInfoEntity" + " where courier_id=" + id);
        CourierInfoEntity courierInfoEntity = (CourierInfoEntity) query.uniqueResult();
        //then
        System.out.println(courierInfoEntity.getCourierId());
        System.out.println(courierInfoEntity.getFirstName());
        System.out.println(courierInfoEntity.getLastName());
        System.out.println(courierInfoEntity.getPhoneNumber());
        System.out.println(courierInfoEntity.getDeliveryType());
        System.out.println("\n");
        Assertions.assertEquals(last_name, courierInfoEntity.getLastName());
    }

    @Test
    void testGetCourier_Using_Hibernate_Only(){
        //givem
        //when
        final Query query = getSession().createQuery("from CourierInfoEntity");
        List<CourierInfoEntity> list = query.list();
        //then
        Assertions.assertAll(() -> Assertions.assertEquals(4, list.size()),
                () -> Assertions.assertEquals("John", list.get(0).getFirstName()),
                () -> Assertions.assertEquals("Looran", list.get(1).getLastName()),
                () -> Assertions.assertEquals("+ 7 960 107 7798", list.get(2).getPhoneNumber()),
                () -> Assertions.assertEquals("car", list.get(3).getDeliveryType()));
    }
}

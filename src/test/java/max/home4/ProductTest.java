package max.home4;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.junit.Ignore;
import org.junit.jupiter.api.*;
import org.max.home4.ProductsEntity;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Optional;
/*@Ignore
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class ProductTest extends AbstractTest {

    @Test
    @Order(1)
    void testGetProduct() throws SQLException {
        //given
        String sql = "SELECT * FROM products";
        Statement stmt  = getConnection().createStatement();
        int countTableSize = 0;
        //when
        ResultSet rs = stmt.executeQuery(sql);
        while (rs.next()) {
            countTableSize++;
        }
        final Query query = getSession().createSQLQuery(sql).addEntity(ProductsEntity.class);
        //then
        Assertions.assertEquals(10, countTableSize);
        Assertions.assertEquals(10, query.list().size());
    }

    @Test
    @Order(2)
    void testAddProducts() {
        //given
        ProductsEntity entity = new ProductsEntity();
        entity.setProductId((short) 11);
        entity.setMenuName("YOCOGAMA SET");
        entity.setPrice("1050");
        //when
        Session session = getSession();
        session.beginTransaction();
        session.persist(entity);
        session.getTransaction().commit();

        final Query query = getSession()
                .createSQLQuery("SELECT * FROM products WHERE product_id="+11).addEntity(ProductsEntity.class);
        ProductsEntity productsEntity = (ProductsEntity) query.uniqueResult();
        //then
        Assertions.assertNotNull(productsEntity);
        Assertions.assertEquals("1050.0", productsEntity.getPrice());
        Assertions.assertEquals("YOCOGAMA SET", productsEntity.getMenuName());
    }

    @Test
    @Order(3)
    void testDeleteProducts() {
        //given
        final Query query = getSession()
                .createSQLQuery("SELECT * FROM products WHERE product_id=" + 11).addEntity(ProductsEntity.class);
        Optional<ProductsEntity> productsEntity= (Optional<ProductsEntity>) query.uniqueResultOptional();
        Assumptions.assumeTrue(productsEntity.isPresent());
        //when
        Session session = getSession();
        session.beginTransaction();
        session.delete(productsEntity.get());
        session.getTransaction().commit();
        //then
        final Query queryAfterDelete = getSession()
                .createSQLQuery("SELECT * FROM products WHERE product_id=" + 11).addEntity(ProductsEntity.class);
        Optional<ProductsEntity> productsEntityAfterDelete = (Optional<ProductsEntity>) queryAfterDelete.uniqueResultOptional();
        Assertions.assertFalse(productsEntityAfterDelete.isPresent());
    }
}*/

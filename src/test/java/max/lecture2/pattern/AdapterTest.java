package max.lecture2.pattern;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.max.lecture2.pattern.adapter.JsonAdapter;
import org.max.lecture2.pattern.adapter.XMLAdapter;

/**
 * Тест для демонстрации работы паттерна Адаптер
 */
public class AdapterTest {

    @Test
    void jsonTest() {
        //given
        JsonAdapter adapter = new JsonAdapter();
        //when
        //then
        Assertions.assertNotNull(adapter);
    }

    @Test
    void xmlTest() {
        //given
        XMLAdapter adapter = new XMLAdapter();
        //when
        //then
        Assertions.assertNotNull(adapter);
    }
}

package max.home6;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TestDefectsTest extends AbstractTest{
    @Test
    @DisplayName("IngredientSubstitutesTest")
    void ArithmeticExceptionTest(){
        int b = 500;
        Assertions.assertEquals(0, b/0);
    }
}

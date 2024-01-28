package max.seminar3.spoonacular;

import org.hamcrest.Matchers;
import org.junit.Ignore;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.max.seminar3.spoonacular.ConvertAmountsDto;

import static io.restassured.RestAssured.given;
/*@Ignore
public class ConvertAmountsTestSpoonacular extends SpoonacularAbstractTest {

    @Test
    void getConvertAmounts_whenValid_shouldReturn() {
        ConvertAmountsDto response = given()
                .queryParam("apiKey", getApiKey())
                .queryParam("ingredientName", "flour")
                .queryParam("sourceAmount", 2.5)
                .queryParam("sourceUnit", "cups")
                .queryParam("targetUnit", "grams")
                .when()
                .get(getBaseUrl()+"recipes/convert")
                .then()
                .statusCode(200)
                .time(Matchers.lessThan(1000l))
                .extract()
                .response()
                .body().as(ConvertAmountsDto.class);

        Assertions.assertEquals(response.getTargetAmount(),312.5);

    }
}*/

package max.seminar6;

/*import io.qameta.allure.*;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.max.seminar6.RandomRecipesDto;

import static io.restassured.RestAssured.given;

@Epic(value = "Тестирование API https://spoonacular.com/food-api")
@Feature(value = "Семинар")
public class RandomRecipesTest extends AbstractTest {

    @Test
    @DisplayName("RandomRecipesTest")
    @Description("GET RandomRecipes")
    @Link("")
    @Severity(SeverityLevel.NORMAL)
    @Owner("Кравченко Максим")
    @Story(value = "Тестирование метода RandomRecipes")
    void getRandomRecipes_whenValid_shouldReturn() {
        RandomRecipesDto response = given()
                .queryParam("apiKey", getApiKey())
                .queryParam("number", 5)
                .when()
                .get(getBaseUrl() + "recipes/random")
                .then()
                .statusCode(200)
                .time(Matchers.lessThan(3000l))
                .extract()
                .response()
                .body().as(RandomRecipesDto.class);

        Assertions.assertEquals(response.getRecipes().size(),5);
    }
}*/

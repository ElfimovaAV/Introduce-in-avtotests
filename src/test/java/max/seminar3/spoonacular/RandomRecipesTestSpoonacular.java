package max.seminar3.spoonacular;

import org.hamcrest.Matchers;
import org.junit.Ignore;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.max.seminar3.spoonacular.RandomRecipesDto;

import static io.restassured.RestAssured.given;
/*@Ignore
public class RandomRecipesTestSpoonacular extends SpoonacularAbstractTest {

    @Test
    void getRandomRecipes_whenValid_shouldReturn() {
        RandomRecipesDto response = given()
                .queryParam("apiKey", getApiKey())
                .queryParam("number", 5)
                .when()
                .get(getBaseUrl() + "recipes/random")
                .then()
                .statusCode(200)
                .time(Matchers.lessThan(1000l))
                .extract()
                .response()
                .body().as(RandomRecipesDto.class);

        Assertions.assertEquals(response.getRecipes().size(),5);
    }
}*/

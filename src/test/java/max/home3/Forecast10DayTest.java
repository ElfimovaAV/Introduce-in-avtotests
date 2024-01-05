package max.home3;

import max.seminar3.accuweather.AccuweatherAbstractTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.lessThan;

public class Forecast10DayTest extends AccuweatherAbstractTest {

    @Test
    @DisplayName("Получение ответа как строка")
    void testGetResponseAsString(){
        String response = given().queryParam("apikey", getApiKey()).pathParam("locationKey", 50)
                .when().get(getBaseUrl()+"/forecasts/v1/daily/10day/{locationKey}")
                .then().statusCode(401).time(lessThan(2000L))
                .extract().asString();
        System.out.println(response);
        Assertions.assertTrue(response.contains("Code"));
        Assertions.assertTrue(response.contains("Message"));
        Assertions.assertTrue(response.contains("Reference"));
    }
}

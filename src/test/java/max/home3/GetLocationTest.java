package max.home3;

/*import max.seminar3.accuweather.AccuweatherAbstractTest;
import org.junit.Ignore;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.max.seminar3.accuweather.location.Location;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.lessThan;*/
/*@Ignore
public class GetLocationTest extends AccuweatherAbstractTest {

    @Test
    @DisplayName("Получение ответа как строка")
    void testLocationsAsString(){
        Map<String, String> params = new HashMap<>();
        params.put("apikey", getApiKey());
        params.put("q", "Mosk");
        String response = given().queryParams(params)
                .when().get(getBaseUrl()+"/locations/v1/cities/autocomplete")
                .then().statusCode(200).time(lessThan(3000L))
                .extract().asString();
        System.out.println(response);
        Assertions.assertTrue(response.contains("Moscow"));
        Assertions.assertTrue(response.contains("Russia"));
    }

    @Test
    @DisplayName("Получение ответа как список Location")
    void testLocationsAsLocation(){
        Map<String, String> params = new HashMap<>();
        params.put("apikey", getApiKey());
        params.put("q", "Mosk");
        List<Location> response = given().queryParams(params)
                .when().get(getBaseUrl()+"/locations/v1/cities/autocomplete")
                .then().statusCode(200).time(lessThan(3000L))
                .extract().body().jsonPath().getList(".", Location.class);
        Assertions.assertEquals(10, response.size());
        Assertions.assertEquals("Moskalyenki", response.get(1).getLocalizedName());
        Assertions.assertEquals("Russia", response.get(1).getCountry().getLocalizedName());
        Assertions.assertEquals("OMS", response.get(1).getAdministrativeArea().getId());

    }
}*/

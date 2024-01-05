package max.seminar3.accuweather;

import org.hamcrest.Matchers;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.max.seminar3.accuweather.location.Location;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.lessThan;

public class GetLocationTest extends AccuweatherAbstractTest {

    @Test
    void getLocation_autocomplete_returnSamara() {

        List<Location> response = given()
                .queryParam("apikey", getApiKey())
                .when()
                .get(getBaseUrl()+"/locations/v1/cities/autocomplete?q=Samara")
                .then()
                .statusCode(200)
                .time(lessThan(2000l))
                .extract()
                .body().jsonPath().getList(".", Location.class);

        Assertions.assertEquals(10,response.size());
        Assertions.assertEquals("Samara", response.get(0).getLocalizedName());
    }

    @Test
    void testLocationsAsString(){
        Map<String, String> params = new HashMap<>();
        params.put("apikey", getApiKey());
        params.put("q", "Pari");
        String response = given().queryParams(params)
                .when().get(getBaseUrl()+"/locations/v1/cities/autocomplete")
                .then().statusCode(200).time(lessThan(1000L))
                .extract().asString();
        System.out.println(response);
        Assertions.assertTrue(response.contains("Paris"));
        Assertions.assertTrue(response.contains("France"));
    }

    @Test
    void testLocationsAsLocation(){
        Map<String, String> params = new HashMap<>();
        params.put("apikey", getApiKey());
        params.put("q", "Pari");
        List<Location> response = given().queryParams(params)
                .when().get(getBaseUrl()+"/locations/v1/cities/autocomplete")
                .then().statusCode(200).time(lessThan(1000L))
                .extract().body().jsonPath().getList(".", Location.class);
        Assertions.assertEquals(10, response.size());
        Assertions.assertEquals("Paris", response.get(0).getLocalizedName());
        Assertions.assertEquals("France", response.get(0).getCountry().getLocalizedName());

    }
}

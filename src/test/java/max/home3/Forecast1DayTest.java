package max.home3;

import max.seminar3.accuweather.AccuweatherAbstractTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.max.seminar3.accuweather.weather.DailyForecast;
import org.max.seminar3.accuweather.weather.Weather;

import java.util.List;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.lessThan;

public class Forecast1DayTest extends AccuweatherAbstractTest {

    @Test
    @DisplayName("Получение ответа как класс Weather")
    void testGetResponseAsWeather(){
        Weather response = given().queryParam("apikey", getApiKey()).pathParam("locationKey", 50)
                .when().get(getBaseUrl()+"/forecasts/v1/daily/1day/{locationKey}")
                .then().statusCode(200).time(lessThan(2000L))
                .extract().response().body().as(Weather.class);
        Assertions.assertEquals(4, response.getHeadline().getSeverity());
        Assertions.assertEquals(1, response.getDailyForecasts().size());
        Assertions.assertEquals("Intermittent clouds", response.getDailyForecasts().get(0).getDay().getIconPhrase());
        Assertions.assertEquals("Cloudy", response.getDailyForecasts().get(0).getNight().getIconPhrase());
    }
    @Test
    @DisplayName("Получение ответа как строка")
    void testGetResponseAsString(){
        String response = given().queryParam("apikey", getApiKey()).pathParam("locationKey", 50)
                .when().get(getBaseUrl()+"/forecasts/v1/daily/1day/{locationKey}")
                .then().statusCode(200).time(lessThan(2000L))
                .extract().asString();
        System.out.println(response);
        Assertions.assertTrue(response.contains("Headline"));
        Assertions.assertTrue(response.contains("DailyForecasts"));
        Assertions.assertTrue(response.contains("Temperature"));
    }
    @Test
    @DisplayName("Получение ответа как список DailyForecast")
    void testGetResponseAsForecastList(){
        List<DailyForecast> response = given().queryParam("apikey", getApiKey()).pathParam("locationKey", 50)
                .when().get(getBaseUrl()+"/forecasts/v1/daily/1day/{locationKey}")
                .then().statusCode(200).time(lessThan(2000L))
                .extract().body().jsonPath().getList("DailyForecasts", DailyForecast.class);
        Assertions.assertEquals(1, response.size());
        Assertions.assertEquals(13.0, response.get(0).getTemperature().getMinimum().getValue());
        Assertions.assertEquals(22.0, response.get(0).getTemperature().getMaximum().getValue());
    }
}

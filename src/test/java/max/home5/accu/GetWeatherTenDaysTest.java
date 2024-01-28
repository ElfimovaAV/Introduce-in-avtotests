package max.home5.accu;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.junit.Ignore;
import org.junit.jupiter.api.Test;
import org.max.home5.accu.weather.DailyForecast;
import org.max.home5.accu.weather.Headline;
import org.max.home5.accu.weather.Weather;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static com.github.tomakehurst.wiremock.client.WireMock.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
/*@Ignore
public class GetWeatherTenDaysTest extends AbstractTest{

    private static final Logger logger
            = LoggerFactory.getLogger(GetWeatherTenDaysTest.class);

    @Test
    void get_shouldReturn200() throws IOException {
        logger.info("Тест код ответ 200 запущен");
        //given
        ObjectMapper mapper = new ObjectMapper();
        Weather weather = new Weather();
        Headline headline = new Headline();
        headline.setCategory("Категория");
        headline.setText("Прогноз погоды на 10 дней");
        weather.setHeadline(headline);
        List<DailyForecast> dailyForecasts = new ArrayList<>();
        dailyForecasts.add(0, new DailyForecast());
        dailyForecasts.add(1, new DailyForecast());
        dailyForecasts.add(2, new DailyForecast());
        dailyForecasts.add(3, new DailyForecast());
        dailyForecasts.add(4, new DailyForecast());
        dailyForecasts.add(5, new DailyForecast());
        dailyForecasts.add(6, new DailyForecast());
        dailyForecasts.add(7, new DailyForecast());
        dailyForecasts.add(8, new DailyForecast());
        dailyForecasts.add(9, new DailyForecast());
        weather.setDailyForecasts(dailyForecasts);

        logger.debug("Формирование мока для GET /forecasts/v1/daily/10day/%7B50%7D");
        stubFor(get(urlPathEqualTo("/forecasts/v1/daily/10day/%7B50%7D"))
                .willReturn(aResponse()
                        .withStatus(200).withBody(mapper.writeValueAsString(weather))));

        CloseableHttpClient httpClient = HttpClients.createDefault();

        HttpGet request = new HttpGet(getBaseUrl() + "/forecasts/v1/daily/10day/%7B50%7D");
        logger.debug("http клиент создан");
        //when
        HttpResponse response = httpClient.execute(request);
        //then
        verify(getRequestedFor(urlPathEqualTo("/forecasts/v1/daily/10day/%7B50%7D")));
        assertEquals(200, response.getStatusLine().getStatusCode());

        Weather responseBody = mapper.readValue(response.getEntity().getContent(), Weather.class);
        assertEquals("Категория", responseBody.getHeadline().getCategory());
        assertEquals("Прогноз погоды на 10 дней", responseBody.getHeadline().getText());
        assertEquals(10, responseBody.getDailyForecasts().size());
    }

    @Test
    void get_shouldReturn500() throws IOException {
        logger.info("Тест код ответ 500 запущен");
        //given
        logger.debug("Формирование мока для GET /forecasts/v1/daily/10day/%7B50%7D");
        stubFor(get(urlPathEqualTo("/forecasts/v1/daily/10day/%7B50%7D"))
                .willReturn(aResponse()
                        .withStatus(500).withBody("ERROR")));
        CloseableHttpClient httpClient = HttpClients.createDefault();
        HttpGet request = new HttpGet(getBaseUrl()+"/forecasts/v1/daily/10day/%7B50%7D");
        logger.debug("http клиент создан");
        //when
        HttpResponse response = httpClient.execute(request);
        //then
        verify(getRequestedFor(urlPathEqualTo("/forecasts/v1/daily/10day/%7B50%7D")));
        assertEquals(500, response.getStatusLine().getStatusCode());
        assertEquals("ERROR", convertResponseToString(response));
    }
}*/

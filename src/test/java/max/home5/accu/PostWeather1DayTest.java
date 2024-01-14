package max.home5.accu;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
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

public class PostWeather1DayTest extends AbstractTest{
    private static final Logger logger
            = LoggerFactory.getLogger(GetWeatherTenDaysTest.class);
    @Test
    void post_shouldReturn200() throws IOException {
        logger.info("Тест код ответ 200 запущен");
        //given
        ObjectMapper mapper = new ObjectMapper();
        Weather weather = new Weather();
        Headline headline = new Headline();
        headline.setSeverity(3);
        weather.setHeadline(headline);
        DailyForecast dailyForecast = new DailyForecast();
        dailyForecast.setDate("2024-01-14");
        List<DailyForecast> dailyForecasts = new ArrayList<>();
        dailyForecasts.add(dailyForecast);
        weather.setDailyForecasts(dailyForecasts);

        logger.debug("Формирование мока для POST /forecasts/v1/daily/1day/%7B50%7D");
        stubFor(post(urlPathEqualTo("/forecasts/v1/daily/1day/%7B50%7D"))
                .willReturn(aResponse()
                        .withStatus(200).withBody(mapper.writeValueAsString(weather))));

        CloseableHttpClient httpClient = HttpClients.createDefault();

        HttpPost request = new HttpPost(getBaseUrl() + "/forecasts/v1/daily/1day/%7B50%7D");
        logger.debug("http клиент создан");
        //when
        HttpResponse response = httpClient.execute(request);
        //then
        verify(postRequestedFor(urlPathEqualTo("/forecasts/v1/daily/1day/%7B50%7D")));
        assertEquals(200, response.getStatusLine().getStatusCode());

        Weather responseBody = mapper.readValue(response.getEntity().getContent(), Weather.class);
        assertEquals(3, responseBody.getHeadline().getSeverity());
        assertEquals("2024-01-14", responseBody.getDailyForecasts().get(0).getDate());
        assertEquals(1, responseBody.getDailyForecasts().size());

    }
}

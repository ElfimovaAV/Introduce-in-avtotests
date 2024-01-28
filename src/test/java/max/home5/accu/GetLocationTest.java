package max.home5.accu;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.junit.Ignore;
import org.junit.jupiter.api.Test;
import org.max.home5.accu.location.Location;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

import static com.github.tomakehurst.wiremock.client.WireMock.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
/*@Ignore
public class GetLocationTest extends AbstractTest{
    private static final Logger logger
            = LoggerFactory.getLogger(GetWeatherTenDaysTest.class);
    @Test
    void get_shouldReturn200() throws IOException, URISyntaxException {
        logger.info("Тест код ответ 200 запущен");
        //given
        ObjectMapper mapper = new ObjectMapper();
        Location location = new Location();
        location.setType("City");


        logger.debug("Формирование мока для GET /locations/v1/%7B50%7D");
        stubFor(get(urlPathEqualTo("/locations/v1/%7B50%7D"))
                .willReturn(aResponse()
                        .withStatus(200).withBody(mapper.writeValueAsString(location))));

        CloseableHttpClient httpClient = HttpClients.createDefault();
        logger.debug("http клиент создан");
        //when

        HttpGet request = new HttpGet(getBaseUrl() + "/locations/v1/%7B50%7D");
        URI uri = new URIBuilder(request.getURI())
                .build();
        request.setURI(uri);
        HttpResponse response = httpClient.execute(request);

        verify(1, getRequestedFor(urlPathEqualTo("/locations/v1/%7B50%7D")));
        assertEquals(200, response.getStatusLine().getStatusCode());

        Location responseBody = mapper.readValue(response.getEntity().getContent(), Location.class);
        assertEquals("City", responseBody.getType());

    }

    @Test
    void get_shouldReturn404() throws IOException, URISyntaxException {
        logger.info("Тест код ответ 404 запущен");
        //given
        ObjectMapper mapper = new ObjectMapper();
        Location location = new Location();

        logger.debug("Формирование мока для GET /locations/v1/%7B50%7D");
        stubFor(get(urlPathEqualTo("/locations/v1/%7B50%7D"))
                .willReturn(aResponse()
                        .withStatus(200).withBody(mapper.writeValueAsString(location))));

        CloseableHttpClient httpClient = HttpClients.createDefault();
        logger.debug("http клиент создан");
        //when

        HttpGet request = new HttpGet(getBaseUrl() + "/locations/v1/%7B100%7D");
        URI uri = new URIBuilder(request.getURI())
                .build();
        request.setURI(uri);
        HttpResponse response = httpClient.execute(request);

        verify(1, getRequestedFor(urlPathEqualTo("/locations/v1/%7B100%7D")));
        assertEquals(404, response.getStatusLine().getStatusCode());
    }
}*/

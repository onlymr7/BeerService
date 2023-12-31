package client;

import onlymr.microservicebeer.client.client.BreweryClient;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import web.web_model.BeerDto;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
class BreweryClientTest {

    @Autowired
    BreweryClient client;

    @Test
    void getBeer() {
        BeerDto dto = client.getBeer(UUID.randomUUID());

        assertNotNull(dto);
    }
}
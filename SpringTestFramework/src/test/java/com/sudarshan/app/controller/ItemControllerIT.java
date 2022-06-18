package com.sudarshan.app.controller;

import org.json.JSONException;
import org.junit.jupiter.api.Test;
import org.skyscreamer.jsonassert.JSONAssert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class ItemControllerIT {

    /**
     * Here it creates a whole instance of the spring application for testing,
     * but is inteligent enough to boot up a in-memory database for testing.
     */

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void contextLoads() throws JSONException {

        String response = this.restTemplate.getForObject("/all-items-from-database", String.class);

        JSONAssert.assertEquals("[{id:10001},{id:10002},{id:10003}]",
                response, false);
    }
}

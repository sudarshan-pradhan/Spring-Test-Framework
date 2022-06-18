package com.sudarshan.app.controller;

import static org.mockito.Mockito.when;

import java.util.Arrays;

import org.json.JSONException;
import org.junit.jupiter.api.Test;
import org.skyscreamer.jsonassert.JSONAssert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.web.client.TestRestTemplate;

import com.sudarshan.app.model.Item;
import com.sudarshan.app.repository.ItemRepository;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class ItemController2IT {

    /**
     * Here we intialize the whole context for Integration Testing
     * But we mock the repository so it dosent connect to a Database or
     * any in-memory databse created just for testing
     */

    @Autowired
    private TestRestTemplate restTemplate;

    @MockBean
    private ItemRepository repository;

    @Test
    public void contextLoads() throws JSONException {

        when(repository.findAll()).thenReturn(Arrays.asList(new Item(2, "Item2", 10, 10),
                new Item(3, "Item3", 20, 20)));

        String response = this.restTemplate.getForObject("/all-items-from-database", String.class);

        JSONAssert.assertEquals("[{id:2},{id:3}]",
                response, false);
    }

}

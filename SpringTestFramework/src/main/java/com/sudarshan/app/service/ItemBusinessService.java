package com.sudarshan.app.service;

import org.springframework.stereotype.Service;

import com.sudarshan.app.model.Item;

@Service
public class ItemBusinessService {
    
    public Item retreiveHardcodedItem() {
        return new Item(1, "Ball", 10, 100);
    }
}

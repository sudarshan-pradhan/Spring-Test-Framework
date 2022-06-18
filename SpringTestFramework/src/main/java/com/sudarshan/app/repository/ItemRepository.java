package com.sudarshan.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sudarshan.app.model.Item;

public interface ItemRepository extends JpaRepository<Item, Integer>{

}

package com.shoppingmall.shop.service;

import com.shoppingmall.shop.entity.Item;
import com.shoppingmall.shop.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemService {

    @Autowired
    ItemRepository repository;

    public void addItem(Item item){
        repository.save(item);
    }

    public List<Item> findAllItems(){
        List<Item> itemList = repository.findAll();
        return itemList;
    }
}

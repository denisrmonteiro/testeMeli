package com.example.meli.controller;

import com.example.meli.model.Item;
import com.example.meli.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;



@RestController
@RequestMapping("/api/items")
public class ItemController {
    
    private final ItemService itemService;

    @Autowired
    public ItemController(ItemService itemService) {
        this.itemService = itemService;
    }

    @GetMapping("/{id}")
    public Item getItemById(@PathVariable Long id) {
        return itemService.getItemById(id);
    }

}

package com.example.meli.service;

import com.example.meli.model.Item;
import com.example.meli.exception.ItemNotFoundException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import org.springframework.stereotype.Service;

import jakarta.annotation.PostConstruct;
import java.io.InputStream;
import java.util.List;


@Service
public class ItemService {

    private List<Item> items;

    public void init(List<Item> mockItems) {
        this.items = mockItems;
    }

    @PostConstruct
    public void init() {
        try {
            ObjectMapper mapper = new ObjectMapper();
            InputStream is = getClass().getResourceAsStream("/items.json");
            items = mapper.readValue(is, new TypeReference<List<Item>>() {});
        } catch (Exception e) {
            throw new RuntimeException("Erro ao carregar os itens do arquivo JSON", e);
        }
    }

    public Item getItemById(Long id) {
        return items.stream()
                .filter(i -> i.getItemId().equals(id))
                .findFirst()
                .orElseThrow(() -> new ItemNotFoundException(id));

    }
}

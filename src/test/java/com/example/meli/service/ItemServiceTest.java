package com.example.meli.service;

import com.example.meli.exception.ItemNotFoundException;
import com.example.meli.model.Item;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class ItemServiceTest {

    private ItemService itemService;

    @BeforeEach
    void setUp() {
        itemService = new ItemService();

        // Simula os dados carregados do JSON
        itemService.init(List.of(
            new Item(1L, 1L, "Produto A", "Descrição A", 100.0, 10.00, 90.00, "BRL", "urlA"),
            new Item(2L, 2L, "Produto B", "Descrição B", 200.0, 20.00, 160.00, "BRL", "urlB")
        ));
    }

    @Test
    public void deveRetornarItemExistente() {
        Item item = itemService.getItemById(1L);
        assertNotNull(item);
        assertEquals("Produto A", item.getItemName());
    }

    @Test
    public void deveLancarExcecaoParaItemInexistente() {
        assertThrows(ItemNotFoundException.class, () -> itemService.getItemById(999L));
    }
}
package com.example.meli.controller;

import com.example.meli.model.Item;
import com.example.meli.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Import;
import org.springframework.test.web.servlet.MockMvc;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@WebMvcTest(ItemController.class)
public class ItemControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private ItemService itemService;

   @Test
   @DisplayName("Deve retornar item por ID via controller")
    public void deveRetornarItemPorId() throws Exception {

        System.setProperty("spring.test.active", "true");

        System.out.println ("Executando deveRetornarItemPorId teste");
        
        Item mockItem = new Item(1L, 2L, "Produto A", 
                    "Descrição A", 100.0, 
                    10.0, 190.0, "BRL", 
                    "urlA");

        when(itemService.getItemById(1L)).thenReturn(mockItem);

        System.out.println("Antes do mockMvc.perform");


        mockMvc.perform(get("/api/items/1"))
            .andExpect(status().isOk())
            .andExpect(jsonPath("$.itemName").value("Produto A"))
            .andExpect(jsonPath("$.itemPrice").value(100.0));

        System.out.println("Depois do mockMvc.perform");

    }
    
}
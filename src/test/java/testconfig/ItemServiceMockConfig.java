package com.example.meli.testconfig;

import com.example.meli.service.ItemService;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;

import static org.mockito.Mockito.mock;

@TestConfiguration
public class ItemServiceMockConfig {

    @Bean
    @Primary
    public ItemService itemService() {
        return mock(ItemService.class);
    }
}
package com.example.meli.exception;

public class ItemNotFoundException extends RuntimeException {
    public ItemNotFoundException(Long id) {
        super("Item com ID " + id + " não encontrado.");
    }
}

package com.example.meli.model;

public class Item {
    
    private Long itemId;
    private Long itemSku;
    private String itemName;
    private String itemDescription;
    private Double itemPrice;
    private Double itemDiscount;
    private Double itemSalePrice;
    private String itemCurrency;
    private String itemImageURL;

    public Item() {}

    public Item(Long itemId, Long itemSku, String itemName, String itemDescription, 
                Double itemPrice, Double itemDiscount, Double itemSalePrice,
                String itemCurrency, String itemImageURL) {

        this.itemId          = itemId;
        this.itemSku         = itemSku;
        this.itemName        = itemName;
        this.itemDescription = itemDescription;
        this.itemPrice       = itemPrice;
        this.itemDiscount    = itemDiscount;
        this.itemSalePrice   = itemSalePrice;
        this.itemCurrency    = itemCurrency;
        this.itemImageURL    = itemImageURL;

    }

    // Getters and Setters
    public Long getItemId() {
        return itemId;
    }

    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    public Long getItemSku() {
        return itemSku;
    }

    public void setItemSku(Long itemSku) {
        this.itemSku = itemSku;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getItemDescription() {
        return itemDescription;
    }

    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }

    public Double getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(Double itemPrice) {
        this.itemPrice = itemPrice;
    }

    public Double getItemDiscount() {
        return itemDiscount;
    }

    public void setItemDiscount(Double itemDiscount) {
        this.itemDiscount = itemDiscount;
    }

    public Double getItemSalePrice() {
        return itemSalePrice;
    }

    public void setItemSalePrice(Double itemSalePrice) {
        this.itemSalePrice = itemSalePrice;
    }

    public String getItemCurrency() {
        return itemCurrency;
    }

    public void setItemCurrency(String itemCurrency) {
        this.itemCurrency = itemCurrency;
    }

    public String getItemImageURL() {
        return itemImageURL;
    }

    public void setItemImageURL(String itemImageURL) {
        this.itemImageURL = itemImageURL;
    }

        @Override
    public String toString() {
        return "Item [itemId=" + itemId + ", itemSku=" + itemSku + ", itemName=" + itemName + ", itemDescription="
                + itemDescription + ", itemPrice=" + itemPrice + ", itemDiscount=" + itemDiscount + ", itemSalePrice="
                + itemSalePrice + ", itemCurrency=" + itemCurrency + ", itemImageURL=" + itemImageURL + "]";
    }

}

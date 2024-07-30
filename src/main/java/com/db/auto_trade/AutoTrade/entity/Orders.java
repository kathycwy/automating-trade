package com.db.auto_trade.AutoTrade.entity;

import jakarta.persistence.*;

@Entity
public class Orders {

    @Id
    private int id;

    private String type;

    private String asset;

    private String market;

    private int price;

    private int quantity;

    public Orders () {

    }

    public Orders(int id, String type, String asset, String market, int price, int quantity) {
        this.id = id;
        this.type = type;
        this.asset = asset;
        this.market = market;
        this.price = price;
        this.quantity = quantity;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAsset() {
        return asset;
    }

    public void setAsset(String asset) {
        this.asset = asset;
    }

    public String getMarket() {
        return market;
    }

    public void setMarket(String market) {
        this.market = market;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

}

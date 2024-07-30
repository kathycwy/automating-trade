package com.db.auto_trade.AutoTrade.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.sql.Time;
import java.sql.Timestamp;

@Entity
public class Transaction {

    @Id
    private int id;

    private int orderId;

    private int buyerId;

    private int sellerId;

    private Timestamp timestamp;

    private String status;

    public Transaction(int id, int orderId, int buyerId, int sellerId, Timestamp timestamp, String status) {
        this.id = id;
        this.orderId = orderId;
        this.buyerId = buyerId;
        this.sellerId = sellerId;
        this.timestamp = timestamp;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getBuyerId() {
        return buyerId;
    }

    public void setBuyerId(int buyerId) {
        this.buyerId = buyerId;
    }

    public int getSellerId() {
        return sellerId;
    }

    public void setSellerId(int sellerId) {
        this.sellerId = sellerId;
    }

    public Timestamp getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Timestamp timestamp) {
        this.timestamp = timestamp;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}

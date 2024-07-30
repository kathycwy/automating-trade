package com.db.auto_trade.AutoTrade.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Client {

    @Id
    private int id;

    private String name;

    private int acctNo;

    private int balance;

    public Client(int id, String name, int acctNo, int balance) {
        this.id = id;
        this.name = name;
        this.acctNo = acctNo;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAcctNo() {
        return acctNo;
    }

    public void setAcctNo(int acctNo) {
        this.acctNo = acctNo;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }


}

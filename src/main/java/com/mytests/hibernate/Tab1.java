package com.mytests.hibernate;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

/**
 * *******************************
 * Created by Irina.Petrovskaya on 5/30/2019.
 * Project: jpa-hibernate-maven-test
 * *******************************
 */
@Entity
public class Tab1 {
    private int id;
    private String title;
    private Integer price;
    private Integer amount;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "title")
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Basic
    @Column(name = "price")
    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    @Basic
    @Column(name = "amount")
    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tab1 tab1 = (Tab1) o;
        return id == tab1.id &&
                Objects.equals(title, tab1.title) &&
                Objects.equals(price, tab1.price) &&
                Objects.equals(amount, tab1.amount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, price, amount);
    }
}

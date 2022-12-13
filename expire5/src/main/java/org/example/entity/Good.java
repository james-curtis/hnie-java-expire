package org.example.entity;

import lombok.Data;

@Data
public class Good {

    private String isbn;
    private String name;
    private double price;
    private String pressName;

    public Good(String isbn, String name, double price, String pressName) {
        this.isbn = isbn;
        this.name = name;
        this.price = price;
        this.pressName = pressName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Good good = (Good) o;

        return isbn.equals(good.isbn);
    }

    @Override
    public int hashCode() {
        return isbn.hashCode();
    }
}

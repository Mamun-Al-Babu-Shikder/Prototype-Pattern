package com.mcubes.beans;

/**
 * Created by A.A.MAMUN on 7/14/2020.
 */
public class Product {

    private int pid;
    private String name;
    private float price;

    /**
     * Parameterized constructor to initialized the
     * value of pid, name and price of product.
     */
    public Product(int pid, String name, float price) {
        this.pid = pid;
        this.name = name;
        this.price = price;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "pid=" + pid +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}


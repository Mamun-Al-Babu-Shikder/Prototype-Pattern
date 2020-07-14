package com.mcubes.beans;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by A.A.MAMUN on 7/14/2020.
 */

/**
 * Must be implement the 'Cloneable' interface.
 * 'Cloneable' is nothing but also a marker interface.
 */
public class EMarket implements Cloneable {

    private String name;
    private List<Product> productList;

    public EMarket(){
        productList = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    @Override
    public String toString() {
        return "EMarket{" +
                "name='" + name + '\'' +
                ", productList=" + productList +
                '}';
    }

    /**
     * Insert some demo data.
     * In your real app you can fetch
     * this data from your database.
     */
    public void loadProduct(){
        productList.add(new Product(101, "HP Laptop", 67000.00f));
        productList.add(new Product(102, "SAMSUNG A10s", 13500f));
        productList.add(new Product(103, "Redmi note 8", 18999.00f));
        productList.add(new Product(104, "iPhone XR", 78000.00f));
    }

    /**
     * Implement the clone method.
     */
    @Override
    public EMarket clone() throws CloneNotSupportedException {
        EMarket eMarket = new EMarket();
        for(Product product : productList){
            eMarket.getProductList().add(product);
        }
        return eMarket;
    }
}

package gr.aueb.cf.ch15.products.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Javabean -> Data Class
 */

public class Product implements IProduct {
    private final static List<IProduct> products = new ArrayList<>();


    private long id;
    private String productName;
    private String description;
    private double price;
    private int quantity;


    public Product() {
    }

    public Product(long id, String productName, String description, double price, int quantity) {
        this.id = id;
        this.productName = productName;
        this.description = description;
        this.price = price;
        this.quantity = quantity;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getProductName(String milk) {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public static List<IProduct> getProducts () {
        return Collections.unmodifiableList(products);
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", productName='" + productName + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }

    /**
   * Public API
   */
    @Override
    public void insert(){
        products.add(this);
    }
}

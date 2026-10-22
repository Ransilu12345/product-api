package uk.ac.westminster.products_api;

import java.util.ArrayList;
import java.util.List;

public class Product {
    private Long id;
    private String name;
    private double price;
    private List<Product> products = new ArrayList<>();
    private Long nextId = 1L;

    public Product() {}

    public Product(Long id, String name, double price){
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public Long getId(){
        return id;
    }

    // If we commented out this getName(), GET /products/{id} with id 1 also drop name from the response
    // To make sure this won't happen, you have to use tools like Postman/Swagger-ui to verify responses

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setId(Long id) { this.id = id; }

    public void setName(String name) { this.name = name; }

    public void setPrice(double price) { this.price = price; }
}

package com.oop.projects.Practical_Activity_Generics;

public class Product {

    private long id;
    private String Name;
    private String Brand;
    private double Price;
    private String Description;
    private int Quantity;

    public Product(long id, String name, String brand, double price, String description, int quantity) {
        this.id = id;
        Name = name;
        Brand = brand;
        Price = price;
        Description = description;
        Quantity = quantity;
    }

    public Product() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getBrand() {
        return Brand;
    }

    public void setBrand(String brand) {
        Brand = brand;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(double price) {
        Price = price;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public int getQuantity() {
        return Quantity;
    }

    public void setQuantity(int quantity) {
        Quantity = quantity;
    }

    @Override
    public String toString() {
        return id     + " | " +
                Name  + " | " +
                Brand + " | " +
                Price + " | " +
                Description + " | " +
                Quantity ;
    }
}

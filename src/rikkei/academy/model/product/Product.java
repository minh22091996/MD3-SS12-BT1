package rikkei.academy.model.product;

import java.util.Comparator;

public class Product implements Comparable<Product>, Comparator<Product> {
    private int id ;
    private String name;
    private long quantity;
    private double price;
    private String color;

    public Product() {
    }

    public Product(int id, String name, long quantity, double price, String color) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
        this.color = color;
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

    public long getQuantity() {
        return quantity;
    }

    public void setQuantity(long quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", quantity=" + quantity +
                ", price='" + price + '\'' +
                ", color='" + color + '\'' +
                '}'+"\n";
    }


    @Override
    public int compareTo(Product o) {
        return (int) (this.getPrice()-o.getPrice());
    }


    @Override
    public int compare(Product o1, Product o2) {
        return (int) (o2.getPrice()-o1.getPrice())  ;
    }
}

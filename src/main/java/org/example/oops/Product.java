package org.example.oops;

public class Product {
    private long code;
    private String name;
    private String color;


    public Product() {

    }

    public long getCode() {
        return code;
    }

    public void setCode(long code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Product(long code, String name, String color){
        this.code=code;
        this.name=name;
        this.color=color;
    }
}

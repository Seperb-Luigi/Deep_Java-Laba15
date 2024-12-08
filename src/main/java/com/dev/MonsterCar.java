package com.dev;

public class MonsterCar {
    private int year;
    private String color;
    private String make;
    private double price;
    private String model;

    public MonsterCar(String make, String model, int year, double price, String color) {

        this.year = year;
        this.price = price;
        this.make = make;
        this.model = model;
        this.color = color;
    }

    public String getMake() {
        return make;}
    public void setMake(String make) {
        this.make = make;}

    public int getYear() {
        return year;}
    public void setYear(int year) {
        this.year = year;}

    public String getColor() {
        return color;}
    public void setColor(String color) {
        this.color = color;}

    public String getModel() {
        return model;}
    public void setModel(String model) {
        this.model = model;}



    public double getPrice() {
        return price;}
    public void setPrice(double price) {
        this.price = price;}



    public void displayCarInfo() {
        System.out.println("Car Make: " + make);
        System.out.println("Year: " + year);
        System.out.println("Color: " + color);
        System.out.println("Car Model: " + model);
        System.out.println("Price: $" + price);
    }
}

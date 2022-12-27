package com.mycompany;
public class Ticket {

    private double price;
    private String category;


    public Ticket(double price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void CategoryA() {
        System.out.println("1 - the price for category A = " + (price + 100));
    }

    public void CategoryC() {
        System.out.println(" 3 - the price for category C = " + price);
    }


    public void CategoryB() {
        System.out.println("2 - the price for category B = " + (price + 50));
    }


    public void setCategory(String category) {
        this.category = category;
    }
}
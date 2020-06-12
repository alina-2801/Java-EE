/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author ChiLin Ma
 */
public class Phone {
    private String model; 
    private int year;
    private int price;
    private String note;

    public Phone() {
    }

    public Phone(String model, int year, int price, String note) {
        this.model = model;
        this.year = year;
        this.price = price;
        this.note = note;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public int getPrice() {
        return price;
    }

    public String getNote() {
        return note;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setNote(String note) {
        this.note = note;
    }
    
    
    
}

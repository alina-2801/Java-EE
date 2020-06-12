/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author alina
 */
public class ShippingBox {
    private String type;
    private String country;
    private double boxWeight;
    private double bottleWeight;
    private int bottlenum;

    public ShippingBox() {
    }

    public ShippingBox(String type, String country, double boxWeight, double bottleWeight, int bottlenum) {
        this.type = type;
        this.country = country;
        this.boxWeight = boxWeight;
        this.bottleWeight = bottleWeight;
        this.bottlenum = bottlenum;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public double getBoxWeight() {
        return boxWeight;
    }

    public void setBoxWeight(double boxWeight) {
        this.boxWeight = boxWeight;
    }

    public double getBottleWeight() {
        return bottleWeight;
    }

    public void setBottleWeight(double bottleWeight) {
        this.bottleWeight = bottleWeight;
    }

    public int getBottlenum() {
        return bottlenum;
    }

    public void setBottlenum(int bottlenum) {
        this.bottlenum = bottlenum;
    }
    
    
    
    
}

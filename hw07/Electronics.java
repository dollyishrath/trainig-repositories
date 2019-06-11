package com.trimindtech.training.hw07;

public abstract class Electronics extends Product {
    private String manufacturer;

    public Electronics(double regularPrice, String manufacture) {
        super(regularPrice);
        this.manufacturer = manufacture;
    }

    public String getManufacture() {
        return manufacturer;
    }

    public void setManufacture(String manufacture) {
        this.manufacturer = manufacture;
    }
}

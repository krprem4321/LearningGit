package data;

import util.VehicleFunction;

public class Vehicle implements VehicleFunction {
    private String color;
    private  String brand;
    private  String type;
    private  String regId;

    public Vehicle() {
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setRegId(String regId) {
        this.regId = regId;
    }

    public String getBrand() {
        return brand;
    }

    public String getType() {
        return type;
    }

    public String getRegId() {
        return regId;
    }

    public String getColor() {
        return color;
    }

    @Override
    public void start(String brand) {
        System.out.println(brand+" vehicle Start !!!");
    }

    @Override
    public void stop(String brand) {
        System.out.println(brand+" vehicle Stopped !!!");

    }

    @Override
    public void applyBrake() {
        System.out.println("Brake Applied !!! ");
    }
}

package Vehicles;

import Pricing.PricingSystem;

public class Car extends Vehicle {
    public String brand;
    public String color;

    public Car(String registration_no) {
        this.registration_no = registration_no;
        vehicle_count += 1;
        this.vehicle_id = vehicle_count;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public int ChargePrice(int hours) {
        return 20 * hours;
    }
}

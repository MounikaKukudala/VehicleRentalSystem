package Vehicles;

import Pricing.PricingSystem;

public class Vehicle extends PricingSystem {
    public static int vehicle_count=0;
    public int vehicle_id;
    public String registration_no;
    private boolean is_available=false;

    public int getVehicle_id() {
        return this.vehicle_id;
    }

    public boolean isIs_available() {
        return this.is_available;
    }

    public String getRegistration_no() {
        return this.registration_no;
    }

    public void setIs_available(boolean is_available) {
        this.is_available = is_available;
    }

}

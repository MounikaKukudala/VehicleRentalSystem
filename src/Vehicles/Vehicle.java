package Vehicles;

import Pricing.PricingSystem;

public abstract class Vehicle implements PricingSystem {
    public static int vehicle_count;
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

    @Override
    public String toString() {
        return "Vehicle{" +
                "vehicle_id=" + vehicle_id +
                ", registration_no='" + registration_no + '\'' +
                ", is_available=" + is_available +
                '}';
    }
}

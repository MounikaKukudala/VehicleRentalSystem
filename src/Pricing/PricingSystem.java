package Pricing;

import Vehicles.Car;
import Vehicles.Vehicle;

public abstract class PricingSystem {
    public int ChargePrice(int hours){
        return 10*hours;
    }
}

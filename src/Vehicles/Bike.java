package Vehicles;
public class Bike extends Vehicle {
    public int speed;
    public int gears;

    public Bike(String registration_no) {
        this.registration_no = registration_no;
        vehicle_count += 1;
        this.vehicle_id = vehicle_count;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getGears() {
        return gears;
    }

    public void setGears(int gears) {
        this.gears = gears;
    }

    @Override
    public int ChargePrice(int hours) {
        return 20 * hours;
    }
}

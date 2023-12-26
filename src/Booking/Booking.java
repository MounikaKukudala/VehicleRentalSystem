package Booking;
import Payment.Payment;
import User.User;
import Vehicles.Vehicle;

public class Booking {
    private String id;
    private User user;
    private long start_time;
    private Vehicle vehicle;
    private Payment payment;
    private int hours;
    private int price;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public User getUser() {
        return this.user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public long getStart_time() {
        return start_time;
    }

    public void setStart_time(long start_time) {
        this.start_time = start_time;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public Payment getPayment_id() {
        return this.payment;
    }

    public void setPayment_id(Payment payment) {
        this.payment = payment;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Booking(User user, Vehicle vehicle, Payment payment, int hours) {
        this.id = "abc";
        this.user = user;
        this.start_time = System.currentTimeMillis();;
        this.payment = payment;
        this.vehicle = vehicle;
        this.hours = hours;
        this.price = vehicle.ChargePrice(this.hours);
    }

    public int GetPrice(){
        long current_time = System.currentTimeMillis();
        int hours = (int) (current_time-start_time)/3600;
        return vehicle.ChargePrice(hours);
    }
}

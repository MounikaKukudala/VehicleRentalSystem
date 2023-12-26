package RentalOrganization;
import Booking.Booking;
import Payment.Payment;
import Vehicles.Vehicle;
import User.User;

import java.util.ArrayList;
import java.util.List;

public class RentalOrg {
    private String id;
    private String name;

    private String address;

    private List<Vehicle> vehicles = new ArrayList<Vehicle>();

    public RentalOrg(String id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public void RegisterVehicle( Vehicle vehicle ){
        this.vehicles.add(vehicle);
    }

    public void removeVehicle( Vehicle vehicle ){
        this.vehicles.remove(vehicle);
    }

    public Booking reserveVehicle( Vehicle vehicle, User user, Payment payment, int hours){
        vehicle.setIs_available(false);
        return new Booking(user,vehicle,payment,hours);
    }

    public void unreserveVehicle( Vehicle vehicle ){
        vehicle.setIs_available(true);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}

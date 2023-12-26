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

    private int num_bookings=0;

    private List<Vehicle> vehicles = new ArrayList<>();

    public RentalOrg(String id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public void RegisterVehicles( List<Vehicle> new_vehicles ){
        this.vehicles.addAll(new_vehicles);
    }

    public void removeVehicle( Vehicle vehicle ){
        this.vehicles.remove(vehicle);
    }

    public Booking reserveVehicle( Vehicle vehicle, User user, Payment payment, int hours){
        vehicle.setIs_available(false);
        this.num_bookings += 1;
        return new Booking("id"+ num_bookings,user,vehicle,payment,hours);
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

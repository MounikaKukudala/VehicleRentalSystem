import Booking.Booking;
import Payment.Payment;
import RentalOrganization.RentalOrg;
import User.User;
import Vehicles.Bike;
import Vehicles.Car;
import Vehicles.Vehicle;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        RentalOrg rentalOrg = new RentalOrg("id1", "NewGenerationVehicles", "Road No 2, HSR Layout");
        Vehicle hundai = new Car("ABCxyz123");
        Vehicle honda = new Bike("GVF345xde");
        rentalOrg.RegisterVehicles(Arrays.asList(hundai,honda));
        User user = new User("Susmit","Whitefield",56784);
        Payment payment = new Payment("id1", hundai.ChargePrice(8),"GPay" );

        Booking booking = rentalOrg.reserveVehicle(hundai,user,payment,8);

        System.out.println("Hello world!");
    }
}
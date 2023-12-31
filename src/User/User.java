package User;

public class User {
    String name;
    String address;
    int PhoneNumber;

    public User(String name, String address, int phoneNumber) {
        this.name = name;
        this.address = address;
        this.PhoneNumber = phoneNumber;
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

    public int getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        PhoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", PhoneNumber=" + PhoneNumber +
                '}';
    }
}

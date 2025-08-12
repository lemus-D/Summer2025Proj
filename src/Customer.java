public class Customer {
    private String name;
    private route route;
    private String Address;
    private int phoneNumber;

    public Customer(String name, route route, String Address, int phoneNumber) {
        this.name = name;
        this.route = route;
        this.Address = Address;
        this.phoneNumber = phoneNumber;
    }












    public String getName() {
        return name;
    }
    public void setName(String newName) {
        this.name = newName;
    }
    public route getRoute(){
        return route;
    }
    public void setRoute(route newRoute){
        this.route = newRoute;
    }
    public String getAddress() {
        return Address;
    }
    public void setAddress(String newAddress) {
        this.Address = newAddress;
    }
    public int getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(int newPhoneNumber) {
        this.phoneNumber = newPhoneNumber;
    }

}

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









    public enum route {
        MON, TUE, WED, THU, FRI, SAT
    }

}

import java.util.ArrayList;

public class MasterList {
    private ArrayList<ArrayList <Customer>> masterList;
    public MasterList() {
        ArrayList <Customer> mondayRoute = new ArrayList<>();
        ArrayList <Customer> tuesdayRoute = new ArrayList<>();
        ArrayList <Customer> wednesdayRoute = new ArrayList<>();
        ArrayList <Customer> thursdayRoute = new ArrayList<>();
        ArrayList <Customer> fridayRoute = new ArrayList<>();
        ArrayList <Customer> saturdayRoute = new ArrayList<>();
        masterList = new ArrayList<>();
        masterList.add(mondayRoute);
        masterList.add(tuesdayRoute);
        masterList.add(wednesdayRoute);
        masterList.add(thursdayRoute);
        masterList.add(fridayRoute);
        masterList.add(saturdayRoute);
    }
    public MasterList(ArrayList<ArrayList<Customer>> list) {
        this.masterList = list;
    }

    public void addCustomer(Customer customer) {
        route newCustomerRoute = customer.getRoute() ;
        if (newCustomerRoute == route.MON) {
            masterList.get(0).add(customer);
        } else if (newCustomerRoute == route.TUE) {
            masterList.get(1).add(customer);
        } else if (newCustomerRoute == route.WED) {
            masterList.get(2).add(customer);
        } else if (newCustomerRoute == route.THU) {
            masterList.get(3).add(customer);
        } else if (newCustomerRoute == route.FRI) {
            masterList.get(4).add(customer);
        } else if (newCustomerRoute == route.SAT) {
            masterList.get(5).add(customer);
        }
    }

}

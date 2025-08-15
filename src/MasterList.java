import java.util.ArrayList;

public class MasterList {
    private ArrayList<ArrayList<Customer>> masterList;

    public MasterList() {
        ArrayList<Customer> mondayRoute = new ArrayList<>();
        ArrayList<Customer> tuesdayRoute = new ArrayList<>();
        ArrayList<Customer> wednesdayRoute = new ArrayList<>();
        ArrayList<Customer> thursdayRoute = new ArrayList<>();
        ArrayList<Customer> fridayRoute = new ArrayList<>();
        ArrayList<Customer> saturdayRoute = new ArrayList<>();
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
        route newCustomerRoute = customer.getRoute();
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

    public String removeCustomer(Customer customer) {
        for (ArrayList<Customer> routeList : masterList) {
            if (routeList.remove(customer)) {
                return customer.getName() + " has been removed.";
            }
        }
        return "Customer " + customer.getName() + " was not found.";
    }


    public void printAllRoutes() {
        route[] days = route.values();

        for (int i = 0; i < days.length; i++) {
            System.out.println("Route: " + days[i]);
            if (masterList.get(i).isEmpty()) {
                System.out.println("  No customers scheduled.");
            } else {
                for (Customer c : masterList.get(i)) {
                    System.out.println("  Name: " + c.getName() + " | Address: " + c.getAddress());
                }
            }
            System.out.println(); // blank line between routes
        }

    }
}

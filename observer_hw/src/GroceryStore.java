import java.util.ArrayList;
import java.util.List;

public abstract class GroceryStore implements Observable{

    List<Observer> customers = new ArrayList<>();

    @Override
    public void addCustomer(Observer customer) {
        customers.add(customer);
        System.out.println("Now, you will get notifications about new events!");
    }

    @Override
    public void removeCustomer(Observer customer) {
        customers.remove(customer);
    }

    @Override
    public void notifyCustomers() {
        for (Observer customer : customers) {
            customer.update();
        }
    }

    //    //notifyingCustomers
//    @Override
//    public void notifySaleCustomers() {
//        for (Observer customer : saleCustomers) {
//            customer.update();
//        }
//    }
//
//    @Override
//    public void notifyItemCustomers() {
//        for (Observer customer : itemCustomers) {
//            customer.update();
//        }
//    }

}

import java.util.ArrayList;
import java.util.List;

public class EventSales extends GroceryStore{

    List<String> sales = new ArrayList<>();

    public void addNewSaleEvent(String sale) {
        sales.add(sale);
        super.notifyCustomers();
        System.out.println("Currently available sales:\n" +sales);
    }

    public void removeSale(Integer index) {
        sales.remove(index);
        super.notifyCustomers();
        System.out.println("Currently available sales:\n" +sales);
    }
}

import java.util.ArrayList;
import java.util.List;

public class EventNewItems extends GroceryStore{

    List<String> items = new ArrayList<>();

    public void addNewItemEvent(String item) {
        items.add(item);
        super.notifyCustomers();
        System.out.println("Currently available sales:\n" + items);
    }

    public void removeItem(Integer index) {
        items.remove(index);
        super.notifyCustomers();
        System.out.println("Currently available sales:\n" + items);
    }
}

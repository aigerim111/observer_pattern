public class ItemCustomers implements Observer{

    String name;

    ItemCustomers(String name) {
        this.name = name;
    }

    @Override
    public void update() {
        System.out.println("Hello, " + name + "\nNew item information has arrived: ");
    }
}

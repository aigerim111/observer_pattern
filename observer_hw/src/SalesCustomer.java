public class SalesCustomer implements Observer{
    String name;

    SalesCustomer(String name){
        this.name = name;
    }

    @Override
    public void update() {
        System.out.print("Hello, " + name + "\nNew sale information is available: ");
    }

}

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        EventNewItems newItems = new EventNewItems();
        EventSales newSales = new EventSales();


        newItems.addNewItemEvent("sweaters arrived");
        newItems.addNewItemEvent("computers arrived");
        newItems.addNewItemEvent("pencils arrived");

        newSales.addNewSaleEvent("Buy a new coke and get free snickers");
        newSales.addNewSaleEvent("20% discount on everything");
        newSales.addNewSaleEvent("Buy 5 sunglasses and get 1 free");


        System.out.println("Hello!What is your name?");
        String name = scanner.nextLine();
        System.out.println("What event do you want to follow?\n1.Sales\n2.New Items");
        Integer choice = scanner.nextInt();

        switch (choice) {
            case 1:
                newSales.addCustomer(new SalesCustomer(name));
                break;
            case 2:
                newItems.addCustomer(new ItemCustomers(name));
                break;
        }

        newSales.addCustomer(new SalesCustomer("Jane"));
        newItems.addCustomer(new ItemCustomers("Ali"));




        newItems.addNewItemEvent("cookies arrived");
        newSales.addNewSaleEvent("1+1 discount is available");

        newItems.removeItem(0);
        newSales.removeSale(1);
    }

}
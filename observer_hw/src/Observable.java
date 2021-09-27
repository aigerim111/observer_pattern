public interface Observable {


    public void addCustomer(Observer customer);
    public void removeCustomer(Observer customer);

    public void notifyCustomers();
}

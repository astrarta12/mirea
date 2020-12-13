package lab30;

public interface Order {
    boolean add(lab30.MenuItem item);
    String[] itemsNames();
    int itemsQuantity();
    int itemQuantity(String itemName);
    int itemQuantity(lab30.MenuItem item);
    lab30.MenuItem[] getItems();
    boolean remove(String itemName);
    boolean remove(lab30.MenuItem item);
    int removeAll(String itemName);
    int removeAll(lab30.MenuItem item);
    lab30.MenuItem[] sortedItemByCostDesc();
    int costTotal();
    lab30.Customer getCustomer();
    void setCustomer(lab30.Customer customer);
}

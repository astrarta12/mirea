package lab32;

public interface Order {
    boolean add(lab32.MenuItem item);
    String[] itemsNames();
    int itemsQuantity();
    int itemQuantity(String itemName);
    int itemQuantity(lab32.MenuItem item);
    lab32.MenuItem[] getItems();
    boolean remove(String itemName);
    boolean remove(lab32.MenuItem item);
    int removeAll(String itemName);
    int removeAll(lab32.MenuItem item);
    lab32.MenuItem[] sortedItemByCostDesc();
    int costTotal();
    lab32.Customer getCustomer();
    void setCustomer(lab32.Customer customer);
}


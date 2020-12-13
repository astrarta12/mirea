package lab29;

public interface Order {
    boolean add(lab29.Item item);
    String[] itemsNames();
    int itemsQuantity();
    int itemQuantity(String itemName);
    lab29.Item[] getItems();
    boolean remove(String itemName);
    int removeAll(String itemName);
    lab29.Item[] sortedItemByCostDesc();
    int costTotal();
}

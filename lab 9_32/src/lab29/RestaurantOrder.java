package lab29;

public class RestaurantOrder implements lab29.Order {

    private lab29.Item[] items;

    public RestaurantOrder(lab29.Item[] items) {
        this.items = items;
    }

    @Override
    public int itemsQuantity() {
        return items.length;
    }

    @Override
    public int itemQuantity(String itemName) {
        int count = 0;
        for (lab29.Item item: items) {
            if (item.getName().equals(itemName)) {
                count += 1;
            }
        }
        return count;
    }

    @Override
    public lab29.Item[] getItems() {
        return items;
    }

    @Override
    public int costTotal() {
        int total = 0;
        for (lab29.Item item : items) {
            total += item.getPrice();
        }
        return total;
    }

    @Override
    public boolean add(lab29.Item item) {
        return false;
    }

    @Override
    public String[] itemsNames() {
        return new String[0];
    }

    @Override
    public boolean remove(String itemName) {
        return false;
    }

    @Override
    public int removeAll(String itemName) {
        return 0;
    }

    @Override
    public lab29.Item[] sortedItemByCostDesc() {
        return new lab29.Item[0];
    }
}

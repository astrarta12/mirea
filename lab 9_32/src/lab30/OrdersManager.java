package lab30;

public interface OrdersManager {
    int itemsQuantity(String itemName);
    int itemsQuantity(lab30.MenuItem item);
    Order[] getOrders();
    int ordersCostSummary();
    int ordersQuantity();
}


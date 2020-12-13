package lab30;

import java.util.Arrays;

public class InternetOrdersManager implements lab30.OrdersManager {

    private static class Node {
        Node prev, next;
        lab30.Order order;

        public Node(Node prev, Node next, lab30.Order order) {
            this.prev = prev;
            this.next = next;
            this.order = order;
        }
    }

    private Node head = null, tail = null;
    private int size = 0;

    public boolean add(lab30.Order order) {
        if (head == null) {
            head = tail = new Node(null, null, order);
        } else {
            tail.next = new Node(tail, null, order);
            tail = tail.next;
        }
        size += 1;
        return true;
    }

    public lab30.Order remove() {
        if (tail != null) {
            lab30.Order order = tail.order;
            tail = tail.prev;
            size -= 1;
            return order;
        }
        return null;
    }

    public lab30.Order order() {
        return tail.order;
    }

    @Override
    public int itemsQuantity(String itemName) {
        return Arrays.stream(getOrders())
                .map(order -> order.itemQuantity(itemName))
                .reduce(0, Integer::sum);
    }

    @Override
    public int itemsQuantity(lab30.MenuItem item) {
        return itemsQuantity(item.getName());
    }

    @Override
    public lab30.Order[] getOrders() {
        lab30.Order[] orders = new lab30.Order[size];
        Node current = head;
        for (int i = 0; i < size; i++) {
            orders[i] = current.order;
            current = current.next;
        }
        return orders;
    }

    @Override
    public int ordersCostSummary() {
        return Arrays.stream(getOrders())
                .map(lab30.Order::costTotal)
                .reduce(0, Integer::sum);
    }

    @Override
    public int ordersQuantity() {
        return Arrays.stream(getOrders())
                .map(lab30.Order::itemsQuantity)
                .reduce(0, Integer::sum);
    }
}

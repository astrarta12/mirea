package lab29;

public class InternetOrder implements Order {

    private static class Node {
        Node prev, next;
        lab29.Item item;

        public Node(Node prev, Node next, lab29.Item item) {
            this.prev = prev;
            this.next = next;
            this.item = item;
        }
    }

    private Node head = null, tail = null;
    private int size = 0;

    @Override
    public boolean add(lab29.Item item) {
        if (head == null) {
            head = tail = new Node(null, null, item);
        } else {
            tail = new Node (tail, null, item);
        }
        size += 1;
        return true;
    }

    @Override
    public int itemsQuantity() {
        return size;
    }

    @Override
    public int itemQuantity(String itemName) {
        Node current = head;
        int quantity = 0;
        while (current != null) {
            if (current.item.getName().equals(itemName)) {
                quantity += 1;
            }
            current = current.next;
        }
        return quantity;
    }

    @Override
    public lab29.Item[] getItems() {
        lab29.Item[] order = new lab29.Item[size];
        Node current = head;
        for (int i = 0; i < size; i++) {
            order[i] = current.item;
            current = current.next;
        }
        return order;
    }

    @Override
    public boolean remove(String itemName) {
        Node current = head;
        while (current != null) {
            if (current.item.getName().equals(itemName)) {
                if (current.prev == null) {
                    head = current.next;
                } else {
                    current.prev = current.next;
                }
                size -= 1;
                return true;
            }
            current = current.next;
        }
        return false;
    }

    @Override
    public int removeAll(String itemName) {
        Node current = head;
        int count = 0;
        while (current != null) {
            if (current.item.getName().equals(itemName)) {
                if (current.prev == null) {
                    head = current.next;
                } else {
                    current.prev = current.next;
                }
                count += 1;
            }
            current = current.next;
        }
        size -= count;
        return count;
    }

    @Override
    public int costTotal() {
        Node current = head;
        int total = 0;
        while (current != null) {
            total += current.item.getPrice();
            current = current.next;
        }
        return total;
    }

    @Override
    public String[] itemsNames() {
        return new String[0];
    }

    @Override
    public lab29.Item[] sortedItemByCostDesc() {
        return new lab29.Item[0];
    }
}


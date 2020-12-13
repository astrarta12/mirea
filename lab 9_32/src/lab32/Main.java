package lab32;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        TableOrder order = new TableOrder();
        order.add(
                new Dish(140,"Ice cream","Dessert")
        );
        order.add(
                new Dish(500,"Blueberry Cake","Dessert")
        );

        order.setCustomer(Customer.NOT_MATURE_UNKNOWN_CUSTOMER);

        TableOrdersManager ordersManager = new TableOrdersManager();
        ordersManager.add(order, 16);

        FileOutputStream fileOutputStream = new FileOutputStream("test.dump");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(ordersManager);
        objectOutputStream.close();


        FileInputStream fileInputStream = new FileInputStream("test.dump");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        ordersManager = (TableOrdersManager) objectInputStream.readObject();
        objectInputStream.close();

        System.out.println(ordersManager.ordersCostSummary());
    }

}

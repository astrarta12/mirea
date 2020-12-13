package lab30;

public class Main {
    public static void main(String[] args) {
        lab30.TableOrder order = new lab30.TableOrder();
        order.add(
                new lab30.Dish(140,"Ice cream","Dessert")
        );
        order.add(
                new lab30.Dish(500,"Blueberry Cake","Dessert")
        );

        order.setCustomer(lab30.Customer.NOT_MATURE_UNKNOWN_CUSTOMER);

        lab30.TableOrdersManager ordersManager = new lab30.TableOrdersManager();
        ordersManager.add(order, 16);

        System.out.println(ordersManager.ordersCostSummary());
    }

}


package Lab_7;

public class Table extends Furniture{

    public void getBroken(){
        System.out.println("Table is broken");
    }

    public void getFixed(){
        System.out.println("Table is fixed");
    }

    @Override
    public String toString() {
        return String.format("Table Color: %s, Material: %s", color, material);
    }
}

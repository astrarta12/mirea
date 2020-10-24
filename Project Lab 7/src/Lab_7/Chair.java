package Lab_7;

public class Chair extends Furniture{

    public void getBroken(){
        System.out.println("Chair is broken");
    }

    public void getFixed(){
        System.out.println("Chair is fixed");
    }

    @Override
    public String toString() {
        return String.format("Chair Color: %s, Material: %s", color, material);
    }
}

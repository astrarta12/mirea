package Lab_7;

import java.util.Scanner;

public abstract class Dish {
    private String color;
    private String material;
    public abstract void getBroken();
    public abstract void getDirty();

    public void setColor() {
        System.out.println("Set color");
        Scanner scan = new Scanner(System.in);
        this.color = scan.nextLine();
    }

    public void setMaterial() {
        System.out.println("Set material");
        Scanner scan = new Scanner(System.in);
        this.material = scan.nextLine();
    }

    @Override
    public String toString() {
        return String.format("Cup {Color: %s, Material: %s}", color, material);
    }

    public void welcome(){
        System.out.println("Dish Task");
    }
}

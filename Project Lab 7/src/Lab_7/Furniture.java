package Lab_7;

import java.util.Scanner;

public abstract class Furniture {
    protected String color;
    protected String material;

    public abstract String toString();
    public abstract void getBroken();
    public abstract void getFixed();

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

    public void welcome(){
        System.out.println("Furniture Task");
    }
}

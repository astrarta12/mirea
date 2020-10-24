package Lab_7;

import java.util.Scanner;

public abstract class Dog {
    private String color;
    private String name;
    private int age;
    public abstract void bark();
    public abstract void sit();

    public void setColor() {
        System.out.println("Set color");
        Scanner scan = new Scanner(System.in);
        this.color = scan.nextLine();
    }

    public void setName() {
        System.out.println("Set name");
        Scanner scan = new Scanner(System.in);
        this.name = scan.nextLine();
    }

    public void setAge() {
        System.out.println("Set age");
        Scanner scan = new Scanner(System.in);
        this.age = scan.nextInt();
    }

    public void welcome(){
        System.out.println("Dog Task");
    }

    @Override
    public String toString() {
        return String.format("Dog Name: %s\n Age: %d\n Color: %s", name, age, color);
    }
}

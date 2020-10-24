package Lab_7;

import java.util.Scanner;

public class MainTest7 {
    public static void main(String[] args) {
        int choice = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Выберите номер задания от 1 до 4. Для завершения работы программы выберите 0. ");
        choice = scan.nextInt();
        switch (choice) {
            case (1):
                Cup cup = new Cup();
                cup.welcome();
                cup.setColor();
                cup.setMaterial();
                cup.getBroken();
                cup.getDirty();
                System.out.println(cup.toString());
                Plate plate = new Plate();
                plate.setColor();
                plate.setMaterial();
                plate.getBroken();
                plate.getDirty();
                System.out.println(plate.toString());
                break;
            case (2):
                Labrador labrador = new Labrador();
                labrador.welcome();
                labrador.setName();
                labrador.setAge();
                labrador.setColor();
                labrador.bark();
                labrador.sit();
                System.out.println(labrador.toString());
                JackRussell jackrussell = new JackRussell();
                jackrussell.setName();
                jackrussell.setAge();
                jackrussell.setColor();
                jackrussell.bark();
                jackrussell.sit();
                System.out.println(jackrussell.toString());
                break;
            case (3):
                Chair chair = new Chair();
                chair.welcome();
                chair.setColor();
                chair.setMaterial();
                chair.getBroken();
                chair.getFixed();
                Table table = new Table();
                table.setColor();
                table.setMaterial();
                table.getBroken();
                table.getFixed();
                break;
            case (4):
                FurnitureShop furnitureshop = new FurnitureShop();
                furnitureshop.welcome();
                furnitureshop.customerChairChoice();
                furnitureshop.customerTableChoice();
                break;
            default:
                break;
        }
    }
}
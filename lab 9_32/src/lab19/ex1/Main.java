package lab19.ex1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите ИНН");
        String[] values = scanner.nextLine().split(" ");
        if (values.length == 4) {
            try {
                Validator<String> validator = new ItnValidator();
                validator.validate(values[3]);
                System.out.println("верный ИНН");
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}

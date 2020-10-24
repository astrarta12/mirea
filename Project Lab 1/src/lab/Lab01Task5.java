package lab;

import java.util.Scanner;

public class Lab01Task5 {
    private Scanner scan = new Scanner(System.in);
    private int result = 1, a;

    public void getNum() {
        System.out.println("Введите число");
        a = scan.nextInt();
        scan.close();
    }

    public void factorialNum() {

        if (a != 0) {
            for (int i = 1; i <= a; i++) {
                result = result * i;
            }
        }
        else result = 1;
        System.out.println(result);
    }
}
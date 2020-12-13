package lab25.ex3;

import lab25.ex2.AddressUtils;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String adress = scanner.nextLine();
        lab25.ex2.AddressUtils addressUtils = new AddressUtils(adress);
        if (addressUtils.isValidIPv4(adress))
            System.out.println("IP адресс верный");
        else
            System.out.println("IP адресс неверный");
    }
}

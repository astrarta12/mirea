package lab25.ex2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String address = scanner.nextLine();
        AddressUtils addressUtils = new AddressUtils(address);
        if (addressUtils.isValidIPv4(address))
            System.out.println("IP адресс верный");
        else
            System.out.println("IP адресс неверный");
    }
}

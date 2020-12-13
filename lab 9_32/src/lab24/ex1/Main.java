package lab24.ex1;

import java.util.Scanner;

public class Main {
    public static void main(String []args){
        Scanner scanner = new Scanner(System.in);
        lab24.ex1.Person person = new lab24.ex1.Person(scanner.nextLine());
        System.out.println(person.nameHandler());
    }
}

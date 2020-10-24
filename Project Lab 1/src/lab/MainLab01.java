package lab;

import java.util.Scanner;

public class MainLab01 {
    public static void main(String[] args) {
        int choice = 0;
        //boolean condition = true;
        Scanner scan = new Scanner(System.in);
        System.out.println("Выберите номер задания от 1 до 5. Для завершения работы программы выберите 0. ");
        choice = scan.nextInt();
        switch (choice) {
            case (1):
                Lab01Task1 num1 = new Lab01Task1();
                num1.getList();
                num1.fillInList();
                num1.sysOutList();
                num1.sumForWay();
                num1.sumWhileWay();
                num1.sumDoWhileWay();
                break;
            case (2):
                for (String str : args)
                {
                    System.out.println(str);
                }
                break;
            case (3):
                Lab01Task3 num3 = new Lab01Task3();
                num3.harmonicSeriesOut();
                break;
            case (4):
                Lab01Task4 num4 = new Lab01Task4();
                num4.getList();
                num4.fillInListClass();
                num4.clearList();
                num4.fillInListMethod();
                num4.getSorted();
                break;
            case (5):
                Lab01Task5 num5 = new Lab01Task5();
                num5.getNum();
                num5.factorialNum();
                break;
            default:
                break;
        }
    }
}



package lab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lab01Task1 {
    private List<Integer> num = new ArrayList<>();
    private Scanner scan = new Scanner(System.in);
    private int n = 0;

    public void getList(){
        System.out.println("Количество элементов списка: ");
        n = scan.nextInt();
        scan.close();
    }

    public void fillInList() {
        for (int i = 0; i < n; i++) {
            this.num.add((int) (Math.random() * 31) - 15);
        }
    }

    public void sysOutList() {
        System.out.println("Массив целых чисел:");
        for (int i = 0; i < n; i++) {
            System.out.print(num.get(i) + " ");
        }
    }

    public void sumForWay() {
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum = sum + num.get(i);
        }
        System.out.println();
        System.out.println("For");
        System.out.println("Сумма чисел массива равна " + sum);
    }

    public void sumWhileWay(){
        int sum = 0, i = 0;
        while (i<10){
            sum = sum + num.get(i);
            i++;
        }
        System.out.println("While");
        System.out.println("Сумма чисел массива равна " + sum);
    }

    public void sumDoWhileWay(){
        int sum = 0, i = 0;
        do{
            sum = sum + num.get(i);
            i++;
        }while (i<10);
        System.out.println("Do-while");
        System.out.println("Сумма чисел массива равна " + sum);
    }

}

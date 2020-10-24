package lab;

import java.util.*;

public class Lab01Task4 {
    private List<Integer> num = new ArrayList<>();
    private Scanner scan = new Scanner(System.in);
    private int n = 0;

    public void getList() {
        System.out.println("Количество элементов списка: ");
        n = scan.nextInt();
        scan.close();
    }

    public void clearList(){
        this.num.clear();
    }

    public void fillInListMethod() {
        for (int i = 0; i < n; i++) {
            this.num.add((int) (Math.random() * 31) - 15);
        }
        System.out.println("Массив:");
        outputArray();
    }

    public void fillInListClass() {
        Random tmp = new Random();
        for (int i = 0; i < n; i++) {
            this.num.add(tmp.nextInt(31) - 15);
        }
        System.out.println("Массив:");
        outputArray();
    }

    public void outputArray() {
        for (int i = 0; i < n; i++) {
            System.out.print(num.get(i) + " ");
            if (i == n - 1) {
                System.out.println();
            }
        }
    }

    public void getSorted(){
        Collections.sort(num);
        System.out.println("Отсортированный массив:");
        outputArray();
    }
}

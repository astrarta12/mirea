package lab17.ex3;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        FileOutputStream fileOutputStream = new FileOutputStream("C:\\Users\\LAVETTI\\Documents\\Tanya.txt", false);
        PrintWriter printWriter = new PrintWriter(fileOutputStream);
        Scanner scanner = new Scanner(System.in);
        printWriter.print(scanner.nextLine());
        printWriter.close();
    }
}

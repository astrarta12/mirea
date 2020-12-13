package lab17.ex1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        FileOutputStream fileOutputStream = new FileOutputStream("C:\\Users\\Алешка\\Documents\\JavaLab.txt");
        PrintWriter printWriter = new PrintWriter(fileOutputStream);
        Scanner scanner = new Scanner(System.in);
        printWriter.print(scanner.nextLine());
        printWriter.close();
    }
}

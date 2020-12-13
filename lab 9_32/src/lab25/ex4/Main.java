package lab25.ex4;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String expression = scanner.nextLine();
        String str = expression;
        Pattern pattern = Pattern.compile("\\([\\d+/*-]*\\)");
        Matcher matchers = pattern.matcher(expression);
        do {
            expression = matchers.replaceAll("");
            matchers = pattern.matcher(expression);
        }
        while (matchers.find());
        if (expression.matches("[\\d+/*-]*"))
            System.out.println(str);
    }
}

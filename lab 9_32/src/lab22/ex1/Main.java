package lab22.ex1;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Main {

    public static void main(String[] args) throws ParseException {
        DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        lab22.ex1.Student student = new lab22.ex1.Student("Kate", 19, 3, 4.5,
                dateFormat.parse("23-09-2001"));
        System.out.println(student.getBirthDate("full"));
    }

}
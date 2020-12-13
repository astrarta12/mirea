package lab13.ex3;

import java.util.*;

public class MergeLists {
    Student[] studentsm = {
            new Student( "Archi", 1,20, 4.5),
            new Student( "Barry", 2, 19, 3.6),
            new Student("Clay", 3, 19, 5),
    };
    Student[] studentsf = {
            new Student( "Lex", 4,18, 4.5),
            new Student( "Betty", 5, 18, 3.6),
            new Student( "Kate", 6, 19, 5),
    };
    public void merge(){
        List <Student> list_of_studm = Arrays.asList(studentsm);
        List <Student> list_of_studmf = Arrays.asList(studentsf);
        List <Student> list_of_res = new ArrayList<Student>();
        list_of_res.addAll(list_of_studm);
        list_of_res.addAll(list_of_studmf);
        Collections.sort(list_of_res, Comparator.comparing(Student::getName));
        System.out.println(list_of_res.toString());
    }
}


package lab14.ex1;

public class Main {
    public static void main(String []args){
        lab14.ex1.Search src = new lab14.ex1.Search();
        Student[] students = {
                new Student( "Archi", 1,20, 4.5),
                new Student( "Barry", 2, 19, 3.6),
                new Student("Clay", 3, 19, 5),
        };
        System.out.println(src.search(students, "Иванов").toString()+"\n");
        students = src.sort(students);
        for (Student student : students){
            System.out.println(student.toString());
        }
    }
}

package lab14.ex3;
public class Main {
    public static void main(String []args){
        Search src = new Search();
        Student[] students = {
                new Student( "Archy", 1,20, 4.5),
                new Student( "Barry", 2, 19, 3.6),
                new Student("Clay", 3, 19, 5),
        };
        Student student1 = new Student( "Barry", 2, 19, 3.6);
        System.out.println(src.recursiveBinarySearch(students, students[0].getIDNumber(), students[2].getIDNumber(),student1));
        src.linearSearch(students, 2);
        students = src.sort(students);
        src.binarySearch(students,student1);
    }
}

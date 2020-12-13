package lab14.ex1;

public class Search {
    public Student search(Student[] students, String name){
        for (Student student : students){
            if (student.getName() == name){
                return student;
            }
        }
        return null;
    }
    public Student[] sort(Student[] students){
        int min;
        Student temp;
        for (int index = 0; index < students.length-1; index++)
        {
            min = index;
            for (int scan = index+1; scan < students.length; scan++)
                if (students[scan].getiDNumber() < (students[min]).getiDNumber())
                    min = scan;
            temp = students[min];
            students[min] = students[index];
            students[index] = temp;
        }
        return students;
    }
}

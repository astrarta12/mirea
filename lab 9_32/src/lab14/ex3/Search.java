package lab14.ex3;


public class Search {
    public Student[] sort (Student[] students){
        int min;
        Student temp;
        for (int index = 0; index < students.length-1; index++)
        {
            min = index;
            for (int scan = index+1; scan < students.length; scan++)
                if (students[scan].getIDNumber() < (students[min]).getIDNumber())
                    min = scan;
            temp = students[min];
            students[min] = students[index];
            students[index] = temp;
        }
        for (Student student : students){
            System.out.println(student.toString());
        }
        return null;
    }

    public int binarySearch(Student[] students, Student student) {
        long start = System.currentTimeMillis();
        int firstIndex = 0;
        int lastIndex = students.length - 1;
        while(firstIndex <= lastIndex) {
            int middleIndex = (firstIndex + lastIndex) / 2;
            if (students[middleIndex] == student) {
                long finish = System.currentTimeMillis();
                long elapsed = finish - start;
                System.out.println("Время: "+elapsed);
                System.out.println (middleIndex);
            }
            else if (students[middleIndex].getIDNumber() < student.getIDNumber())
                firstIndex = middleIndex + 1;
            else if (students[middleIndex].getIDNumber() > student.getIDNumber())
                lastIndex = middleIndex - 1;
        }
        return -1;
    }

    public int recursiveBinarySearch(Student[] students, int firstElement, int lastElement, Student student) {
        long start = System.currentTimeMillis();
        if (lastElement >= firstElement) {
            int mid = firstElement + (lastElement - firstElement) / 2;
            if (students[mid] == student) {
                long finish = System.currentTimeMillis();
                long elapsed = finish - start;
                System.out.println("Время: " + elapsed);
                System.out.println(mid);
            }
            if (students[mid].getIDNumber() > student.getIDNumber())
                return recursiveBinarySearch(students, firstElement, mid - 1, student);
            return recursiveBinarySearch(students, mid + 1, lastElement, student);
        }
        return -1;
    }

    public int linearSearch(Student[] students, double number) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 2; i++) {
            if (number == students[i].getIDNumber()) {
                System.out.println(number+" position -  "+(i+1));
                long finish = System.currentTimeMillis();
                long elapsed = finish - start;
                System.out.println("Время: "+elapsed);
                break;
            }
        }
        return 0;
    }
}

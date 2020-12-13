package lab22.ex3;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
        lab22.ex3.Task task = new lab22.ex3.Task(
                "You",
                new Date(System.currentTimeMillis() + 7 * 1000 * 60 * 60 * 24)
        );
        System.out.println(task.getAssignee() + " should complete task in "
                         + task.durationTillDeadline().toDays() + " days");
    }

}

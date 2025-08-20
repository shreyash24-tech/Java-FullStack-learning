
import java.util.*;

class ToDoList {

    static String task[] = new String[100];
    static int task_count = 0;
    static Scanner sc = new Scanner(System.in);

    public static void main(String args[]) {

        int ch = 0;

        do {
            System.out.println("-------------MENU-------------");
            System.out.println("1-AddTask");
            System.out.println("2-RemoveTask");
            System.out.println("3-ViewTask");
            System.out.println("4-Exit");

            System.out.println("Enter the choice=");
            ch = sc.nextInt();

            switch (ch) {
                case 1 ->
                    addTask();
                case 2 ->
                    removeTask();
                case 3 ->
                    viewTask();
                case 4 ->
                    System.out.print("Thank You");
                default :
                    System.out.println("ERROR");

            }
        } while (ch != 4);

    }

    public static void addTask() {
        if (task_count < task.length) {
            System.out.println("Enter your task=");
            sc.nextLine();
            task[task_count] = sc.nextLine();
            System.out.println("Task added Succesfully");
            task_count++;
        } else {
            System.out.println("Error=");

        }
    }

    public static void removeTask() {
        viewTask();
        if(task_count ==0)
        {
            print("No Task to Remove");
        }

        System.out.println("Enter the Task no=");
        int tasknum = sc.nextInt();

        for (int i = tasknum - 1; i < task_count - 1; i++) {
            task[i] = task[i + 1];

        }
        task_count--;
        System.out.println("Task is Removed Successfully");

    }

    public static void viewTask() {
        if (task_count == 0) {
            System.out.println("No task found yet");
        } else {
            for (int i = 0; i < task_count; i++) {
                System.out.println((i + 1) + "." + task[i]);

            }
        }
    }
}

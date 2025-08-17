import java.util.*;

class Student {
    Scanner sc = new Scanner(System.in);
    int roll;
    String name;
    int marks;

    void accept() {
        System.out.println("Enter the roll no =");
        roll = sc.nextInt();
        System.out.println("Enter the name =");
        name = sc.next();
        System.out.println("Enter the marks =");
        marks = sc.nextInt();
    }

    void display() {
        System.out.println("Roll no = " + roll);
        System.out.println("Name = " + name);
        System.out.println("Marks = " + marks);
        System.out.println("----------------------");
    }
}

public class StudentManagement {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Student[] s = new Student[10]; // Array of objects
        int n = 0; // number of students
        int ch;

        System.out.println("MENU");
        System.out.println("1 - ENROLL STUDENTS");
        System.out.println("2 - ADD NEW STUDENT");
        System.out.println("3 - DELETE STUDENT");
        System.out.println("4 - DISPLAY STUDENTS");
        System.out.println("5 - EXIT");

        do {
            System.out.println("Enter your choice =");
            ch = sc.nextInt();

            switch (ch) {
                case 1: // ENROLL
                    System.out.println("Enter the number of students =");
                    n = sc.nextInt();
                    for (int i = 0; i < n; i++) {
                        s[i] = new Student(); // create object before using
                        s[i].accept();
                    }
                    break;

                case 2: // ADD
                    if (n >= s.length) {
                        System.out.println("Student list full!");
                        break;
                    }
                    System.out.println("Enter the position (0-" + n + ") =");
                    int pos = sc.nextInt();
                    if (pos < 0 || pos > n) {
                        System.out.println("Invalid position!");
                        break;
                    }
                    for (int i = n; i > pos; i--) {
                        s[i] = s[i - 1];
                    }
                    s[pos] = new Student();
                    s[pos].accept();
                    n++;
                    break;

                case 3: // DELETE
                    if (n == 0) {
                        System.out.println("No students to delete!");
                        break;
                    }
                    System.out.println("Enter the position to delete (0-" + (n - 1) + ") =");
                    int pos1 = sc.nextInt();
                    if (pos1 < 0 || pos1 >= n) {
                        System.out.println("Invalid position!");
                        break;
                    }
                    for (int i = pos1; i < n - 1; i++) {
                        s[i] = s[i + 1];
                    }
                    s[n - 1] = null; // clear last
                    n--;
                    break;

                case 4: // DISPLAY
                    if (n == 0) {
                        System.out.println("No students enrolled yet.");
                    } else {
                        for (int i = 0; i < n; i++) {
                            s[i].display();
                        }
                    }
                    break;

                case 5:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }
        } while (ch != 5);
    }
}

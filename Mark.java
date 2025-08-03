import java.util.Scanner;

public class Mark {
    public static void main(String[] args) {
        Scanner student = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = student.nextInt();

        int[][] StudentMarks = new int[n][3];
        while (true) {
            System.out.println("\nMENU");
            System.out.println("1. Add student marks");
            System.out.println("2. Update student mark");
            System.out.println("3. Get the average for a subject");
            System.out.println("4. Get the average for a student");
            System.out.println("5. Get the total mark of a student");
            System.out.println("6. Exit");

            System.out.print("Choose option (1-6): ");
            int choice = student.nextInt();

            if (choice == 1) {
                for (int i = 0; i < n; i++) {
                    System.out.println("Enter marks for student " + (i + 1));
                    System.out.print("Mathematics: ");
                    StudentMarks[i][0] = student.nextInt();
                    System.out.print("Chemistry: ");
                    StudentMarks[i][1] = student.nextInt();
                    System.out.print("Physics: ");
                    StudentMarks[i][2] = student.nextInt();
                }

            } else if (choice == 2) {
                System.out.print("Enter student ID (1 to " + n + "): ");
                int id = student.nextInt();
                System.out.println("1. Math  2. Chem  3. Phys");
                System.out.print("Choose subject to update: ");
                int subject = student.nextInt();
                System.out.print("Enter new mark: ");
                int newMark = student.nextInt();
                StudentMarks[id - 1][subject - 1] = newMark;
                System.out.println("Mark updated!");

            } else if (choice == 3) {
                System.out.println("1. Math  2. Chem  3. Phys");
                System.out.print("Choose subject: ");
                int subject = student.nextInt();
                int total = 0;
                for (int i = 0; i < n; i++) {
                    total += StudentMarks[i][subject - 1];
                }
                System.out.println("Average for subject: " + (total / (double)n));

            } else if (choice == 4) {
                System.out.print("Enter student ID (1 to " + n + "): ");
                int id = student.nextInt();
                int total = StudentMarks[id - 1][0] + StudentMarks[id - 1][1] + StudentMarks[id - 1][2];
                System.out.println("Average for student: " + (total / 3.0));

            } else if (choice == 5) {
                System.out.print("Enter student ID (1 to " + n + "): ");
                int id = student.nextInt();
                int total = StudentMarks[id - 1][0] + StudentMarks[id - 1][1] + StudentMarks[id - 1][2];
                System.out.println("Total marks: " + total);

            } else if (choice == 6) {
                System.out.println("Exiting...");
                break;

            } else {
                System.out.println("Invalid option.");
            }
        }

        student.close();
    }
}

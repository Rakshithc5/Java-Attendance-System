import java.util.*;

public class AttendanceSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, Boolean> attendance = new HashMap<>();

        System.out.println("Enter number of students: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter student name: ");
            String name = sc.nextLine();
            System.out.print("Is present? (yes/no): ");
            String status = sc.nextLine();
            attendance.put(name, status.equalsIgnoreCase("yes"));
        }

        System.out.println("\nAttendance Report:");
        for (String student : attendance.keySet()) {
            System.out.println(student + " - " + (attendance.get(student) ? "Present" : "Absent"));
        }
    }
}

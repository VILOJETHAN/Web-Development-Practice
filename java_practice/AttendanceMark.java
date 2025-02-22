import java.util.Scanner;

public class AttendanceMark {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter student name: ");
        String name = input.nextLine();
        System.out.print("Enter student register number: ");
        String regNo = input.nextLine();
        System.out.print("Enter total number of working days in the semester: ");
        int totalDays = input.nextInt();
        System.out.print("Enter number of days present: ");
        int presentDays = input.nextInt();

        double attendancePercentage = (presentDays * 100.0) / totalDays;
        int attendanceMark = 0;

        if (attendancePercentage >= 90) {
            attendanceMark = 5;
        } else if (attendancePercentage >= 80 && attendancePercentage < 90) {
            attendanceMark = 4;
        } else if (attendancePercentage >= 75 && attendancePercentage < 80) {
            attendanceMark = 3;
        } else {
            attendanceMark = 0;
        }

        System.out.println("Student Name: " + name);
        System.out.println("Student Register Number: " + regNo);
        System.out.println("Attendance Percentage: " + attendancePercentage + "%");
        System.out.println("Attendance Mark: " + attendanceMark);
    }
}
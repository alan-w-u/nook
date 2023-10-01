import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        StudySpace nest = new StudySpace("Nest", 10, 500);
        StudyRoom ikb = new StudyRoom("IKB", 5, 50, 9, 15);

        Student s1 = new Student("Student 1");
        Student s2 = new Student("Student 2");

        System.out.println("Nest or IKB or quit?");
        String temp = scan.next();
        while (!temp.equals("quit")) {
            if (temp.equals("Nest")) {
                System.out.println("Nest capacity: " + nest.getCapacity());
                System.out.println("Add or Remove Student or Capacity?");
                String ans = scan.next();
                if (ans.equals("Add")) {
                    nest.addStudent();
                    System.out.println("Student added!");
                } else if (ans.equals("Remove")) {
                    nest.removeStudent();
                    System.out.println("Student removed!");
                } else if (ans.equals("Capacity")) {
                    System.out.println("Nest full rating: " + nest.howFull() + "%");
                } else {
                    System.out.println("No student added");
                }
                System.out.println("Nest Capacity: " + nest.getCapacity());
            }
            if (temp.equals("IKB")) {
                System.out.println("IKB capacity: " + ikb.getCapacity());
                System.out.println("Time-slots, Add-booking, Remove-booking, Check-bookings?");
                String ans1 = scan.next();
                if (ans1.equals("Time-slots")) {
                    System.out.println("IKB available time slots: " + ikb.getTimeSlots());
                } else if (ans1.equals("Add-booking")) {
                    System.out.println("Start time?");
                    int start = Integer.parseInt(scan.next());
                    System.out.println("End?");
                    int end = Integer.parseInt(scan.next());
                    ikb.addBooking(s1, start, end);
                    System.out.println("s1 bookings" + s1.getlob(ikb));
                } else if (ans1.equals("Remove-booking")) {
                    s1.removeBooking(ikb);
                    System.out.println("REMOVED STUDENT 1");
                } else if (ans1.equals("Check-bookings")) {
                    System.out.println("IKB bookings " + ikb.printBookings(ikb));
                }
            }
            System.out.println("Nest or IKB or quit?");
            temp = scan.next();
        }
    }
}

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
                System.out.println("A to add Student, D to remove student, C to check Capacity or R to return?");
                String ans = scan.next();
                while(!ans.equals("R")) {
                    if (ans.equals("A")) {
                        nest.addStudent();
                        System.out.println("Student added!");
                    } else if (ans.equals("D")) {
                        nest.removeStudent();
                        System.out.println("Student removed!");
                    } else if (ans.equals("C")) {
                        System.out.println("Nest full rating: " + nest.howFull() + "%");
                    } else {
                        System.out.println("No student added");
                    }
                    System.out.println("Nest Capacity: " + nest.getCapacity());
                    ans = scan.next();
                }
            }
            if (temp.equals("IKB")) {
                System.out.println("IKB capacity: " + ikb.getCapacity());
                System.out.println("T for Time-slots, A to Add-booking, D to Remove-booking, C to Check-bookings or R to return?");
                String ans1 = scan.next();
                while (!ans1.equals("R")) {
                    if (ans1.equals("T")) {
                        System.out.println("IKB available time slots: " + ikb.getTimeSlots());
                    } else if (ans1.equals("A")) {
                        System.out.println("Start time?");
                        int start = Integer.parseInt(scan.next());
                        System.out.println("End?");
                        int end = Integer.parseInt(scan.next());
                        ikb.addBooking(s1, start, end);
                        System.out.println("s1 bookings" + s1.getlob(ikb));
                    } else if (ans1.equals("D")) {
                        s1.removeBooking(ikb);
                        System.out.println("REMOVED STUDENT 1");
                    } else if (ans1.equals("C")) {
                        System.out.println("IKB bookings " + ikb.printBookings(ikb));
                    }
                    System.out.println("T for Time-slots, A to Add-booking, D to Remove-booking, C to Check-bookings or R to return?");
                    ans1 = scan.next();
                }
            }
            System.out.println("Nest or IKB or quit?");
            temp = scan.next();
        }
    }
}

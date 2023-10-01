public class main {
    public static void main(String[] args) {
        StudySpace nest = new StudySpace("Nest", 10, 100);
        StudyRoom ikb = new StudyRoom("IKB", 5, 50, 9, 15);

        Student s1 = new Student("Student 1");
        Student s2 = new Student("Student 2");

        System.out.println("Nest capacity: " + nest.getCapacity());
        nest.addStudent();
        nest.addStudent();
        nest.removeStudent();
        System.out.println("Nest capacity: " + nest.getCapacity());
        System.out.println("Nest full rating: " + nest.howFull());

        System.out.println("IKB capacity: " + ikb.getCapacity());
        System.out.println("IKB time slots: " + ikb.getTimeSlots());
        ikb.addBooking(s1, 10, 12);
        ikb.addBooking(s2, 14, 15);
        System.out.println("IKB capacity: " + ikb.getCapacity());
        System.out.println("IKB time slots: " + ikb.getTimeSlots());
        System.out.println(s1.getBookings());
        System.out.println(s2.getBookings());
    }
}

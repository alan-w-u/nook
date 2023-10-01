import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class StudyRoom extends StudySpace {

    private HashMap<Student, List<Integer>> bookings;
    private List<Integer> timeSlots;

    public StudyRoom(String room, int currentCapacity, int maxCapacity, int openTime, int closeTime) {
        super(room, currentCapacity, maxCapacity);
        bookings = new HashMap<>();

        List<Integer> times = new ArrayList<>();

        for (int i = openTime; i <= closeTime; i++) {
            times.add((Integer) i);
        }

        this.timeSlots = times;
    }

    public HashMap<Student, List<Integer>> getBookings() {
        return bookings;
    }

    public List<Integer> getTimeSlots() {
        return timeSlots;
    }

    public void addBooking(Student student, int startTime, int endTime) {
        List<Integer> list = new ArrayList<>();

        for (int i = startTime; i < endTime; i++) {
            if (student.getBookings().containsValue((Integer) i)) {
                return;
            }

            list.add((Integer) i);
        }

        if (!this.bookings.containsKey(student)) {
            bookings.put(student, list);
            student.addBooking(this, startTime, endTime);
        }
    }

    public void removeBooking(Student student) {
        if (bookings.containsKey(student)) {
            bookings.remove(student);
            student.removeBooking(this);
        }
    }
}

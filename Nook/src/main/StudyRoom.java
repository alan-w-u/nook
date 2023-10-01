import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class StudyRoom extends StudySpace {

    private HashMap<Student, List<Integer>> bookings;

    public StudyRoom(String room, int currentCapacity, int maxCapacity, HashMap<Student, List<Integer>> book) {
        super(room, currentCapacity, maxCapacity);
        bookings = book;
    }

    public HashMap<Student, List<Integer>> getBookings() {
        return bookings;
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

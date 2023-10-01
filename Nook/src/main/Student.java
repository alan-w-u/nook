import java.util.ArrayList;
import java.util.List;

import java.util.HashMap;

public class Student {

    private String name;
    private HashMap<StudyRoom, List<Integer>> bookings;

    public Student(String name) {
        this.name = name;
        bookings = new HashMap<>();
    }

    public String getName() {
        return name;
    }

    public HashMap<StudyRoom, List<Integer>> getBookings() {
        return bookings;
    }

    public void addBooking(StudyRoom studyRoom, int startTime, int endTime) {

        List<Integer> list = new ArrayList<>();

        for (int i = startTime; i < endTime; i++) {
            if (studyRoom.getBookings().containsValue((Integer) i)) {
                return;
            }

            list.add((Integer) i);
        }

        if (!this.bookings.containsKey(studyRoom)) {
            bookings.put(studyRoom, list);
            studyRoom.addBooking(this, startTime, endTime);
        }
    }

    public void removeBooking(StudyRoom studyRoom) {
        if (bookings.containsKey(studyRoom)) {
            bookings.remove(studyRoom);
            studyRoom.removeBooking(this);
        }
    }
}

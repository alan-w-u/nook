public class StudyRoom extends StudySpace {

    private HashMap<Student, List<Integer>> bookings;

    public StudyRoom(String r, int ccap, int mcap, HashMap<Student, List<Integer>> book) {
        super(r, ccap, mcap);
        bookings = book;
    }

    public HashMap<Student, List<Integer>> getBookings() {
        return bookings;
    }
    public void addBooking(Student s, int start, int end) {

    }
}

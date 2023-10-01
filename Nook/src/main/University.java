import java.util.ArrayList;
import java.util.List;

public class University {

    private List<StudySpace> campus;

    public University() {
        campus = new ArrayList<>();
    }

    public void addRoom(StudyRoom studyRoom) {
        campus.add(studyRoom);
    }

    public void removeRoom(StudyRoom studyRoom) {
        campus.remove(studyRoom);
    }

    public String allRooms() {
        String temp ="";
        for (StudySpace s : campus) {
            temp += s;
        }

        return temp;
    }

}

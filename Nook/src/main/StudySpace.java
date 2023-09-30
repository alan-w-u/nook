public class StudySpace {

    private String room;
    private int currCap;
    private int maxCap;

    public StudySpace(String r, int ccap, int mcap) {
        room = r;
        currCap = ccap;
        maxCap = mcap;
    }

    public int getCapacity() {
        return currCap;
    }

    public int getMax() {
        return maxCap;
    }

    public String getName() {
        return room;
    }

    public void addStudent() {
        if (currCap++ > maxCap) {

        }
        currCap++;
    }

    public int howFull() {
        if (currCap >= maxCap) {
            return 100;
        }
        return 100 * (currCap / maxCap);
    }
}

public class StudySpace {

    protected String room;
    protected int currentCapacity;
    protected int maxCapacity;

    public StudySpace(String room, int currentCapacity, int maxCapacity) {
        this.room = room;
        this.currentCapacity = currentCapacity;
        this.maxCapacity = maxCapacity;
    }

    public String getName() {
        return room;
    }

    public int getCapacity() {
        return currentCapacity;
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }

    public void addStudent() {
        if (currentCapacity < maxCapacity) {
            currentCapacity++;
        }
    }

    public void removeStudent() {
        if (currentCapacity > 0) {
            currentCapacity--;
        }
    }

    public int howFull() {
        if (currentCapacity >= maxCapacity) {
            return 100;
        }
        return (int)  (100 * ((double) currentCapacity / (double) maxCapacity));
    }
}

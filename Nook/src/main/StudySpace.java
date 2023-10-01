public class StudySpace {

    protected String room;
    protected int currentCapacity;
    protected int maxCapacity;

    public StudySpace(String room, int currentCapacity, int maxCapacity) {
        this.room = room;
        this.currentCapacity = currentCapacity;
        this.maxCapacity = maxCapacity;
    }

    public int getCapacity() {
        return currentCapacity;
    }

    public int getMax() {
        return maxCapacity;
    }

    public String getName() {
        return room;
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
        return 100 * (currentCapacity / maxCapacity);
    }
}

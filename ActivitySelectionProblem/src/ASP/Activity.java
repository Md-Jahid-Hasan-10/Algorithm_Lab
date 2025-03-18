package ASP;

public class Activity {
    private int start;
    private int end;

    public Activity(int start, int end) {
        this.start = start;
        this.end = end;
    }

    public int getStart() {
        return start;
    }

    public int getEnd() {
        return end;
    }

    @Override
    public String toString() {
        return "(" + start + ", " + end + ")";
    }
}


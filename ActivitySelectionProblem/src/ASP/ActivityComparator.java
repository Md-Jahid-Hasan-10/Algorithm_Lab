package ASP;

import java.util.Comparator;

public class ActivityComparator implements Comparator<Activity> {
    @Override
    public int compare(Activity a1, Activity a2) {
        return Integer.compare(a1.getEnd(), a2.getEnd());
    }
}

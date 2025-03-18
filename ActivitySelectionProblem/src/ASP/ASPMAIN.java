package ASP;
import java.util.*;

public class ASPMAIN {
    public static void main(String[] args) {
        List<Activity> activities = Arrays.asList(
            new Activity(1, 3),
            new Activity(2, 4),
            new Activity(3, 5),
            new Activity(0, 6),
            new Activity(5, 7),
            new Activity(8, 9),
            new Activity(5, 9)
        );

        // Sort using ActivityComparator
        activities.sort(new ActivityComparator());

        List<Activity> selectedActivities = new ArrayList<>();
        int lastEndTime = 0;

        for (Activity activity : activities) {
            if (activity.getStart() >= lastEndTime) {
                selectedActivities.add(activity);
                lastEndTime = activity.getEnd();
            }
        }

        // Display selected activities
        System.out.println("Selected Activities:");
        for (Activity a : selectedActivities) {
            System.out.println(a);
        }
    }
}

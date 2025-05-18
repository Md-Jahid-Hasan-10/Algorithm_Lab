package ASP;

import java.util.Comparator;

public class MyComparator implements Comparator<Activity> {

	@Override
	public int compare(Activity o1, Activity o2) {
		// TODO Auto-generated method stub
		return o1.getEnd() - o2.getEnd();
	}

}

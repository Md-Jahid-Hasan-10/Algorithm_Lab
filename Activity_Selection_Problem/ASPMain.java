package ASP;
import java.util.*;
public class ASPMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Activity> list = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("How many Item ?");
		int n;
		n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			System.out.println("Enter activity, start and end time");
			int st,en;
			String activity;
			sc.nextLine();
			activity = sc.nextLine();
			st = sc.nextInt();
			en = sc.nextInt();
			Activity act = new Activity();
			act.setActivity(activity);
			act.setStart(st);
			act.setEnd(en);
			list.add(act);
		}
		Collections.sort(list,new MyComparator());
		//list.sort(Comparator.comparingInt(a->a.getEnd()));
		int last = -1;
		for(Activity it : list) {
			if(last < it.getStart()) {
				System.out.println(it.getActivity() + " " + it.getStart() + " "+ it.getEnd());
				last = it.getEnd();
			}
		}
	}

}

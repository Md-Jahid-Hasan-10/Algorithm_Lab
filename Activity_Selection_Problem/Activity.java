package ASP;

public class Activity {
	private int start,end;
	private String activity;
	public Activity(int start,int end,String activity) {
		this.start = start;
		this.end = end;
		this.activity = activity;
	}
	public Activity() {
		// TODO Auto-generated constructor stub
	}
	public int getStart() {
		return start;
	}
	public void setStart(int start) {
		this.start = start;
	}
	public int getEnd() {
		return end;
	}
	public void setEnd(int end) {
		this.end = end;
	}
	public String getActivity() {
		return activity;
	}
	public void setActivity(String activity) {
		this.activity = activity;
	}
}

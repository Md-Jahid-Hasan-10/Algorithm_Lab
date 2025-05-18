package HC;

import java.util.Comparator;

public class MyComparator implements Comparator<HNode>{

	@Override
	public int compare(HNode o1, HNode o2) {
		return o1.data - o2.data;
	}

}

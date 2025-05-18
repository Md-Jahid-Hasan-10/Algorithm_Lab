package F.K.P;

import java.util.Comparator;

public class MyComparator implements Comparator<Item>{

	@Override
	public int compare(Item o1, Item o2) {
		double profit1 = (o1.getValue()/o1.getWeight());
		double profit2 = (o2.getValue()/o2.getWeight());
		if(profit1 < profit2) {
			return 1;
		}
		else return -1;
	}

}

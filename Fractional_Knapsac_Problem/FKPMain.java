package F.K.P;
import java.util.*;
public class FKPMain {

	public static void main(String[] args) {
		ArrayList<Item> items = new ArrayList<>();
		
		Item item1 = new Item();
		item1.setItem_num(1);
		item1.setWeight(3);
		item1.setValue(12);
		
		Item item2 = new Item();
		item2.setItem_num(2);
		item2.setWeight(1);
		item2.setValue(5);
		
		Item item3 = new Item();
		item3.setItem_num(3);
		item3.setWeight(4);
		item3.setValue(16);
		
		Item item4 = new Item();
		item4.setItem_num(4);
		item4.setWeight(2);
		item4.setValue(7);
		
		Item item5 = new Item();
		item5.setItem_num(5);
		item5.setWeight(9);
		item5.setValue(9);
		
		Item item6 = new Item();
		item6.setItem_num(6);
		item6.setWeight(4);
		item6.setValue(11);
		
		Item item7 = new Item();
		item7.setItem_num(7);
		item7.setWeight(3);
		item7.setValue(6);
		
		items.add(item1);
		items.add(item2);
		items.add(item3);
		items.add(item4);
		items.add(item5);
		items.add(item6);
		items.add(item7);
		
		Collections.sort(items,new MyComparator());
		
		double bag = 15,profit = 0;
		for(Item x : items) {
			if(x.getWeight() >= bag){
				double perUnitPro = (x.getValue()/x.getWeight());
				profit += (perUnitPro * bag);
				break;
			}
			else {
				profit += (x.getValue());
				bag -= x.getWeight();
			}
		}
		System.out.println(profit);
	}

}

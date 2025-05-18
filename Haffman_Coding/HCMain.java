package HC;
import java.util.*;
public class HCMain {
	public static void printCode(HNode node,String s) {
		if(node.left == null && node.right == null && Character.isLetter(node.c)) {
			System.out.println(node.c + " = " + s);
			return;
		}
		printCode(node.left,s + '0');
		printCode(node.right,s + '1');
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("How Many character Insert ? ");
		int n;
		n = sc.nextInt();
		PriorityQueue<HNode> pq = new PriorityQueue<HNode>(n,new MyComparator());
		for(int i = 1; i <= n; i++) {
			System.out.println("Enter Char and its frequency = ");
			char ch;
			int fre;
			ch = sc.next().charAt(0);
			fre = sc.nextInt();
			HNode node = new HNode();
			node.c = ch;
			node.data = fre;
			node.left = null;
			node.right = null;
			pq.add(node);
		}
		HNode root = null;
		while(pq.size() > 1) {
			HNode n1 = pq.peek();
			pq.poll();
			HNode n2 = pq.peek();
			pq.poll();
			HNode n3 = new HNode();
			n3.data = n1.data + n2.data;
			n3.c = '-';
			n3.left = n1;
			n3.right = n2;
			root = n3;
			pq.add(n3);
		}
		printCode(root,"");
		
	}

}

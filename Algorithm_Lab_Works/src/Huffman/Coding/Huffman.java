package Huffman.Coding;

import java.util.*;

public class Huffman {
	static int totBit = 0;
	public static void printCode(HuffmanNode node,String s,int dep,char[] ar,int[]val)
	{
		if(node.left == null && node.right == null && Character.isLetter(node.c)) {
			System.out.println(node.c + " : " + s);
			for(int i = 0; i < 6; i++) {
				if(ar[i] == node.c) {
					totBit += (dep * val[i]);
				}
			}
			return;
		}
		printCode(node.left,s + '0',dep+1,ar,val);
		printCode(node.right,s + '1',dep+1,ar,val);
	}
	public static void main(String[] args) {
		int n = 6;
		char[] charArray = {'a','b','c','d','e','f'};
		int [] charfreq = {5,9,12,13,16,45};
		int totFre = 0;
		PriorityQueue<HuffmanNode> pq = new PriorityQueue<HuffmanNode>(n,new MyComparator());
		for(int i = 0; i < n; i++) {
			HuffmanNode hn = new HuffmanNode();
			hn.c = charArray[i];
			hn.data = charfreq[i];
			hn.left = null;
			hn.right = null;
			pq.add(hn);
			totFre += charfreq[i];

		}
		HuffmanNode root = null;
		while(pq.size() > 1) {
			HuffmanNode node1 = pq.peek();
			pq.poll();
			HuffmanNode node2 = pq.peek();
			pq.poll();
			HuffmanNode f = new HuffmanNode();
			f.left = node1;
			f.right = node2;
			f.data = (node1.data + node2.data);
			root = f;
			pq.add(f);
		}
		int totBitsInAsci = totFre * 8;
		printCode(root,"",0,charArray,charfreq);
		int totBitInHuff = totBit;
		System.out.println(totBitsInAsci);
		System.out.println(totBitInHuff);
		double compresed = (double)(totBitInHuff * 100)/totBitsInAsci;
		System.out.println(compresed);
	}

}

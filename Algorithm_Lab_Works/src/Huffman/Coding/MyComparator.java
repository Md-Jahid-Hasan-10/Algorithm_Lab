package Huffman.Coding;

import java.util.Comparator;

public class MyComparator implements Comparator<HuffmanNode>{

	@Override
	public int compare(HuffmanNode o1, HuffmanNode o2) {
		return o1.data - o2.data;
	}
	
}

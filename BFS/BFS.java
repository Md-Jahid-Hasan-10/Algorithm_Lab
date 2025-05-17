package B.F.S;

import java.util.*;

public class BFS {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Graph graph = new Graph(n);
		for(int i = 0; i < n - 1; i++) {
			int u,v;
			u = sc.nextInt();
			v = sc.nextInt();
			graph.addEdge(u, v);
		}
		graph.bfs(0);
	}
	
}

package D.F.S;

import java.util.*;

public class DFS {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Graph graph = new Graph(n);
		for(int i = 1; i < n; i++) {
			int u,v;
			u = sc.nextInt();
			v = sc.nextInt();
			graph.addedge(u, v);
		}
		graph.dfs(0);
	}

}

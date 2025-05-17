package B.F.S;

import java.util.*;

public class Graph {
	private int vertices;
	private LinkedList<Integer>[] adj;
	
	public Graph(int vertices) {
		this.vertices = vertices;
		this.adj = new LinkedList[vertices];
		for(int i = 0; i < vertices; i++) {
			this.adj[i] = new LinkedList<> ();
		}
	}
	public void addEdge(int u,int v) {
		adj[u].add(v);
	}
	public void bfs(int start) {
		boolean vis[] = new boolean [vertices];
		Queue<Integer> queue = new LinkedList<>();
		vis[start] = true;
		queue.add(start);
		while(!queue.isEmpty()){
			int cur = queue.peek();
			System.out.print(cur + " ");
			queue.poll();
			for(int child : adj[cur]) {
				if(vis[child] == false) {
					vis[child] = true;
					queue.add(child);
				}
			}
		}
	}
}

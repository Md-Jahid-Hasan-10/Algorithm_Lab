package D.F.S;

import java.util.*;

public class Graph {
	private int vertices;
	private LinkedList<Integer>[] adj;
	
	public Graph(int vertices){
		this.vertices = vertices;
		this.adj = new LinkedList[vertices];
		for(int i = 0; i < vertices; i++) {
			this.adj[i] = new LinkedList<>();
		}
	}
	public void addedge(int u,int v) {
		adj[u].add(v);
	}
	public void dfs(int start) {
		boolean [] vis = new boolean[vertices];
		dfsUntill(start,vis);
	}
	private void dfsUntill(int cur,boolean[] vis) {
		vis[cur] = true;
		System.out.println(cur + " in ");
		for(int child : adj[cur]) {
			if(vis[child] == false) {
				dfsUntill(child,vis);
				System.out.println(cur + " out ");
			}
		}
		
	}
}

package dijkstra;

import java.util.Scanner;

public class dijkstra {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int graph[][] = new int[n+1][n+1];
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				graph[i][j] = sc.nextInt();
			}
		}
		shortage_path sp = new shortage_path(n);
		sp.dijkstra(graph, 0);
	}

}

package dijkstra;

public class shortage_path {
	private int v;
	public shortage_path(int n) {
		this.v = n;
	}
	int minDist(int []dist,boolean sptSet[]) {
		int min_val = Integer.MAX_VALUE,min_ind = -1;
		for(int i = 0; i < v; i++) {
			if(sptSet[i] == false && dist[i] <= min_val) {
				min_val = dist[i];
				min_ind = i;
			}
		}
		return min_ind;
	}
	void printSol(int dist[]) {
		System.out.println("Vertex \t\t Distance From Source ");
		for(int i = 0; i < v; i++) {
			System.out.println(i + " \t\t " + dist[i]);
		}
	}
	void dijkstra(int graph[][],int src){
		int dist[] = new int[v];
		boolean sptSet[] = new boolean[v];
		for(int i = 0; i < v; i++) {
			dist[i] = Integer.MAX_VALUE;
			sptSet[i] = false;
		}
		dist[src] = 0;
		for(int i = 0; i < v; i++){
			int cur = minDist(dist,sptSet);
			sptSet[cur] = true;
			for(int x = 0; x < v; x++) {
				if(sptSet[x] == false && graph[cur][x] != 0 && dist[cur] + graph[cur][x] <= dist[x]) {
				    dist[x] = dist[cur] + graph[cur][x];
				}
			}
		}
		printSol(dist);
	}
}

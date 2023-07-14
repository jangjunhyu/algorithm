import java.util.*;

public class Main {
	static final int MAX_N = 10;
	static int N, E;
	static int[][] Graph = new int[MAX_N][MAX_N];
	static boolean[] Visited = new boolean[MAX_N];
	
	static void dfs(int node) {
		Visited[node] = true;
		System.out.println(node);
		for(int next=0; next<N; next++) {
			if(!Visited[next]&&Graph[node][next]!=0)
				dfs(next);
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt(); //노드의 개수
		E = sc.nextInt(); //간선의 개수
		for(int i=0; i<E; i++) {
			int u=sc.nextInt();
			int v = sc.nextInt();
			Graph[u][v] = Graph[v][u] = 1;
		}
		dfs(0);
	}
}

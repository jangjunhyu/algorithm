import java.util.*;

public class Main {
	static final int MAX_N = 10;//임의의 값
	static int N, E; //노드의 수 와 간선의 수
	static int[][] Graph = new int[MAX_N][MAX_N];//연결 되었는지
	static boolean[] Visited = new boolean[MAX_N];//방문 여부 확인
	
	static void dfs(int node) {
		Visited[node] = true;
		System.out.println(node);
		for(int next=0; next<N; next++) {
			if(!Visited[next]&&Graph[node][next]!=0) //만약 방문하지 않았거나, 간선이 존재하는 경우
				dfs(next);// 연결된 다음 노드 재귀 호출
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

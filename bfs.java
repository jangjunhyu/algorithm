static void bfs(int node){
		boolean[] visit = new boolean[MAX_N];
		Queue<Integer> myqueue = new LinkedList<>();
		visit[node] = true; //방문 처리
		myqueue.add(node); //간선 에 붙어있는 노드들을 추가
		while(!myqueue.isEmpty()) { // 노드들 없어질때까지 반복
			int curr = myqueue.remove();// curr에 myqueue 입력 후 삭제
			System.out.print(curr+" ");//curr 출력
			for(int next = 0; next < N; next++) { //
				if(!visit[next]&&Graph[curr][next]!=0) { //방문한 적 없고 간선이 존재 한다고 하면
					visit[next] = true;//마킹
					myqueue.add(next);//노드 번호 추가
				}
			}
		}
	}

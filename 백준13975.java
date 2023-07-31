import java.util.*;

public class Main {
	static Scanner sc = new Scanner(System.in);
	public static void solve() {
		int a = sc.nextInt();
		Queue<Long> data = new PriorityQueue<>(); //우선순위 큐
		long result = 0;
		for(int i=0; i<a; i++) {
			long v = sc.nextInt();
			data.offer(v);
		}
    //작은 숫자 2개 합쳐서 한 파일로 만들고 다시 큐에 저장
		while(data.size()>1) {
			long first = data.poll();
			long second = data.poll();
			long third = first+second;
			result += third;
			data.offer(third);
		}
		System.out.println(result);
	}
	
	public static void main(String[] args) {
		int n = sc.nextInt();
		for(int i=0; i<n; i++) {
			solve();
		}
	}
}

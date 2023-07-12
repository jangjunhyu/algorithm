import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); //물이 새는 곳의 개수
		int l = sc.nextInt(); //테이프의 길이
		int[] arr = new int[n];//물이 새는 곳의 위치
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		int answer = 1;
		int[] data = new int[n-1];
		for(int i=0; i<n-1; i++) {
			data[i] = arr[i+1]-arr[i];
		}
		if(l==1) {
			System.out.println(n);
		} else {
			int k=0;
			int a = 0;
			for(int i=0; i<n-1; i++) {
				a += data[i];
				if(a>l-1) {
					answer++;
					a=0;
				}
			}
			System.out.println(answer);
		}
	}
}

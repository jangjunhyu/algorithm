import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		int[]data = new int [n];
		long answer =0;
		
		for(int i=0; i<n; i++) {
			data[i] = i+1;
			answer += Math.abs(data[i]-arr[i]);
		}
		System.out.println(answer);
	}
}

package helloworld;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] arr = new int[n+1];
		for(int i=1; i<=n; i++) {//누적합 알고리즘
			arr[i] = arr[i-1] + sc.nextInt();
		}
		
		int[] data = new int[n-m+1];
		for(int i=0; i<n-m+1; i++) {
			data[i] = arr[i+m]-arr[i];
		
			//System.out.println(arr[i+m]+' '+arr[i]+" "+data[i]);
		}
		int max = 0;
		for(int i=0; i<data.length; i++) {
			if(data[i]>=max) {
				max = data[i];
			}
		}
		int same = 0;
		for(int i=0; i<data.length; i++) {
			if(max==data[i])
				same++;
		}
		if(max==0) {
			System.out.println("SAD");
		} else {
			System.out.println(max);
			System.out.println(same);
		}
	}
}

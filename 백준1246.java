import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int [] arr = new int[m];
		for(int i=0; i<m; i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		int max = 0;
		int big = 0;
		if(n==1) {
			System.out.println(arr[arr.length-1]);
			System.out.println(arr[arr.length-1]);
		} else {
			for(int i=0; i<m; i++) {
				int a;
				if(n>=m) {
					a = m;
				} else {
					a = n;
				}
				int k = 0;
				int v = arr[i];
				//System.out.println(i);
				for(int j=i; j<i+a; j++) {
					if(j>=arr.length) {
						break;
					}else {
						k += v;
					}
					
				}
				if(max<=k) {
					max = k;
					big = arr[i];
				}
				
			}
		System.out.println(big);
		System.out.println(max);
		}
	}
}

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); 
		int[][] arr = new int[n][2];
		int[] data = new int[n];
		for(int i=0; i<n; i++) {
			arr[i][0] = sc.nextInt();
			arr[i][1] = sc.nextInt();
			data[i] = 1;
		}
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(arr[i][0]<arr[j][0]&&arr[i][1]<arr[j][1]) {
					data[i]++;
				}
			}
		}
		String result="";
		for(int i=0; i<n; i++) {
			result+=data[i]+" ";
		}
		System.out.println(result.strip());
	}
}

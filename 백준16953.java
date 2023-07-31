import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long a = sc.nextInt();
		long b = sc.nextInt();
		boolean t = true;
		int num = 1;
			while(t) {
				long k = b%10;
				if(a==b) {
					System.out.println(num);
					break;
				} else if(k!=1&&b%2!=0) {
					System.out.println(-1);
					break;
				} else {
					long v = b%10;
					if(v==1) { //b의 1의 자리 수가 1 이면 1 제거
						b=b/10;
						num++;
					} else { //만약 1의 자리 수가 아니라면 /2
						b/=2;
						num++;
					}
					if(b<a) {
						System.out.println(-1);
						break;
					}
				}
			}
		}
	}

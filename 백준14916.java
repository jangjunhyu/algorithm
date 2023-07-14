import java.util.*;

// 짝수기만 하면 거스름돈이 됨
// 13의 경우 그냥 그리디만 사용하면 5 2개로 하면 답이 안나옴
// 그래서 5 1개 2 4개로 해야함
// 5로 나눈 나머지가 홀수면 2로 나눌 수 없기 때문에 5에서 1개 빼고 나머지 거스름 돈을 짝수로 맞춰줘야함

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); //노드의 개수
		int five=0;
		int two=0;
		if(n==1||n==3) {
			System.out.println(-1);
		}else {
		if(n%5==0) {
			five = n/5;
		} else {
			five = n/5;
			n = n%5;
			if(n%2==0) {
				two = n/2;
			} else {
				five--;
				n+=5;
				two = n/2;
			}
		}
		System.out.println(five+two);
		}
	}
}

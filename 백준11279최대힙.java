import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int cnt = Integer.parseInt(br.readLine());
		PriorityQueue<Integer> priorityQueueHighest = new PriorityQueue<>(Collections.reverseOrder());//최대 우선순위 큐 활용
		for(int i=0; i<cnt;i++) {
			int input = Integer.parseInt(br.readLine());
			if(input > 0) {				
				priorityQueueHighest.add(input);
			}else {
				if(priorityQueueHighest.size()==0) {
					System.out.println(0);
				}else {
					System.out.println(priorityQueueHighest.poll());
				}
			}
			
		}
		
	}
}

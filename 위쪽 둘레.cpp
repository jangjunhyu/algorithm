#include<iostream>
#include<time.h>
#include<algorithm>
using namespace std;




int main() {
	int n;
	cin >> n;
	int** data = new int* [n]; //x축 y축 입력 배열(2차원)
	for (int i = 0; i < n; i++) {
		data[i] = new int[2];
	}
	for (int i = 0; i < n; i++) { //x,y축 값 입력
		int n, m;
		cin >> n >> m;
		data[i][0] = n; //x값
		data[i][1] = m; //y값
	}
	clock_t start = clock(); //시작 시간 저장
	int** dp = new int* [n]; //2차원 dinamic programming 배열 생성
	for (int i = 0; i < n; i++) { //배열 생성 반복문
		dp[i] = new int[2];
	}
	dp[0][0] = data[0][0]; //dp의 1열 1행을 입력받은 첫 번째 x값으로 입력
	dp[0][1] = data[0][1]; //dp의 2열 1행을 입력받은 첫 번쨰 y값으로 입력
	for (int i = 1; i < n; i++) { //동적 계획 배열을 2차원으로 준비하고 i-1번째 행을 결정하려면 i번째 직사각형의 x축이 위로 왔을때 i-1번째의 직사각형의 x축이 위로갔을때와 y축이 위로 갔을때를 비교하여 최대 값을 지정하여 결정한다.
									// 하지만 x축과 y축의 경우의 수 가 2개 이기 때문에 2차원 배열로 해야한다.
									// 이런식으로 하나하나 반복문을 수행하면 배열의 0 번째부터 n번째까지의 최댓값(dp[n][0], dp[n][1]) 2개가 나온다.
		dp[i][0] = data[i][0] + max(dp[i - 1][0] + abs(data[i - 1][1] - data[i][1]), dp[i - 1][1] + abs(data[i - 1][0] - data[i][1]));
		dp[i][1] = data[i][1] + max(dp[i - 1][0] + abs(data[i - 1][1] - data[i][0]), dp[i - 1][1] + abs(data[i - 1][0] - data[i][0]));
	}
	
	cout << max(dp[n-1][0],dp[n-1][1])<<endl; //dp[n][0], dp[n][1] 둘 중 더 큰 수를 결정해서 출력
	clock_t end = clock();//끝나는 시간

	printf("실행 시간 : %lf\n", (double)(end - start) / CLOCKS_PER_SEC);
}
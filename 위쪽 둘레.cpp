#include<iostream>
#include<time.h>
#include<algorithm>
using namespace std;




int main() {
	int n;
	cin >> n;
	int** data = new int* [n]; //x�� y�� �Է� �迭(2����)
	for (int i = 0; i < n; i++) {
		data[i] = new int[2];
	}
	for (int i = 0; i < n; i++) { //x,y�� �� �Է�
		int n, m;
		cin >> n >> m;
		data[i][0] = n; //x��
		data[i][1] = m; //y��
	}
	clock_t start = clock(); //���� �ð� ����
	int** dp = new int* [n]; //2���� dinamic programming �迭 ����
	for (int i = 0; i < n; i++) { //�迭 ���� �ݺ���
		dp[i] = new int[2];
	}
	dp[0][0] = data[0][0]; //dp�� 1�� 1���� �Է¹��� ù ��° x������ �Է�
	dp[0][1] = data[0][1]; //dp�� 2�� 1���� �Է¹��� ù ���� y������ �Է�
	for (int i = 1; i < n; i++) { //���� ��ȹ �迭�� 2�������� �غ��ϰ� i-1��° ���� �����Ϸ��� i��° ���簢���� x���� ���� ������ i-1��°�� ���簢���� x���� ���ΰ������� y���� ���� �������� ���Ͽ� �ִ� ���� �����Ͽ� �����Ѵ�.
									// ������ x��� y���� ����� �� �� 2�� �̱� ������ 2���� �迭�� �ؾ��Ѵ�.
									// �̷������� �ϳ��ϳ� �ݺ����� �����ϸ� �迭�� 0 ��°���� n��°������ �ִ�(dp[n][0], dp[n][1]) 2���� ���´�.
		dp[i][0] = data[i][0] + max(dp[i - 1][0] + abs(data[i - 1][1] - data[i][1]), dp[i - 1][1] + abs(data[i - 1][0] - data[i][1]));
		dp[i][1] = data[i][1] + max(dp[i - 1][0] + abs(data[i - 1][1] - data[i][0]), dp[i - 1][1] + abs(data[i - 1][0] - data[i][0]));
	}
	
	cout << max(dp[n-1][0],dp[n-1][1])<<endl; //dp[n][0], dp[n][1] �� �� �� ū ���� �����ؼ� ���
	clock_t end = clock();//������ �ð�

	printf("���� �ð� : %lf\n", (double)(end - start) / CLOCKS_PER_SEC);
}
import java.io.*;
import java.util.*;

//https:www.acmicpc.net/problem/14888
// 수열과 연산자가 주어진다. 수열의 순서를 변경할 수 없을 때 연산자를 사용한 식의 결과가 최소인 것과 최대인 값을 구하라.
/*
전개
1. 각 수를 하나씩 나눈다.
2. 각 연산자를 하나씩 넣는다.
3. 그 다음 숫자를 받아올 때 연산
4. 연산한 값을 배열에 넣는다.
5. 2~4을 반복한다.
6. 최소값 최대값을 리턴한다.
*/
class bj14888 {
	public static int[] operator = new int[4];
	public static int[] num;
	public static int N; // 수의 개수
	public static int max = Integer.MAX_VALUE;
	public static int min = Integer.MIN_VALUE;
	
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			N = Integer.parseInt(br.readLine());
			num = new int[N];

			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			for (int i = 0; i < N; i++) {
				num[i] = Integer.parseInt(st.nextToken());
			}

			st = new StringTokenizer(br.readLine(), " ");
			for (int i = 0; i < 4; i++) {
				operator[i] = Integer.parseInt(st.nextToken());
			}

			int[] flatOperator = flattening(operator);

			int number = num[0];
			for (int i = 1; i < N; i++) { // NUMBER START


			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static int[] flattening(int[] arr){
		

		int[] flat = new int[N-1];
		int start = 0;
		for(int i = 0 ; i < arr.length ; i++){

			if(arr[i] == 0 ) continue;
			
			int operatorType = i+1;
			
			for(int j = 0 ; j < arr[i] ; j++){
				flat[start] = operatorType;
				
				if(j != 0){
					flat[start+1] = operatorType;
				}
				
				start ++;
				
			}
		}
		
		return null;
	}
	
	public static int calc(int x, int y, int op){
		int res = 0;
		switch (op) {
			case 1:
				res = x+y;
				break;
			case 2:
				res = x-y;
				break;
			case 3:
				res = x*y;
				break;
			case 4:
				res = x/y;
				break;
		}
		
		return res;
	}
}
import java.io.*;
import java.util.*;

class p1712 {
	public static void main(String[] args) throws IOException{
		// 뭐가 어찌됐든 기반금액 / (판매가 - 생산단가) 한 정수값보다 한개만 더 팔면 손익분기점임
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		int C = Integer.parseInt(st.nextToken());
		
		int cnt = 1;
		
		if(B >= C) {
			cnt = -1;
		}
		int res = 0;
		if(cnt != -1) res = (A/(C-B)) + 1;
		System.out.println(String.valueOf(cnt == -1 ? cnt : res));
	}
}
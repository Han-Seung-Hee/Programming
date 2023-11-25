/*

	range 1 = 1
	range 2 = 2-7 6
	range 3 = 8-19 12
	range 4 = 20-37 18

	1겹 마다 벌집의 수는 6씩 증가함.

*/


import java.io.*;

class p2292 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		int range = 2; // 1이면 어차피 1로 출력하면 끝임. 2번째 겹의 최소값 부터 보여주자. 
		int cnt = 1;
		
		if(N==1) System.out.println(1);
		else{
			while(range <= N){
				range = range + (6 * cnt); // 2번째 겹의 최소값 + 6 * cnt => 그 다음 겹의 최소값.
				cnt ++;
			}
			
			System.out.println(cnt);
		}
	}
}
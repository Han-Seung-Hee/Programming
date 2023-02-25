import java.io.*;
import java.util.*;

class bj14501 {
	
	/*
	
	퇴사예정일과 이익값과 소요일수를 받아옴.
	
	N일 동안 일을 할 때 최대 금액을 구하라.
	
	왜맞았지?
	*/
	
	public static void main(String[] args) throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int max = 16;
		int[]ti = new int[max];
		int[]pi = new int[max];
		int[]dayRes = new int[max];
		
		Arrays.fill(dayRes, 0);
		
		
		for(int i =1; i <= N ; i++){
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			
			ti[i] = Integer.parseInt(st.nextToken());
			pi[i] = Integer.parseInt(st.nextToken());
		}
		
		for(int i = N; i > 0 ; i--){
			int dl = ti[i] + i; // 현재 일 + 경과일
			
			if(dl > N+1){ // 상담을 못하는 경우
				dayRes[i] = dayRes[i+1] ; // 상담을 못하면 결국 0, 최대값 대상이 아니므로 그 전에 수행한 값을 들고온다.
			}else{
				dayRes[i] = Math.max(dayRes[i+1], dayRes[dl] + pi[i]); // 상담이 가능하면 이전까지 값과 (현재일 + 경과일 )값 + 현재일의 값을 비교한다.
			}
		}
		
		System.out.println(dayRes[1]);
	}
}
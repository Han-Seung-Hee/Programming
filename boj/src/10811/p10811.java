import java.io.*;
import java.util.*;

class p10811 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int[] arr = new int[N];
		
		for(int i = 0 ; i< N ; i++){
			arr[i] = i+1;
		}
		
		for(int i = 0 ; i < M ; i++){
			int temp = 0;
			StringTokenizer st2 = new StringTokenizer(br.readLine() , " ");
			
			int x = Integer.parseInt(st2.nextToken())-1;
			int y = Integer.parseInt(st2.nextToken())-1;
			
			while(x<y){ // 양쪽 끝 바꾸고 , 그담에 또 바꾸고.. 같으면 중간이니까 끝, 적으면 끝났으니 끝.
				temp = arr[x];
				arr[x ++] = arr[y];
				arr[y --] = temp;
			}
		}
		
		for(int i = 0 ; i < arr.length ; i++){
			if(i == arr.length -1) sb.append(arr[i]);
			else sb.append(arr[i]).append(" ");
		}
		
		System.out.println(sb.toString());
		
		
		
	}
}
import java.io.*;
import java.util.*;

class Main {
	public static void main(String[] args) throws IOException{
		InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(in);
		
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		int[] arr = new int[N];
		Arrays.fill(arr,0);
		
		for(int i = 0 ; i < M ; i++){
			StringTokenizer st2 = new StringTokenizer(br.readLine()," ");
			int start = Integer.parseInt(st2.nextToken()) -1;
			int end = Integer.parseInt(st2.nextToken());
			int num = Integer.parseInt(st2.nextToken());
			
			for(int j = start ; j < end ; j++){
				arr[j] = num;
			}
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0 ; i < arr.length ; i++){
			if(i == arr.length-1) sb.append(arr[i]);
			else sb.append(arr[i]).append(" ");
		}
		
		System.out.println(sb.toString());
		
		
	}
}
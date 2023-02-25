import java.io.*;
import java.util.*;

class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];
		
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		
		for(int i = 0 ; i < N; i++){
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		for(int i = 0 ; i< arr.length ; i++){
			if(max < arr[i]){
				max = arr[i];
			}
		}
		
		for(int i = 0 ; i< arr.length ; i++){
			if(min > arr[i]){
				min = arr[i];
			}
		}
		
		System.out.println(min+" "+max);
		
	}
}
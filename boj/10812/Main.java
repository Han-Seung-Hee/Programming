import java.io.*;
import java.util.*;

class Main {
	public static void main(String[] args) throws IOException{
		// Array rotate left
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int[] base_arr = new int[N];
		
		for(int i = 0 ; i < base_arr.length ; i++){
			base_arr[i] = i+1;
		}
		
		for(int i = 0 ; i < M ; i++){
			
		}
	}
	
	private static void l_rotation(int cnt, int[] arr){
		int[] newArr = new int[arr.length];
		
		for(int i = 0 ; i < arr.length ; i++){
			newArr[(arr.length-(cnt - i)) % arr.length] = arr[i];
		}
		
		arr = newArr;
	}
}
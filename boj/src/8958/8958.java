import java.io.*;
import java.awt.*;
import java.util.*;

class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		String[] arr = new String[N];

		for(int i = 0 ; i < N ; i++){
			arr[i] = br.readLine();
		
			int sum = 0;
			int cnt = 0;
		
			for(int j = 0 ; j < arr[i].length(); j++){
				if(arr[i].charAt(j) == 'O'){
					cnt++;
				}else{
					cnt = 0;
				}
				sum+=cnt;
			}
			
			sb.append(sum).append("\n");
			
		}
		
		System.out.println(sb);
		
		
	}
}
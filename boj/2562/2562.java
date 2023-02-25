import java.io.*;
import java.util.*;

class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				
		int max = Integer.MIN_VALUE;
		int pos = 0;
		for(int i = 0 ; i < 9 ; i ++){
			int v = Integer.parseInt(br.readLine());
			if(max < v){
				max = v;
				pos = i;
			}
		}
		
		System.out.println(max);
		System.out.println(pos+1);
	
	}
}
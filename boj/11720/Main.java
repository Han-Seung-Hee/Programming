import java.io.*;
import java.util.*;

class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		String str = br.readLine();
		int sum = 0;
		for(int i = 0 ; i < str.length(); i++){
			sum += (int)str.charAt(i) - '0';
		}
		
		System.out.println(sum);
	}
}
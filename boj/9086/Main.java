import java.io.*;
import java.util.*;

class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0 ; i < N ; i ++){
			String str = br.readLine();
			if(i == N-1) sb.append(str.charAt(0)).append(str.charAt(str.length()-1));
			else sb.append(str.charAt(0)).append(str.charAt(str.length()-1)).append("\n");
		}
		
		System.out.println(sb.toString());
	}
}
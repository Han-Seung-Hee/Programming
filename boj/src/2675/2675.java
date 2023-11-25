import java.io.*;
import java.util.*;

class p2675 {
	public static void main(String[] args) throws IOException{
		// S : input string
		// R : number of repeat
		// P : new String
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		
		for(int i = 0 ; i < N ; i++){
			StringTokenizer st = new StringTokenizer(br.readLine()," ");
			int R = Integer.parseInt(st.nextToken());
			String S = st.nextToken();
			
			for(int j = 0 ; j < S.length() ; j++){
				for(int k = 0 ; k < R ; k++){
					sb.append(S.charAt(j));
				}
			}
			if(i != N-1) sb.append("\n");
		}
		
		System.out.println(sb.toString());
		
	}
}
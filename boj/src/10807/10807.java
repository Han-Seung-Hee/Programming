import java.io.*;
import java.util.*;

class p10807 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int v = Integer.parseInt(br.readLine());
		int cnt = 0 ;
		
		for(int i = 0 ; i < N ; i ++){
			if(Integer.parseInt(st.nextToken()) == v){
				cnt++;
			}
		}
		
		System.out.println(cnt);
	
	}
}





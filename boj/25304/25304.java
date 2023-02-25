import java.io.*;
import java.util.*;

class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int total = Integer.parseInt(br.readLine());
		int N = Integer.parseInt(br.readLine());
		int sum_tot = 0;
		
		
		for(int i = 0 ; i < N ; i++){
			StringTokenizer st = new StringTokenizer(br.readLine());
			sum_tot += Integer.parseInt(st.nextToken()) * Integer.parseInt(st.nextToken());
		}
		
		if(total == sum_tot) System.out.println("Yes");
		else System.out.println("No");
	}
}
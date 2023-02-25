import java.util.*;
import java.io.*;

class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		
		int a = Integer.parseInt(st.nextToken()) ;
		int b = Integer.parseInt(st.nextToken()) ;
		int c = Integer.parseInt(br.readLine())  ;
		
		int min = b+c;
		int p_hour = min/60;
		int p_min = min%60;
		
		if(min >= 60){
			a += p_hour;
			if(a>=24) a-=24;
			min = p_min;
		}
		
		System.out.println(a+" "+min);
	}
}
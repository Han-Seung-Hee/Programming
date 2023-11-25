import java.io.*;
import java.util.*;

class p1152 {
	public static void main(String[] args) throws IOException {
		BufferedReader br=  new BufferedReader(new InputStreamReader(System.in));
		int cnt = 0 ;
		String str = br.readLine();
		
		StringTokenizer st = new StringTokenizer(str , " ");
		while (true) {
			if(st.hasMoreTokens()){
				cnt++;
				st.nextToken();
			}else{
				break;
			}
		}
		
		System.out.println(cnt);
	}
}
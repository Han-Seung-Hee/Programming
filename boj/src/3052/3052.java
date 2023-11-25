import java.util.*;
import java.io.*;

class p3052 {
	public static void main(String[] args) throws IOException {
		Set<Integer> st = new HashSet<>();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		for(int i = 0 ; i< 10 ; i++){
			int bs = Integer.parseInt(br.readLine());
			st.add(bs % 42);
		}
		
		System.out.println(st.size());
	}
}
import java.io.*;
import java.util.*;
import java.math.*;

class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		BigInteger res = BigInteger.ZERO;
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		while(st.hasMoreTokens()){
			res = res.add(BigInteger.valueOf(Long.parseLong(st.nextToken()))) ;
		}
		
		System.out.println(res);
	}
}
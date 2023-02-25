import java.io.*;
import java.util.*;

class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				
		String str = br.readLine();
		
		StringTokenizer st = new StringTokenizer(str," ");
		int[] arr= new int[2];
		int cnt = 0;
		while(true){
			if(st.hasMoreTokens()){
				StringBuffer sb = new StringBuffer(st.nextToken());
				arr[cnt] = Integer.parseInt(sb.reverse().toString());
				cnt++;
			}else{
				break;
			}
		}
			
		System.out.println(arr[0] > arr[1] ? arr[0] : arr[1]);
	}
}
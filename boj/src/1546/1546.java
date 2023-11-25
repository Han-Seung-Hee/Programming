import java.io.*;
import java.util.*;

class p1546 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		Double[] arr =new Double[N];
		
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		
		double max = Double.MIN_VALUE;
		
		for(int i = 0 ; i < N ; i++){
			double val = Double.parseDouble(st.nextToken());
			arr[i] = val;
			
			if(max < val){
				max = val;
			}
		}
		
		Double sum = 0D;
		for(int i = 0 ; i < N ; i++){
			arr[i] = (arr[i]/max) * 100;
			sum += arr[i];
		}
		
		System.out.println(sum/N);
		
		
		
		
	}
}
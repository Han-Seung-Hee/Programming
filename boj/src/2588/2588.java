import java.io.*;

class p2588 {
	public static void main(String[] args) throws IOException{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		
		int bs = Integer.parseInt(br.readLine());
		String uv = br.readLine();

		String[] arr = new String[3];
		
		arr = uv.split("");
		
		for(int i = arr.length-1 ; i >= 0 ; i --){
			System.out.println(bs * Integer.parseInt(arr[i]));
		}
		System.out.println(bs * Integer.parseInt(uv));
	}
}
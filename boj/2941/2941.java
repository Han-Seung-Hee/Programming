import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		String[] arr = {"c=","c-","dz=","d-","lj","nj","s=","z="};
		int cnt = 0;
		
		for(int i = 0 ; i < arr.length ; i++){
			if(str.contains(arr[i])) {
				str = str.replace(arr[i],"A");
			}
		}
		
		for(int i = 0 ; i < str.length() ; i++){
			cnt++;
		}
		
		
		System.out.println(cnt);
	}
}
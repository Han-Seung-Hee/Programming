import java.util.*;

class Main {
	private static boolean getHansu(int n){
		
		if(n<100){
			return true;
		}
		
		int r,m,diff;
		
		r = n % 10;
		n = n / 10;
		m = n % 10;
		diff = m-r;
		
		while(n >= 10){
			r = n % 10;
			n = n / 10;
			m = n % 10;
			if(diff != m - r) return false;
		}
		
		return true;
		
	}
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		int N = sc.nextInt();
		int cnt = 0;
		for(int i = 1 ; i <= N ; i++ ){
			if(getHansu(i)) cnt ++;
		}
		
		System.out.println(cnt);
	}
}
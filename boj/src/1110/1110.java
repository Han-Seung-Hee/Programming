import java.util.*;

class p1110{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		if(n < 10 ) n *= 10;
		int cnt = 1;
		int chk = n;
		while(true){
		
			int a = n / 10 ;
			int b = n % 10 ;
			int c = a + b ;
			
			n = b * 10 + c % 10 ;
			
			if(chk == n){
				break;
			}else{
				cnt++;
			}
			
		}
		
		System.out.println(cnt);
		
	}
}

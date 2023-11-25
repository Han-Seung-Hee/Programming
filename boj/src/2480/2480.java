import java.util.*;

class p2480 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		
		int val = 0;
		if(a==b && b==c){
			val = 10000 + (1000 * a);
		}
		else if(a==b && b!=c || a==c && b!=a){
			val = 1000 + (100 * a);
		}else if(b==c && b!=a){
			val = 1000 + (100 * b);
		}else if(a!=b && a!=c && b!=c){
			val = getMax(a,b,c) * 100;
		}		
		
		System.out.println(val);
	}
	
	static int getMax(int a, int b , int c ){
		int max = Integer.MIN_VALUE;
		
		if(max<a){
			max = a;
		}
		if(max<b){
			max = b;
		}
		if(max<c){
			max = c;
		}
		
		return max;
	}
}
import java.util.*;

class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		if(b < 45){
			if(a == 0){
				a = 23;
			}else{
				a -= 1;
			}
			b = 15 + b;
		}else{
			b = b - 45;
		}
		
		System.out.println(a+" "+b);
	}
}
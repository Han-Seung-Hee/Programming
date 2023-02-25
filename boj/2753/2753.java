import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		
		boolean b_a = a % 4 == 0;
		boolean b_b = a % 100 == 0;
		boolean b_c = a % 400 == 0;
		
		if((b_a && ! b_b) || b_c){
			System.out.println("1");
		}else{
			System.out.println("0");
		}
	}
}
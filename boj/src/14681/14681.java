import java.util.*;

class Main {
	public static void main(String[] args) {
		// find Quadrant
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		// Quadrant1 = P,P
		// Quadrant2 = N,P
		// Quadrant3 = N,N
		// Quadrant4 = P,N
		boolean b_a = a>0;
		boolean b_b = b>0;
		
		if(b_a && b_b) System.out.println("1");
		if(!b_a && b_b) System.out.println("2");
		if(!b_a && !b_b) System.out.println("3");
		if(b_a && !b_b ) System.out.println("4");
		
	}
}
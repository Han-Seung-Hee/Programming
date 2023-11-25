import java.util.*;

class p10988 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder(sc.next());
		String str = sb.toString();
		String reverse = sb.reverse().toString();
		
		System.out.println(str.equals(reverse) ? 1 : 0);
	}
}
import java.util.*;

class p25314 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		StringBuilder sb= new StringBuilder();
		int N = sc.nextInt();
		if(N==4) System.out.println("long int");
		else{
			int cnt = N/4;
			for(int i = 0 ; i < cnt ; i++){
				sb.append("long").append(" ");
			}
			
			sb.append("int");
			System.out.println(sb.toString());
		}
	}
}
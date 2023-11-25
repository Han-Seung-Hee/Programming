import java.util.*;

class p2444 {
	/*
	
	1 - 1 4
	2 - 3 3
	3 - 5 2
	4 - 7 1
	5 - 9 0
	6 - 7 1
	7 - 5 2 
	8 - 3 3
	9 - 1 4
	
	*/
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		int N = sc.nextInt();
		int start = 1;
		int blank = N-1;
		
		for(int i = 0 ; i < N ; i ++){
			
			for(int j = 0 ; j < blank ; j++){
				sb.append(" ");
			}
			for(int k = 0 ; k < start ; k++){
				sb.append("*");
			}

			sb.append("\n");
			if(i != N-1) {

				start+=2;
				blank--;
				
			}
		}
		
		start -=2;
		blank ++;
		
		for(int i = 0 ; i < N ; i++){
			for(int j = 0 ; j < blank ; j++){
				sb.append(" ");
			}
			for(int k = 0 ; k < start ; k++){
				sb.append("*");
			}			
			
			if(i != N-1) {
				sb.append("\n");
				start-=2;
				blank++;
				
			}
		}
		
		System.out.println(sb.toString());
	}
}
import java.io.*;
import java.util.*;

class p1157 {
	public static void main(String[] args) throws IOException{
		// 알파벳 대소문자가 주어진다. 가장 많이 사용된 알파벳이 무엇인지 찾아야 한다.
		// 대소문자 구분이 없다. -> 대문자 . 소문자 중 하나 잡고 변환한다.
		// 에러케이스 안줌 - 반례 : abcdezzz
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine().toUpperCase();
		
		HashMap<Character,Integer> map = new HashMap<>();
		
		
		for(int i = 0 ; i < str.length() ; i++){
			int cnt = 0;
			
			if(map.get(str.charAt(i)) != null) cnt = map.get(str.charAt(i));
			
			cnt++;
			
			map.put(str.charAt(i), cnt);
			
		}
		
		Set<Character> set = new HashSet<>();
		
		set = map.keySet();
		
		int MAX = Integer.MIN_VALUE;
		
		boolean isDup = false;
		int addr = -1;
		char AA = '0';
		Iterator<Character> it = set.iterator();
		
		for(int i = 0 ; i < set.size(); i++){
			char A = it.next();
			int cmpVal = map.get(A);
			
			if(cmpVal > MAX){
				MAX = cmpVal;
				addr = i;
				AA = A;
				isDup = false;
			}
			
			if(MAX == cmpVal && addr != i){
				isDup = true;
			}
		}
		System.out.println(isDup ? "?" : AA);
		
	}
}
import java.util.*;
import java.io.*;
import java.nio.channels.*;

class Main{
	public static void main(String[] args) throws IOException{
		/*
			TASK 1 : 문자열을 하나씩 쪼개서 첫 위치를 찾는다. (ZERO_BASE)
			TASK 2 : 그 첫 위치와 알파벳을 저장한다.
			TASK 3 : A-Z 배열을 돌면서 위치값을 저장한다. 없으면 -1.
		*/
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br. readLine();
		
		char[] stArr = str.toCharArray();
		
		ArrayList<Character> ls = new ArrayList<>();
		int cnt = 0;
		
		//A-Z 배열 생성
		for(char c = 'a' ; c <= 'z' ; c++){
			ls.add(c);
			cnt++;
		}
		
		// return Array 생성
		int[] res = new int[26];
		Arrays.fill(res, -1);
		
		for(int i = 0 ; i< str.length(); i++){
			int addr = str.charAt(i) - 'a';
			int loc = str.indexOf(str.charAt(i));
			
			if(loc > -1){
				res[addr] = loc;
			}
		}
		
		for(int i = 0 ; i < res.length; i++){
			if(i == res.length) System.out.print(res[i]);
			else System.out.print(res[i] + " ");
		}
		
	}
}
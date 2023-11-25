import java.awt.*;
import java.util.*;
import java.io.*;

class p5597
{
	public static void main(String[] args) throws IOException{
		ArrayList<Integer> ls = new ArrayList<>();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = "";
		
		for(int i = 0 ; i < 28; i++){
			
			ls.add(Integer.parseInt(br.readLine()));
		}
		
		for(int i = 1 ; i<=30 ; i++){
			if (ls.indexOf(i) == -1){
				System.out.println(i);
			}
		}
		
		
	}
}
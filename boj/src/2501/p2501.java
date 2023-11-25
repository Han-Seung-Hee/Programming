import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class p2501 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        ArrayList<Integer> ls = new ArrayList<>();
        
        for(int i = 1 ; i <= N ; i++){
            if(N % i == 0 ){
                ls.add(i);
            } 
        }
        
        Collections.sort(ls);
        if(M > ls.size()) System.out.println(0);
        else{
            System.out.println(ls.get(M-1));
        }
        
    }    
}

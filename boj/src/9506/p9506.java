import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class p9506 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder(); 
        while(true){
            StringTokenizer st= new StringTokenizer(br.readLine());
          
            ArrayList<Integer> ls = new ArrayList<>();
            int sum = 0;
            int a = Integer.parseInt(st.nextToken());
            
            if(a == -1) break;

            for(int i = 1 ; i < a ; i++){
                if(a % i == 0){
                    sum += i;
                    ls.add(i);
                }
            }

            Collections.sort(ls);
            if(sum == a){
                sb.append(a).append(" = ");
                for(int i = 0 ; i < ls.size(); i++){
                    sb.append(ls.get(i));
                    if(i != ls.size()-1) sb.append(" + ");
                }
            }else{
                sb.append(a + " is NOT perfect.");
            }
            sb.append("\n");
        }

        System.out.println(sb.toString());
        
    }    
}

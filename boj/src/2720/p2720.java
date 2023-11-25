import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p2720 {
    public static void main(String[] args) throws IOException{
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());

        for(int i = 0 ; i < N ; i++){
            StringBuilder sb = new StringBuilder();
            StringTokenizer st2 = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st2.nextToken());
            
            if(a >= 25){
                sb.append(a/25).append(" ");
                a = a%25;
            }else{
                sb.append(0).append(" ");
            }

            if(a >= 10){
                sb.append(a/10).append(" ");
                a = a%10;
            }else{
                sb.append(0).append(" ");
            }

            if(a >= 5){
                sb.append(a/5).append(" ");
                a = a%5;
            }else{
                sb.append(0).append(" ");
            }

            if(a >= 1){
                sb.append(a).append(" ");
            }else{
                sb.append(0).append(" ");
            }
            
            System.out.println(sb.toString());
        }
    }
    
}

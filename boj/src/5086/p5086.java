import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p5086 {
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        final String A = "factor";
        final String B = "multiple";
        final String C = "neither";

        
        while(true){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            if(x == 0 && y == 0) break;

            if(x < y){
                if(y % x == 0){
                    System.out.println(A);
                }else{
                    System.out.println(C);
                }
            }else{
                if(x % y == 0){
                    System.out.println(B);
                }else{
                    System.out.println(C);
                }
            }
        }
    }
}

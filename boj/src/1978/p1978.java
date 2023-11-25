import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p1978 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int cnt = 0;
        for(int i = 0 ; i<N ; i++){
            boolean chk = false;
            int a = Integer.parseInt(st.nextToken());

            if(a == 1) continue;
            else if(a % a == 0){
                for(int j = 2 ; j < a; j++){
                    if(a % j == 0) chk = true;
                }
                if(!chk) cnt++;
            }
        }

        System.out.println(cnt);
    }
    
}

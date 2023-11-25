import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class p24313 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a1 = Integer.parseInt(st.nextToken());
        int a0 = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(br.readLine());
        int n0 = Integer.parseInt(br.readLine());

        // fn = a1 * n + a0
        // 양의 정수 c와 n0가 주어진다.
        // 모든 n >= n0 에 대해 f(n) <= c * g(n) 을 만족하는지 판별한다.

        if( a1 * n0 + a0 <= c*n0 && c >= a1){
            bw.write("1");
        }else{
            bw.write("0");
        }

        bw.flush();
        bw.close();
    }   
}

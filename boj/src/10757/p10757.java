import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class p10757 {
   public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        BigInteger bd1 = new BigInteger(st.nextToken());
        BigInteger bd2 = new BigInteger(st.nextToken());

        bw.write(String.valueOf(bd1.add(bd2)));
        bw.flush();
        bw.close();
   }     
}

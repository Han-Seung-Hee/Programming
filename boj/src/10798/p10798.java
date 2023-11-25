import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class p10798 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        final int N = 5;
        String[][] arr = new String[N][15];
        
        // Make Matrix
        for(int i = 0 ; i < N ; i++){
            String str = br.readLine();
            String[] stra = str.split("");
            for(int j = 0 ; j < str.length(); j++){
                arr[i][j] = stra[j];
            }
        }

        // Print value vertically
        // 반복횟수 N
        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i < 15 ; i++){
            for(int j = 0 ; j < N ; j++){
                String val = arr[j][i];
                if(!"".equals(val) && val != null){
                    sb.append(val);
                }
            }
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }    
}

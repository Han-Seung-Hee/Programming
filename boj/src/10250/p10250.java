import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class p10250 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] arr = new int[3];
        int N = Integer.parseInt(br.readLine());

        for(int i = 0 ; i < N ; i ++){
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            arr[0] = Integer.parseInt(st.nextToken());
            arr[1] = Integer.parseInt(st.nextToken());
            arr[2] = Integer.parseInt(st.nextToken());

            // arr[0] / arr[2] -> 호 
            // arr[0] % arr[2] -> 층 => 만약, 나누어 떨어지는 경우에는 무조건 6층임.

            if(arr[2] % arr[0] == 0){
                bw.write(String.valueOf((arr[0] * 100) + (arr[2]/arr[0])));
            }else{
                bw.write(String.valueOf( ((arr[2] % arr[0]) * 100 ) + (arr[2]/arr[0]) + 1  ));
            }

            if(!(i == N-1)) bw.write("\n");
        }
        bw.flush();
        bw.close();
         
    }    
}

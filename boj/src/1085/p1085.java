import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class p1085 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int x , y , w ,h = -1;
        int min = Integer.MAX_VALUE;
        
        x = Integer.parseInt(st.nextToken());
        y = Integer.parseInt(st.nextToken());
        w = Integer.parseInt(st.nextToken());
        h = Integer.parseInt(st.nextToken());
        
        //CASE 1 H-Y
        //CASE 4 0-Y
        if(w-x > x){
            if(min > x ) min = x;
        }else{
            if(w-x < min) min = w-x;
        }

        //CASE 2 W-X
        //CASE 3 0-X
        if(h-y > y){
            if(min > y) min = y;
        }else{
            if(min > h-y) min = h-y; 
        }
        bw.write(String.valueOf(min));
        bw.flush();
        bw.close();
    }

}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p2566 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        final int N = 9;
        int x=-1,y=-1;
        int MAX = Integer.MIN_VALUE;

        for(int i = 0 ; i < N ; i++){
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            for(int j = 0 ; j < N ; j++){
                int num = Integer.parseInt(st.nextToken());
                if(num > MAX){
                    MAX = num;
                    x = i+1;
                    y = j+1;
                }
                
            }
        }

        System.out.println(MAX);
        System.out.println(x + " " + y);
    }    
}

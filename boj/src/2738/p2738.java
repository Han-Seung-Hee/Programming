import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p2738 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[][] arr = new int[N][M];
        int[][] arr2 = new int[N][M];

        //Make matrix
        for(int i = 0 ; i < N ; i++){
            st = new StringTokenizer(br.readLine(), " ");
            for(int j = 0 ; j < M ; j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for(int i = 0 ; i<N ; i++){
            st = new StringTokenizer(br.readLine(), " ");
            for(int k = 0 ; k < M ; k++){
                arr2[i][k] = Integer.parseInt(st.nextToken());
            }
        }

        for(int i = 0 ; i < N ; i++){
            for(int j = 0 ; j < M ; j++){
                System.out.print(arr[i][j] + arr2[i][j] + " "); 
            }
            System.out.print("\n");
        }



        
    }
}

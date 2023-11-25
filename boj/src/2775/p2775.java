import java.util.Scanner;
public class p2775 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[15][15];
        int T = sc.nextInt();
        
        for(int i = 1 ; i < 15 ; i++){
            arr[0][i] = i;
        }

        for(int i = 1 ; i < 15 ; i++){
            for(int j = 1 ; j < 15 ; j++){
                if(j==1){
                    arr[i][j] = 1;
                }else{
                    arr[i][j] = arr[i-1][j] + arr[i][j-1];
                }
            }
        }

        for(int i = 0 ; i < T ; i++){

            int k = sc.nextInt();
            int n = sc.nextInt();
            
            System.out.println(arr[k][n]);
        }
    }
}

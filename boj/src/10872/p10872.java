import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
// get factorial
class p10872 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());

        System.out.println(factorial(a));
    }
    
    static int factorial(int n){
        
        if(n < 1) return 1;
        
        if(n <= 1){
            return n ;
        }else{
            return  n * factorial(n-1);
        }
    }
}

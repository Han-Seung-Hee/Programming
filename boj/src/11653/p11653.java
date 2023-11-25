import java.io.IOException;
import java.util.Scanner;

public class p11653 {
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        boolean isAble = false;

        if(a>=1) isAble = true;
        while(isAble){
            if(a > 1){
                for(int i = 2 ; i <= a ; i++){
                    if(a % i == 0 ){
                        System.out.println(i);
                        a = a/i;
                        break;
                    }
                }
            }else{
                break;
            }
        }
    }    
}

import java.util.Scanner;

public class p2581 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int sum = 0 ;
        int min = Integer.MAX_VALUE ;
        int cnt = 0 ;
        for(int i = x ; i <= y ; i++){
            if(i == 1) continue;
            if(findPrime(i)){
                sum += i;
                cnt++;
                if(i < min){
                    min = i;
                }
            }
        }

        if(cnt != 0){
        System.out.println(sum);
        System.out.println(min);
        }else{
            System.out.println(-1);
        }
    }    

    private static boolean findPrime(int x){
        for(int i = 2 ; i*i <= x ; i++){
            if(x % i == 0 ) return false;
        }

        return true;

    }
}

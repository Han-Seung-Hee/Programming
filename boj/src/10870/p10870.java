import java.util.Scanner;

public class p10870 {

    //get fibonacci number..

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        System.out.println(fibo(a));

        // if using while
        
    }

    static int fibo(int n){
        if(n==1){
            return 1;
        }else if(n==0){
            return 0;
        }else{
            return fibo(n-1) + fibo(n-2);
        }

    }

    static int[] fibo_usingRepeat(int n){

        int arr[] = new int[20];
                
        arr[0] = 0;
        arr[1] = 1;

        int index = 2;

        while(index <= n){
            arr[index] = arr[index -1] + arr[index -2];
            index ++;
        }

        return arr;
    }
}
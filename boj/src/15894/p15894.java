import java.util.Scanner;

public class p15894 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 층의 갯수 : 3 -> 5 -> 7
        // 둘레의 규칙 1 + 2 + 1 + ... + N
        Long N = sc.nextLong();

        Long floor = 1 + 2*(N) ;
        Long res = 3 * (floor - 1) / 2 + N ;

        System.out.println(res);
    }    
}

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class p14215 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] input = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).sorted().toArray();

        if(input[0] + input[1] > input[2]){
            System.out.println(input[0] + input[1] + input[2]);
        }else{
            System.out.println((input[0] + input[1]) * 2 - 1); // a+b+a+b-1 => 2*(a+b) -1 -> 삼각형의 조건에 맞지 않을 때 가장 긴 변의 길이는 a+b-1이면 최대임.
        }
    }    
}

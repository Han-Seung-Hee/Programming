import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
class Main{
    /*
    *  개요 : 무한히 큰 배열에 분수들이 적혀있다.
    *  이때, X번째 분수에 어떤값이 들어가는가?
    *
    *
    *  무한히 큰 배열이므로 규칙성을 찾아야함.
    *
    *
    * */
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());

        int end = 0 ; // 직전 대각선까지의 값의 합.
        int line = 0; // 대각선의 수
        int top = 0;
        int bottom = 0;
        while(N > end){
            line ++;
            end += line;
        }

        int diff = end - N ; // 이 대각선의 몇번째 자슥인가?

        if( line % 2 == 0){ // 짝수번째 
            top =  line - diff;
            bottom = diff + 1;
        }else{ // 홀수번째
            top = diff+ 1;
            bottom = line - diff;
        }

        bw.write(top + "/"+bottom);
        bw.flush();
        bw.close();

    }
}
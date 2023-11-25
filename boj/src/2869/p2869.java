import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p2869 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        
        StringTokenizer st= new StringTokenizer(br.readLine());

        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int z = Integer.parseInt(st.nextToken());

        // 높이 z인 나무 위로 올라갈것. 낮에는 x미터 올라고 밤에는 y 미터 내려간다.
        // 정상에 올라가면 내려가지 않는다.
        // 몇일걸리냐?
        // 달팽이는 하루에 x-y 만큼 감. 어디까지? z-y 까지
        // 만약 딱 떨어지지 않으면 +1 해주면 됨
        int goal = z - y;
        if(goal % (x-y) == 0) {
            System.out.println(goal/(x-y));
        }else{
            System.out.println(goal/(x-y)+1);
        }
    }     
}

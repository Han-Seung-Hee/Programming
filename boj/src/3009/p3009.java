import java.io.*;
import java.util.*;

public class p3009 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Map<Integer, Integer> x = new HashMap<>();  //x 좌표를 저장하는 맵
        Map<Integer, Integer> y = new HashMap<>();  //y 좌표를 저장하는 맵
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= 3; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            x.put(a, x.getOrDefault(a, 0) + 1);
            y.put(b, y.getOrDefault(b, 0) + 1);
        }
        // x 맵에 한 번만 나온 x 좌표를 출력
        for (int i : x.keySet()) {
            if (x.get(i) == 1) sb.append(i + " ");
        }
        //y 맵에 한 번만 나온 y 좌표를 출력
        for (int i : y.keySet()) {
            if (y.get(i) == 1) sb.append(i);
        }
        System.out.print(sb);
    }
}
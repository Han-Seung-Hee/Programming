import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p5073 {
    public static void main(String[] args) throws IOException{
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        StringBuilder sb = new StringBuilder();

        while(true){
            StringTokenizer st = new StringTokenizer(br.readLine());

            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            int z = Integer.parseInt(st.nextToken());
            String max = ( (x > y) && (x > z ) ) ? "x" : ( (y > x) && (y > z) ) ? "y" : "z";
            int maxInt = 0;
            int sumOfElse = 0;

            if("x".equals(max)){
                sumOfElse = y + z;
                maxInt = x;
            }else if("y".equals(max)){
                sumOfElse = x + z;
                maxInt = y;
            }else if("z".equals(max)){
                sumOfElse = y + x;
                maxInt = z;
            }

            if(x ==  0 && y == 0 && z == 0) break;

            if(x==y && y==z){
                sb.append("Equilateral").append("\n");
            }else if(maxInt >= sumOfElse){
                sb.append("Invalid").append("\n");
            }else if(x != y && x != z && y != z){
                sb.append("Scalene").append("\n");
            }else if( (x == y && x != z) || (y == z && y != x) || (x == z && x != y) ){
                sb.append("Isosceles").append("\n");
            }
        }

        sb.deleteCharAt(sb.length()-1);

        System.out.println(sb.toString());
    }    
}

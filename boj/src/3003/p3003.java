import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class p3003 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int[] compare = {1,1,2,2,2,8};
        String[] res = new String[6];
        
        for(int i = 0 ; i < s.length ; i++){
            int p = Integer.parseInt(s[i]);

            if(p == compare[i]) res[i] = "0";
            else res[i] = Integer.toString(compare[i]-p); 
        }

        System.out.println(String.join(" ", res));
    }
}
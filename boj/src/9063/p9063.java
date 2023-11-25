import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class p9063 {
    public static void main(String[] args) throws IOException{
        InputStreamReader isr = new InputStreamReader(System.in);
        OutputStreamWriter osw = new OutputStreamWriter(System.out);
        BufferedReader br = new BufferedReader(isr);
        BufferedWriter bw = new BufferedWriter(osw);

        int N = Integer.parseInt(br.readLine());
        ArrayList<Integer> lsx = new ArrayList<>();
        ArrayList<Integer> lsy = new ArrayList<>();

        for(int i = 0 ; i < N ; i++){
            StringTokenizer st= new StringTokenizer(br.readLine());
            lsx.add(Integer.parseInt(st.nextToken()));
            lsy.add(Integer.parseInt(st.nextToken()));           
        }

        Collections.sort(lsx);
        Collections.sort(lsy);

        int x_min = lsx.get(0);
        int x_max = lsx.get(lsx.size()-1);
        int y_min = lsy.get(0);
        int y_max = lsy.get(lsy.size()-1);
        
        bw.write(String.valueOf((x_max-x_min) * (y_max - y_min)));

        bw.flush();
        bw.close();

    }    
}

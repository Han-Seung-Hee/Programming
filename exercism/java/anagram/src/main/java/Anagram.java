
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

/*

Since this exercise has a difficulty of > 4 it doesn't come
with any starter implementation.
This is so that you get to practice creating classes and methods
which is an important part of programming in Java.

Please remove this comment when submitting your solution.

*/
public class Anagram{

    private String origin;

    public Anagram(String origin){
        this.origin = origin.toLowerCase(Locale.ROOT);
    }

    public ArrayList<String> match(List<String> candidates){
        ArrayList<String> res = new ArrayList<>();
        char[] oriArr = origin.toCharArray();
        Arrays.sort(oriArr);
        // 주어진 문자를 소팅하여 처리
        String comp1 = new String(oriArr);

        for(String cand : candidates){
            char[] compArr = cand.toLowerCase(Locale.ROOT).toCharArray();
            Arrays.sort(compArr);
            String comp2 = new String(compArr);
            // check
            // chekc 00. It is same between comp1 and comp2?
            // check 01. !(origin eq cand)
            // check 02. must not in here with same value (case-insensitive)
            if(comp1.equals(comp2)){ // check 00.
                if(!origin.toLowerCase(Locale.ROOT).equals(cand.toLowerCase(Locale.ROOT)))
                    res.add(cand);
            }

            for (String re : res) {
                System.out.println(re);
            }
        }
        return res;

    }

    public static void main(String[] args) {
        Anagram an = new Anagram("Orchestra");
        an.match(Arrays.asList("Carthorse"));
    }
}
import java.util.HashMap;
import java.util.Map;

class Scrabble {

    private String word;
    private static final Map<Integer,Integer> score = new HashMap<>(26);
    private static final Map<Character,Integer> score2 = new HashMap<>();

    static{
        "AEIOULNRST".chars().forEach(c -> score.put(c, 1));
        "DG".chars().forEach(c-> score.put(c,2));
        "BCMP".chars().forEach(c->score.put(c,3));
        "FHVWY".chars().forEach(c->score.put(c, 4));
        "K".chars().forEach(c->score.put(c,5));
        "JX".chars().forEach(c -> score.put(c, 8));
        "QZ".chars().forEach(c -> score.put(c, 10));        
        "z".chars().mapToObj(i -> (char)i).forEach(i-> score2.put(i,1));
    }

    Scrabble(String word) {
        this.word = word.toUpperCase();
    }

    int getScore() {
        return word.chars().reduce(0,(a,b) -> a + score.get(b));
    }

}

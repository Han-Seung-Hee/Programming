import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import javax.sound.sampled.SourceDataLine;
class WordCount{
    public Map<String, Integer> phrase(String phrase){
        String[] phrases = phrase.split("[ \n,:]+"); // 공백 , 개행태그, :????를 제외하고 조져리기
        Map<String, Integer> wordCount = new HashMap<>();
        for(String s:phrases){
            if (!s.isEmpty()){
                s = s.replaceAll("^[^a-zA-Z0-9]+", ""); // 앞에 문자 아닌거 자르고
                s = s.replaceAll("[^a-zA-Z0-9]+$", ""); // 뒤에 문자 아닌거 자르고
                
                String key = s.toLowerCase();

            
                if(wordCount.containsKey(key))
                    wordCount.put(key,wordCount.get(key)+1);
                else
                    wordCount.put(key,1);
            }
        }
        return wordCount;
    }

    public static void main(String[] args) {
        // String str = "Joe can't tell between 'large' and large.";
        String str = ",\n,one,\n ,two \n 'three'";

				Map<String,Integer> rs = new HashMap<>();
				rs = new WordCount().phrase(str);
			  System.out.println(rs.keySet());
			  System.out.println(rs.values());


    }
}
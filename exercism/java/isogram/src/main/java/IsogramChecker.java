import java.util.*;

class IsogramChecker {

    boolean isIsogram(String phrase) {

        Set<Character> st = new HashSet<>();

        for(char c : phrase.toLowerCase(Locale.ROOT).toCharArray()){

            if(Objects.equals(c,'-') || Objects.equals(c,' ')) continue;

            if(!st.add(c)){
                return false;
            }
        }
        return true;
    }

    boolean isIsogram2(String phrase){
        phrase = phrase.replaceAll("^[ |-]$","").toLowerCase(Locale.ROOT);

        return (phrase.chars().distinct().count() == phrase.length());

    }

}

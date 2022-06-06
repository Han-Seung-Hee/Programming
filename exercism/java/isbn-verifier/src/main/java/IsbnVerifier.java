import java.util.Locale;
import java.util.stream.IntStream;
import java.util.stream.Stream;

class IsbnVerifier {

    boolean isValid(String stringToVerify) {
        String str = stringToVerify.replaceAll("-","");
        // Validation
        boolean isContain = str.chars().anyMatch(Character::isLetter);
        if(isContain && ! str.endsWith("X")) return false;
        if(str.length() != 10) return false;

        int res = 0;
        char[] chArr = str.toCharArray();
        int j = 10;
        for(int i = 0 ; i < 10 ; i++){
            char ch = chArr[i];
            if(ch == 'X'){
                res += j * 10;
            }else {
                int a = ch-'0';
                res += j * a;
            }
            j--;
        }
        return res % 11 == 0;

    }

}

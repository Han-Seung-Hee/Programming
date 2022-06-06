import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// cond 1 : ? 이 들어가면 Sure
// cond 2 : 모든게 대문자면 Whoa, chill out!
// cond 3 : ? + 모든게 대문자면 Calm down, I know what I'm doing!
// cond 4 : 실제로 아무말도 하지 않고있으면 Fine. Be that way!
// cond 5 : 그 외 Whatever
class Bob{
    boolean chkCap = false;
    boolean chkNonCap = false;
    boolean chKQue = false;
    boolean isSaying = false;
    boolean chkNonAlpha = false;
    boolean onlyCap = false;

    public String hey(String in) {
        boolean idonknow = false;
        check(in);

        if (chKQue) {
            if (onlyCap) {
                return "Calm down, I know what I'm doing!";
            } else if (!isSaying) {
                return "Sure.";
            }
        } else if (onlyCap && !in.contains("?")) {
            return "Whoa, chill out!";
        } else if (!isSaying && !chkCap && !chKQue && !chkNonCap && !chkNonAlpha) {
            return "Fine. Be that way!";
        } else {
            return "Whatever.";
        }
        return "Whatever.";
    }

    void check(String str){
        String ori = str;
        str = str.replaceAll(" ","");

        Pattern p = Pattern.compile("[A-Z]");
        Pattern p2 = Pattern.compile("[\\W]");
        Pattern p3 = Pattern.compile("[a-z]");
        Pattern p4 = Pattern.compile("[0-9]");

        Matcher mt = p.matcher(str);
        Matcher mt2 = p2.matcher(str);
        Matcher mt3 = p3.matcher(str);
        Matcher mt4 = p4.matcher(str);

        if(mt.find())
            this.chkCap = true;
        if(mt2.find())
            this.isSaying = false;
        if(mt3.find())
            this.chkNonCap = true;
        if(str.length() > 0 && str.charAt(str.length()-1) == '?')
            this.chKQue = true;
        if(mt4.find()){
            this.chkNonAlpha = true;
        }
        boolean temp = false;

        for(char ch : ori.toCharArray()){
            if(Character.isAlphabetic(ch) && Character.isUpperCase(ch))
                this.onlyCap = true;
            else if(Character.isAlphabetic(ch) && Character.isLowerCase(ch))
                temp = true;
        }

        if(temp) this.onlyCap = false;
    }
}
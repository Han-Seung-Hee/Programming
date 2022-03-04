import java.util.*;

public class PigLatinTranslator{
    public static void main(String[] args) {
        PigLatinTranslator tr = new PigLatinTranslator();
        System.out.println(tr.translate("xray"));
    }
    public String translate(String in){
        String[] arr = in.split(" ");
        StringBuilder res = new StringBuilder();
        if(arr.length != 1){
            for(int i = 0 ; i < arr.length ; i++){
                if(i == 0){
                    res = new StringBuilder(annoyingAndStupidAndShittyProblemSolver(arr[i]));
                }else{
                    res.append(" ");
                    res.append(annoyingAndStupidAndShittyProblemSolver(arr[i]));
                }
            }
            return res.toString();
        }else{
            return annoyingAndStupidAndShittyProblemSolver(in);
        }
    }

    public String annoyingAndStupidAndShittyProblemSolver(String in){
        // a ,e ,i , o, u
        String in_pros = in.toLowerCase(Locale.ROOT);
        // xy,yt
        String prefix = in_pros.substring(0,2);
        String target;


        //Rule 1
        if(isVowel(in_pros)|| "xr".equals(prefix) || "yt".equals(prefix)){
            return in+"ay";
        }

        /*
         *  자음 구성 음이 나면 자음 부분을 맨 뒤로 보내고 ay를 붙인다.
         *  자음 으로 시작하고 qu 가 따라나오면 squ까지 보내고 ay를 붙인다.
         *  y가 자음 집합 뒤에 붙거나 2개 문자로 구성된 단어의 두번째에 오는 경우 첫번째를 보내고 뒤에 붙인다.
         * */

        else if(!isVowel(in_pros)){
            int conPos = findConstantCluster(in_pros);
            if(in_pros.length()  >= 3 && "qu".equals(in_pros.substring(1,3))) {
                target = in_pros.substring(0,3);
                in_pros = in_pros.replaceAll(target, "");
                return in_pros + target + "ay";
            }else if(Objects.equals('y',in_pros.charAt(conPos+1))){
                target = in_pros.substring(0, conPos+1);
                in_pros = in_pros.replace(target, "");
                return in_pros + target + "ay";
            }else if("qu".equals(in_pros.substring(0,2))){
                target = in_pros.substring(0,2);
                in_pros = in_pros.replaceAll(target, "");
                return in_pros + target + "ay";
            }else{
//                target = conPos == 0 ? in_pros.substring(0,conPos+1) : in_pros.substring(0, conPos+1);
                target = in_pros.substring(0,conPos+1);
                in_pros = in_pros.replace(target, "");
                return in_pros+target+"ay";
            }

        }

        else return "";

    }

    private boolean isVowel(String in_pros) {
        return in_pros.startsWith("a") || in_pros.startsWith("e") || in_pros.startsWith("i") || in_pros.startsWith("o") || in_pros.startsWith("u");
    }

    private int findConstantCluster(String in_pros){
        if(isVowel(Character.toString(in_pros.charAt(0))))
            return -1;
        String[] arr = in_pros.split("");
        ArrayList<String> ls = new ArrayList<>(Arrays.asList(arr));
        int pos = 0;
        for(int i = 0 ; i < ls.size() ; i++){
            if(i != 0){
                if("y".equals(ls.get(i))){
                    pos = i -1;
                    break;
                }
            }
            if(isVowel(ls.get(i))){
                pos = i - 1;
                break;
            }
        }
        return pos;
    }
}
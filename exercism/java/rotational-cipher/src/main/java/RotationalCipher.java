import java.util.HashMap;
import java.util.Map;

class RotationalCipher {
    // Rot13 : 
    // if a.pos == 0
        // ROT13(a)
        // ==> ROT13(a).pos = 14 --> n;
    int shiftKey ;

    Map<Integer,Character> lcMap = new HashMap<>();
    Map<Integer,Character> ucMap = new HashMap<>();
    RotationalCipher(int shiftKey) {
        this.shiftKey = shiftKey;
        int pos = 1 ;
        // Make baseMap

        for(int i = (int)'a' ; i <= (int)'z' ; i++){
            lcMap.put(pos,(char)i);
            pos++;
        }

        pos =1;
        for(int i = (int)'A' ; i<= (int)'Z' ; i++){
            ucMap.put(pos,(char)i);
            pos++;
        }
    }

    String rotate(String data) {
        char[] chArr = data.toCharArray();
        char[] rtnArr = new char[chArr.length];
        int bfPos = 0 ;
        int aftPos = 0;
        
        if(shiftKey == 0) return data;

        for(int i = 0 ; i < chArr.length ;i++){
            if(Character.isUpperCase(chArr[i])){// 대문자
                for(Integer key : ucMap.keySet()){
                    if(chArr[i] == ucMap.get(key)){
                        bfPos = key;
                    }
                }        
                aftPos = (bfPos + shiftKey) > 26 ? (bfPos+shiftKey) - 26 : bfPos + shiftKey;
                rtnArr[i] = ucMap.get(aftPos);

            }else if(Character.isLowerCase(chArr[i])){//소문자
                for(Integer key : lcMap.keySet()){
                    if(chArr[i] == lcMap.get(key)){
                        bfPos = key;
                    }
                }        
                aftPos = (bfPos + shiftKey) > 26 ? (bfPos+shiftKey) - 26 : bfPos + shiftKey;        
                rtnArr[i] = lcMap.get(aftPos);

            }else if((int)chArr[i] == 32){ // 공백
                rtnArr[i] = ' ';
            }else{ // digit
                rtnArr[i] = chArr[i];
            }
        }
        return new String(rtnArr);
    }
}

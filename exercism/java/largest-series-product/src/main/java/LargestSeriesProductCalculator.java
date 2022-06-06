import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class LargestSeriesProductCalculator {

    // process
    // 1. 받은 문자열을 Long으로 변환
    // 2. 받은 수의 length 를 확인
    // 3. digits 범위로 수를 각각 쪼개서 가장 큰 값을 찾아서 곱한다.
    // 4. 이 때 0이 없어야함.
    private String x ;
    private int len;
    LargestSeriesProductCalculator(String inputNumber){
        for(char ch : inputNumber.toCharArray()){
            if(Character.isAlphabetic(ch)){
                throw new IllegalArgumentException("String to search may only contain digits.");
            }
        }
        this.len = inputNumber.length();
        this.x = inputNumber;
    }

    long calculateLargestProductForSeriesLength(int numberOfDigits) {


        long result = -1L;

        if(numberOfDigits > len){
            throw new IllegalArgumentException("Series length must be less than or equal to the length of the string to search.");
        }else if(numberOfDigits < 0){
            throw new IllegalArgumentException("Series length must be non-negative.");
        }
        if(x.isEmpty() && numberOfDigits != 0) throw new IllegalArgumentException("Series length must be less than or equal to the length of the string to search.");
        if(x.isEmpty()) return 1;
        List<Long> ls = new ArrayList<>();

        for(int i = 0 ; i < len ; i ++){
            if(i+ numberOfDigits <=len)
                ls.add(calc(x.substring(i, numberOfDigits+i)));
        }

        //find maximum value
        for (Long l : ls) {
            if (result < l) result = l;
        }

        return result;
    }

    long calc(String in){
        long res = 1L;
        for(char c : in.toCharArray()){
            res *= Character.getNumericValue(c);
        }

        return res;
    }
}

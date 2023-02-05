import netscape.javascript.JSObject;

class LuhnValidator {

    boolean isValid(String candidate) {

        final String pro_str = candidate.replaceAll(" ","");
        final int LEN = pro_str.length();
        boolean isOnlyNumeric = true;
        int chkInt = 0;
        int res = 0 ;
        for(char ch : pro_str.toCharArray()){
            if(!Character.isDigit(ch)){
                isOnlyNumeric = false;
            }
        }

        //validation
        if(LEN <= 1){
            return false;
        }else if(!isOnlyNumeric){
            return false;
        }
        int loc = 1;
        // processing - doubling every second digit (starting from right)
        for(int i = pro_str.length()-1 ; i >= 0 ; i-- ){
            chkInt = Character.getNumericValue(pro_str.charAt(i));
            if(loc%2 == 0){
                if(chkInt*2 > 9){
                    chkInt = (chkInt*2) - 9;
                }else{
                    chkInt = chkInt * 2;
                }

            }
            loc++;
            res += chkInt;
        }

        System.out.println(res);

        return (res%10 ==0);
    }
}

import java.util.*;
class DiamondPrinter {
    List<String> printToList(char a) {
        List<String> diamond=new ArrayList<>();
        int n=a-'A'; // endPoint
        char k='A';  // start
        // 0 - base 인 경우, 항 행의 총 갯수는 2*n
        // 문자가 들어가는 위치는 왜 이렇게 잡은걸까
        for(int i=0;i<=n;i++){
            String temp="";
            for(int j=0;j<=2*n;j++){
                if(j+i==n || j-i==n)
                    temp+=(char)(k+i);
                else
                    temp+=(" ");
            }
            diamond.add(temp);
        }
        for(int i=n-1;i>=0;i--){
            String temp="";
            for(int j=0;j<=2*n;j++){
                if(i+j==n|| j-i==n)
                    temp+=(char)(k+i);
                else
                    temp+=(" ");
            }
            diamond.add(temp);
        }
        return(diamond);
    }
}

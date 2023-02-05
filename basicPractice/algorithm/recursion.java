class recursion{
    public static void main(String[] args){
            recur(1,1,1,1,0);
    }

    public static void recur(int one, int two, int three, int four, int res){
            if(0<one){
                System.out.println("call 1 ");

                System.out.println(one);
                System.out.println(two);
                System.out.println(three);
                System.out.println(four);
                
                System.out.println("=========================================");
                recur(one-1, two, three, four, res*10+1);
            }

            if(0<two){
                System.out.println("call 2 ");

                System.out.println(one);
                System.out.println(two);
                System.out.println(three);
                System.out.println(four);
                System.out.println("=========================================");
                recur(one, two-1, three, four, res*10+2);
            }
            
            if(0<three){

                System.out.println(one);
                System.out.println(two);
                System.out.println(three);
                System.out.println(four);
                System.out.println("=========================================");
                System.out.println("call 3");
                recur(one, two, three-1, four, res*10+3);
            }

            if(0<four){

                System.out.println(one);
                System.out.println(two);
                System.out.println(three);
                System.out.println(four);
                System.out.println("=========================================");
                System.out.println("call 4");
                recur(one, two, three, four-1, res*10+4);
            }

            if(one == 0 && two == 0 && three == 0 && four == 0){
                System.out.println(res);
                System.out.println("=========================================");
            }
    }

}
public class FootballMatchReports {    
    public static String onField(int shirtNum) {
        String position ="";
        try{
            if(shirtNum < 1 || shirtNum > 11){
                throw new IllegalArgumentException();
            }
            switch(shirtNum){
                case 1 :
                    position = "goalie";
                    break;
                case 2 : 
                    position = "left back";
                    break;
                case 3 :
                case 4 :
                    position = "center back";
                    break;
                case 5:
                    position = "right back";
                    break;
                case 6:
                case 7:
                case 8:
                    position = "midfielder";
                    break;
                case 9:
                    position = "left wing";
                    break;
                case 10:
                    position = "striker";
                    break;
                case 11:
                    position = "right wing";
                    break;
            }

        }catch(Exception e){
            e.printStackTrace();
            throw e;
        }

        return position;
    }
}

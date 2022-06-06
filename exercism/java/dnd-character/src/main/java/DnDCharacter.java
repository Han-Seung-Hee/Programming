import java.util.Arrays;
import java.util.Random;

class DnDCharacter {

    private int str;
    private int con;
    private int intelligence;
    private int cha;
    private int wis;
    private int dex;
    public DnDCharacter(){
        this.str = ability();
        this.con = ability();
        this.dex = ability();
        this.wis = ability();
        this.intelligence = ability();
        this.cha = ability();
    }

    // get constitution modifier floor((10-con)/2)
    int modifier(int input) {
        double res = Math.floor((double)(input-10)/2);
        return (int)res;
    }

    int getStrength() {
        return str;
    }

    int getDexterity() {
        return dex;
    }

    int getConstitution() {
        return con;
    }

    int getIntelligence() {
        return intelligence;
    }

    int getWisdom() {
        return wis;
    }

    int getCharisma() {
        return cha;
    }

    int getHitpoints() {
        return 10 + modifier(con);
    }

    int ability(){
        int[] arr= new int[4];
        Random rm = new Random();
        for(int i = 0 ; i < 4 ; i++){
            arr[i] = rm.nextInt(6) + 1;
        }
        Arrays.sort(arr);
        int sum = 0;
        for(int j = 0 ; j < 3 ; j++){
            sum += arr[j];
        }

        return sum;
    }
}

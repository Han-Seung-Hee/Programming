import java.util.ArrayList;
import java.util.List;

class TwelveDays {

    private List<String> days = new ArrayList<>();
    private List<String> gifts = new ArrayList<>();

    TwelveDays(){
        setup();
    }

    String verse(int verseNumber) {
        StringBuilder sb = new StringBuilder();

            sb.append(String.format("On the %s day of Christmas my true love gave to me: ",days.get(verseNumber-1)));
            for(int j = verseNumber ; j > 0 ; j--){
                if(j == 1){
                    if(verseNumber != 1) sb.append("and ");
                    sb.append(String.format("%s.\n", gifts.get(0)));
                }else {
                    sb.append(String.format("%s, ", gifts.get(j-1)));
                }
            }


        return sb.toString();
    }

    String verses(int startVerse, int endVerse) {
        StringBuilder sb = new StringBuilder();

        for(int i = startVerse ; i <= endVerse ; i++){
            sb.append(String.format("On the %s day of Christmas my true love gave to me: ",days.get(i-1)));
            for(int j = 0 ; j < i ; j++){
                if(i > 1 && j == i -1) sb.append("and ");
                if(j == i-1) sb.append(String.format("%s.", gifts.get(0)));
                else sb.append(String.format("%s, ", gifts.get(i-j-1)));
            }
            if(i == endVerse) sb.append("\n");
            else sb.append("\n\n");
        }



        return sb.toString();
    }
    
    String sing() {
        return verses(1,12);
    }

    void setup(){
        days.add("first");
        days.add("second");
        days.add("third");
        days.add("fourth");
        days.add("fifth");
        days.add("sixth");
        days.add("seventh");
        days.add("eighth");
        days.add("ninth");
        days.add("tenth");
        days.add("eleventh");
        days.add("twelfth");

        gifts.add("a Partridge in a Pear Tree");
        gifts.add("two Turtle Doves");
        gifts.add("three French Hens");
        gifts.add("four Calling Birds");
        gifts.add("five Gold Rings");
        gifts.add("six Geese-a-Laying");
        gifts.add("seven Swans-a-Swimming");
        gifts.add("eight Maids-a-Milking");
        gifts.add("nine Ladies Dancing");
        gifts.add("ten Lords-a-Leaping");
        gifts.add("eleven Pipers Piping");
        gifts.add("twelve Drummers Drumming");
    }


}

class Proverb {

    private String[] word;

    Proverb(String[] words) {
        this.word = words;
    }

    String recite() {
        StringBuilder res = new StringBuilder();

        if (word.length == 1) {
            res.append(String.format("And all for the want of a %s.", word[0]));
        } else if (word.length == 0){
            res.append("");
        }else{
            for(int i = 1 ; i < word.length ; i++){
                res.append(String.format("For want of a %s the %s was lost.\n",word[i-1],word[i]));
            }
            res.append(String.format("And all for the want of a %s.", word[0]));
        }

        return res.toString();
    }

}

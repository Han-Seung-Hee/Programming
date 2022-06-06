class FoodChain {
    private final String[] foods = {
            "fly", "spider", "bird", "cat", "dog", "goat", "cow", "horse"
    };
    private final String[] lyrics = {
            "It wriggled and jiggled and tickled inside her.\n",
            "How absurd to swallow a bird!\n",
            "Imagine that, to swallow a cat!\n",
            "What a hog, to swallow a dog!\n",
            "Just opened her throat and swallowed a goat!\n",
            "I don't know how she swallowed a cow!\n"
    };

    public String verse(int n) {
        StringBuffer sb = new StringBuffer();
        sb.append("I know an old lady who swallowed a ");
        sb.append(foods[n-1]);
        sb.append(".\n");
        if (n==8) {
            sb.append("She's dead, of course!");
        } else {
            if (n>1) sb.append(lyrics[n-2]);
            for (int i=n-2;i>=0;i--) {
                sb.append("She swallowed the ");
                sb.append(foods[i+1]);
                sb.append(" to catch the ");
                sb.append(foods[i]);
                if (i==1) sb.append(" that wriggled and jiggled and tickled inside her.\n");
                else sb.append(".\n");
            }
            sb.append("I don't know why she swallowed the fly. Perhaps she'll die.");
        }
        return sb.toString();
    }
    public String verses(int start, int end) {
        StringBuffer sb = new StringBuffer();
        for (int i=start;i<=end;i++) {
            sb.append(verse(i));
            if (i<end) sb.append("\n\n");
        }
        return sb.toString();
    }

}
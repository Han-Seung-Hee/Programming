class House {
    String[] nouns = {
            "malt",
            "rat",
            "cat",
            "dog",
            "cow with the crumpled horn",
            "maiden all forlorn",
            "man all tattered and torn",
            "priest all shaven and shorn",
            "rooster that crowed in the morn",
            "farmer sowing his corn",
            "horse and the hound and the horn"
    };
    String[] verbs = {
            "ate", "killed", "worried", "tossed", "milked", "kissed",
            "married", "woke", "kept", "belonged to"
    };
    String verse(int n) {
        StringBuffer sb = new StringBuffer();
        if (n>1) {
            sb.append("This is the ");
            sb.append(nouns[n-2]);
            sb.append(" ");
            for (int i=n-3;i>=0;i--) {
                sb.append("that ");
                sb.append(verbs[i]);
                sb.append(" the ");
                sb.append(nouns[i]);
                sb.append(" ");
            }
            sb.append("that lay in the house that Jack built.");
        } else {
            sb.append("This is the house that Jack built.");
        }
        return sb.toString();
    }

    String verses(int start, int end) {
        StringBuffer sb = new StringBuffer();
        for (int i=start;i<=end;i++) {
            sb.append(verse(i));
            if (i<end) sb.append("\n");
        }
        return sb.toString();
    }
    String sing() {
        return verses(1, 12);
    }
}
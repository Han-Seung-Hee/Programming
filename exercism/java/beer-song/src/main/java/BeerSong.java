public class BeerSong {
    public String sing(int tot, int amount) {

        int curAmt;
        StringBuffer sb = new StringBuffer();

        // tot에서 amount만큼 뺀다.
        for (int i = amount; i > 0; i--) {
            if (tot == 1) {
                sb.append("1 bottle of beer on the wall, 1 bottle of beer.\n");
                sb.append("Take it down and pass it around, no more bottles of beer on the wall.\n\n");
            } else if (tot == 0) {
                sb.append("No more bottles of beer on the wall, no more bottles of beer.\n");
                sb.append("Go to the store and buy some more, 99 bottles of beer on the wall.\n\n");
            } else {
                sb.append(String.format("%d bottles of beer on the wall, %d bottles of beer.\n", tot, tot));
                if (tot == 2) {
                    sb.append("Take one down and pass it around, 1 bottle of beer on the wall.\n\n");
                } else {
                    sb.append(String.format("Take one down and pass it around, %d bottles of beer on the wall.\n\n", tot - 1));
                }
            }
            tot--;

        }

        return sb.toString();
    }

    public String singSong() {
        return sing(99, 100);
    }
}
class ResistorColor {

    private String[] colorArr = new String[10] ;

    public ResistorColor() {
        colors();
    }

    int colorCode(String color) {
        int code = -1;
        for(int i = 0 ; i < this.colorArr.length ; i++){
            if(color.equals(colorArr[i]))
               code = i;
        }

        return code;
    }

    String[] colors() {
        this.colorArr = new String[]{"black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white"};
        return colorArr;
    }
}

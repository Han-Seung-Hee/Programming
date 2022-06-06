class Darts {

    private double x;
    private double y;
    public Darts(double x , double y){
        this.x = x;
        this.y = y;
    }

    public int score(){
        // 좌표평면상의 직선의 거리
        // c^2 = x^2 + y^2
        double pos = Math.sqrt(Math.pow(x,2) + Math.pow(y,2));
        int score;
        if(pos <= 1){
            score = 10;
        }else if(pos <= 5){
            score = 5;
        }else if(pos <= 10){
            score =1;
        }else{
            score = 0;
        }

        return score;
    }
}
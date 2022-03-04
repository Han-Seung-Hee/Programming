class NeedForSpeed {
    // TODO: define the constructor for the 'NeedForSpeed' class
    private int speed = 0;
    private int batteryDrain = 0;
    private int distance = 0;
    private int batteryAmt = 100;

    public NeedForSpeed(int speed, int batteryDrain){
        this.speed = speed;
        this.batteryDrain = batteryDrain;
    }

    
    public boolean batteryDrained() {
        if(batteryAmt > 0){
            return  false;
        }else{
            return true;
        }
    }

    public int distanceDriven() {
        return distance;
    }

    public void drive() {
        if(!(batteryAmt <= 0)){
            distance += speed;
            batteryAmt -= batteryDrain;
        }
    }

    public static NeedForSpeed nitro() {
        NeedForSpeed resClass = new NeedForSpeed(50, 4);
                
        return resClass;
    }

    public int getBattery(){
        return this.batteryDrain;
    }

    public int getSpeed(){
        return this.speed;
    }

    
}

class RaceTrack {
    // TODO: define the constructor for the 'RaceTrack' class
    private int raceDistance = 0;
    public RaceTrack(int Distance){
        this.raceDistance = Distance;
    }


    public boolean carCanFinish(NeedForSpeed car) {
        int fullRange = 100/car.getBattery() * car.getSpeed();
        int flag = raceDistance - fullRange;
        if(flag > 0) return false;
        else return true;
    }
}

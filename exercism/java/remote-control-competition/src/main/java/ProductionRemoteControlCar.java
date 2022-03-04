class ProductionRemoteControlCar<T> implements RemoteControlCar, Comparable<ProductionRemoteControlCar> {

    private final int SPEED = 10;
    private int distanceTravelled;
    private int numberOfvictories;

    @Override
    public void drive() {
       distanceTravelled += SPEED; 
    }

    @Override
    public int getDistanceTravelled() {
        return distanceTravelled;
    }

    public int getNumberOfVictories() {
        return numberOfvictories;
    }

    public void setNumberOfVictories(int numberofVictories) {
        this.numberOfvictories = numberofVictories;
    }

    @Override
    public int compareTo(ProductionRemoteControlCar o) {
        return this.numberOfvictories - o.getNumberOfVictories();
    }
}

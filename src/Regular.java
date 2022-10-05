public class Regular extends Vehicles {
    protected int howManyPassengers;

    public Regular(int carId, int carAge, int wheelsCount, String hegeOrKidon, double mezahaminForMinute, int howManyPassengers) {
        super(carId, carAge, wheelsCount, hegeOrKidon, mezahaminForMinute);
        this.howManyPassengers = howManyPassengers;
    }

    public int getHowManyPassengers() {
        return howManyPassengers;
    }

    public void setHowManyPassengers(int howManyPassengers) {
        this.howManyPassengers = howManyPassengers;
    }

    @Override
    public String toString() {
        return "Regular{" +
                "howManyPassengers=" + howManyPassengers +
                ", carId=" + carId +
                ", carAge=" + carAge +
                ", wheelsCount=" + wheelsCount +
                ", hegeOrKidon='" + hegeOrKidon + '\'' +
                ", mezahaminForMinute=" + mezahaminForMinute +
                '}';
    }
}

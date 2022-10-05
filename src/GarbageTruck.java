public class GarbageTruck extends Truck{
    protected double howManyZevel;

    public GarbageTruck(int carId, int carAge, int wheelsCount, String hegeOrKidon, double mezahaminForMinute, int howManyCarsToLimshoch, double mishkalHaamasaMax, double howManyZevel) {
        super(carId, carAge, wheelsCount, hegeOrKidon, mezahaminForMinute, howManyCarsToLimshoch, mishkalHaamasaMax);
        this.howManyZevel = howManyZevel;
    }

    public double getHowManyZevel() {
        return howManyZevel;
    }

    public void setHowManyZevel(double howManyZevel) {
        this.howManyZevel = howManyZevel;
    }

    @Override
    public String toString() {
        return "GarbageTruck{" +
                "howManyZevel=" + howManyZevel +
                ", mishkalHaamasaMax=" + mishkalHaamasaMax +
                ", howManyCarsToLimshoch=" + howManyCarsToLimshoch +
                ", carId=" + carId +
                ", carAge=" + carAge +
                ", wheelsCount=" + wheelsCount +
                ", hegeOrKidon='" + hegeOrKidon + '\'' +
                ", mezahaminForMinute=" + mezahaminForMinute +
                '}';
    }
}

public class Heavy extends Vehicles{
    protected int howManyCarsToLimshoch;

    public Heavy(int carId, int carAge, int wheelsCount, String hegeOrKidon, double mezahaminForMinute, int howManyCarsToLimshoch) {
        super(carId, carAge, wheelsCount, hegeOrKidon, mezahaminForMinute);
        this.howManyCarsToLimshoch = howManyCarsToLimshoch;
    }

    public int getHowManyCarsToLimshoch() {
        return howManyCarsToLimshoch;
    }

    public void setHowManyCarsToLimshoch(int howManyCarsToLimshoch) {
        this.howManyCarsToLimshoch = howManyCarsToLimshoch;
    }

    public double exhaust()
    {
        return super.exhaust() + (500 * howManyCarsToLimshoch);
    }

    @Override
    public String toString() {
        return "Heavy{" +
                "howManyCarsToLimshoch=" + howManyCarsToLimshoch +
                ", carId=" + carId +
                ", carAge=" + carAge +
                ", wheelsCount=" + wheelsCount +
                ", hegeOrKidon='" + hegeOrKidon + '\'' +
                ", mezahaminForMinute=" + mezahaminForMinute +
                '}';
    }
}

public class Truck extends Heavy{
    protected double mishkalHaamasaMax;

    public Truck(int carId, int carAge, int wheelsCount, String hegeOrKidon, double mezahaminForMinute, int howManyCarsToLimshoch, double mishkalHaamasaMax) {
        super(carId, carAge, wheelsCount, hegeOrKidon, mezahaminForMinute, howManyCarsToLimshoch);
        this.mishkalHaamasaMax = mishkalHaamasaMax;
    }

    public double getMishkalHaamasaMax() {
        return mishkalHaamasaMax;
    }

    public void setMishkalHaamasaMax(double mishkalHaamasaMax) {
        this.mishkalHaamasaMax = mishkalHaamasaMax;
    }

    @Override
    public String toString() {
        return "Truck{" +
                "mishkalHaamasaMax=" + mishkalHaamasaMax +
                ", howManyCarsToLimshoch=" + howManyCarsToLimshoch +
                ", carId=" + carId +
                ", carAge=" + carAge +
                ", wheelsCount=" + wheelsCount +
                ", hegeOrKidon='" + hegeOrKidon + '\'' +
                ", mezahaminForMinute=" + mezahaminForMinute +
                '}';
    }
}

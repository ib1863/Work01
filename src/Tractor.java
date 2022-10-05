public class Tractor extends Heavy{
    protected String kindOfNigrarim;

    public Tractor(int carId, int carAge, int wheelsCount, String hegeOrKidon, double mezahaminForMinute, int howManyCarsToLimshoch, String kindOfNigrarim) {
        super(carId, carAge, wheelsCount, hegeOrKidon, mezahaminForMinute, howManyCarsToLimshoch);
        this.kindOfNigrarim = kindOfNigrarim;
    }

    public String getKindOfNigrarim() {
        return kindOfNigrarim;
    }

    public void setKindOfNigrarim(String kindOfNigrarim) {
        this.kindOfNigrarim = kindOfNigrarim;
    }

    @Override
    public String toString() {
        return "Tractor{" +
                "kindOfNigrarim='" + kindOfNigrarim + '\'' +
                ", howManyCarsToLimshoch=" + howManyCarsToLimshoch +
                ", carId=" + carId +
                ", carAge=" + carAge +
                ", wheelsCount=" + wheelsCount +
                ", hegeOrKidon='" + hegeOrKidon + '\'' +
                ", mezahaminForMinute=" + mezahaminForMinute +
                '}';
    }
}

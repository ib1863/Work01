public class Cart extends Light{
    protected double chargeTime;

    public Cart(int carId, int carAge, int wheelsCount, String hegeOrKidon, double mezahaminForMinute, boolean thereIsManoa, double chargeTime) {
        super(carId, carAge, wheelsCount, hegeOrKidon, mezahaminForMinute, thereIsManoa);
        this.chargeTime = chargeTime;
    }

    public double getChargeTime() {
        return chargeTime;
    }

    public void setChargeTime(double chargeTime) {
        this.chargeTime = chargeTime;
    }

    @Override
    public String toString() {
        return "Cart{" +
                "chargeTime=" + chargeTime +
                ", thereIsManoa=" + thereIsManoa +
                ", carId=" + carId +
                ", carAge=" + carAge +
                ", wheelsCount=" + wheelsCount +
                ", hegeOrKidon='" + hegeOrKidon + '\'' +
                ", mezahaminForMinute=" + mezahaminForMinute +
                '}';
    }
}

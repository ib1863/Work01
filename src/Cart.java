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

    public boolean hitchhikers()
    {
        if (super.thereIsManoa == true)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public double exhaust()
    {
        if (super.thereIsManoa == true)
        {
            return super.exhaust() + 300;
        }
        else {
            return super.exhaust();
        }
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

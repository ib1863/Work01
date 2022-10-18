public class Light extends Vehicles{
    protected boolean thereIsManoa;

    public Light(int carId, int carAge, int wheelsCount, String hegeOrKidon, double mezahaminForMinute, boolean thereIsManoa) {
        super(carId, carAge, wheelsCount, hegeOrKidon, mezahaminForMinute);
        this.thereIsManoa = thereIsManoa;
    }

    public boolean isThereIsManoa() {
        return thereIsManoa;
    }

    public void setThereIsManoa(boolean thereIsManoa) {
        this.thereIsManoa = thereIsManoa;
    }



    @Override
    public String toString() {
        return "Light{" +
                "thereIsManoa=" + thereIsManoa +
                ", carId=" + carId +
                ", carAge=" + carAge +
                ", wheelsCount=" + wheelsCount +
                ", hegeOrKidon='" + hegeOrKidon + '\'' +
                ", mezahaminForMinute=" + mezahaminForMinute +
                '}';
    }
}

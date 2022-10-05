public class Vehicles {
    protected int carId;
    protected int carAge;
    protected int wheelsCount;
    protected String hegeOrKidon;
    protected double mezahaminForMinute;

    public Vehicles(int carId, int carAge, int wheelsCount, String hegeOrKidon, double mezahaminForMinute) {
        this.carId = carId;
        this.carAge = carAge;
        this.wheelsCount = wheelsCount;
        this.hegeOrKidon = hegeOrKidon;
        this.mezahaminForMinute = mezahaminForMinute;
    }

    public int getCarId() {
        return carId;
    }

    public void setCarId(int carId) {
        this.carId = carId;
    }

    public int getCarAge() {
        return carAge;
    }

    public void setCarAge(int carAge) {
        this.carAge = carAge;
    }

    public int getWheelsCount() {
        return wheelsCount;
    }

    public void setWheelsCount(int wheelsCount) {
        this.wheelsCount = wheelsCount;
    }

    public String getHegeOrKidon() {
        return hegeOrKidon;
    }

    public void setHegeOrKidon(String hegeOrKidon) {
        this.hegeOrKidon = hegeOrKidon;
    }

    public double getMezahaminForMinute() {
        return mezahaminForMinute;
    }

    public void setMezahaminForMinute(double mezahaminForMinute) {
        this.mezahaminForMinute = mezahaminForMinute;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Vehicles{" +
                "carId=" + carId +
                ", carAge=" + carAge +
                ", wheelsCount=" + wheelsCount +
                ", hegeOrKidon='" + hegeOrKidon + '\'' +
                ", mezahaminForMinute=" + mezahaminForMinute +
                '}';
    }
}

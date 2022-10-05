public class Bus extends Regular{
    protected boolean forStudents;

    public Bus(int carId, int carAge, int wheelsCount, String hegeOrKidon, double mezahaminForMinute, int howManyPassengers, boolean forStudents) {
        super(carId, carAge, wheelsCount, hegeOrKidon, mezahaminForMinute, howManyPassengers);
        this.forStudents = forStudents;
    }

    public boolean isForStudents() {
        return forStudents;
    }

    public void setForStudents(boolean forStudents) {
        this.forStudents = forStudents;
    }

    @Override
    public String toString() {
        return "Bus{" +
                "forStudents=" + forStudents +
                ", howManyPassengers=" + howManyPassengers +
                ", carId=" + carId +
                ", carAge=" + carAge +
                ", wheelsCount=" + wheelsCount +
                ", hegeOrKidon='" + hegeOrKidon + '\'' +
                ", mezahaminForMinute=" + mezahaminForMinute +
                '}';
    }
}

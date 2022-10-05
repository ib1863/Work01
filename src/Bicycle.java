public class Bicycle extends Light{
    protected boolean yeshSalsela;

    public Bicycle(int carId, int carAge, int wheelsCount, String hegeOrKidon, double mezahaminForMinute, boolean thereIsManoa, boolean yeshSalsela) {
        super(carId, carAge, wheelsCount, hegeOrKidon, mezahaminForMinute, thereIsManoa);
        this.yeshSalsela = yeshSalsela;
    }

    public boolean isYeshSalsela() {
        return yeshSalsela;
    }

    public void setYeshSalsela(boolean yeshSalsela) {
        this.yeshSalsela = yeshSalsela;
    }

    @Override
    public String toString() {
        return "Bicycle{" +
                "yeshSalsela=" + yeshSalsela +
                ", thereIsManoa=" + thereIsManoa +
                ", carId=" + carId +
                ", carAge=" + carAge +
                ", wheelsCount=" + wheelsCount +
                ", hegeOrKidon='" + hegeOrKidon + '\'' +
                ", mezahaminForMinute=" + mezahaminForMinute +
                '}';
    }
}

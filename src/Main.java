public class Main {
    public double howManyZihom(Vehicles[] arr)
    {
        double allZhihom = 0;
        for(int i = 0;i<arr.length;i++)
        {
            allZhihom += arr[i].exhaust();
        }
        return allZhihom;
    }

    public void  pullNoise (Vehicles[] arr)
    {
        for(int i = 0;i < arr.length;i++)
        {
            if(arr[i] instanceof Regular)
            {
                ((Regular) arr[i]).noise();
            }
        }
    }

    public int withoutDriver (Vehicles[] arr)
    {
        int sum = 0;
        for(int i = 0;i< arr.length;i++)
        {
            if(arr[i] instanceof Regular)
            {
                sum += ((Regular) arr[i]).getHowManyPassengers() - 1;
            }
        }
        return sum;
    }

    public int mostCharge(Vehicles[] arr)
    {
        double maxTime = 0;
        int id = 0;
        for(int i = 0;i<arr.length;i++)
        {
            if(arr[i] instanceof Cart)
            {
                if(((Cart) arr[i]).getChargeTime() > maxTime) {
                    maxTime = ((Cart) arr[i]).getChargeTime();
                    id = arr[i].getCarId();
                }
            }
        }
        return id;
    }

    public static void main(String[] args) {
        System.out.println("Hello world!");

    }
}
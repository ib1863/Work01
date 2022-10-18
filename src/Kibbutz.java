import java.util.ArrayList;
import java.util.List;

public class Kibbutz {
    int moneCars;
    Vehicles[] mehoniot = new Vehicles[500];

    public Kibbutz() {
        moneCars = 0;
    }

    public void addCar(Vehicles rehev)
    {
        moneCars++;
        mehoniot[moneCars] = rehev;
    }

    public List tahzirAgeHege(Vehicles[] mehoniot) {
        List<Vehicles> myList = new ArrayList<>();
        for(int i = 0; i<mehoniot.length;i++)
        {
            if(mehoniot[i].getHegeOrKidon() == "Hege" && mehoniot[i].getCarAge() > 15)
            {
                myList.add(mehoniot[i]);
            }

        }
        return myList;
    }

    public int howManyHege(Vehicles[] mehoniot)
    {
        int sum = 0;
        for(int i = 0;i<mehoniot.length;i++)
        {
            if(mehoniot[i] instanceof Regular || mehoniot[i] instanceof Light)
            {
                if(mehoniot[i].getHegeOrKidon() == "Hege")
                {
                    sum++;
                }

            }
        }
        return sum;
    }


}

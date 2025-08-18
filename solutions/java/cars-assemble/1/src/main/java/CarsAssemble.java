public class CarsAssemble {

    public double productionRatePerHour(int speed) {
        double production = 221 * speed;
        if( speed >= 5 && speed <= 8)
        {
            production *= 0.9;
        }
        else if( speed == 9)
        {
            production *= 0.8;
        }
        else if( speed == 10)
        {
            production *= 0.77;
        }
        else
        {
            production *= 1;
        }
        return production;
    }

    public int workingItemsPerMinute(int speed) {
        return (int)productionRatePerHour(speed) / 60;
    }
}

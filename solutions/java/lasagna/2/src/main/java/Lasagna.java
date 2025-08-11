public class Lasagna {
    public static int expectedMinutesInOven()
    {
        return 40;
    }
    public static int remainingMinutesInOven(int x)
    {
        return expectedMinutesInOven() - x;
    }
    public static int preparationTimeInMinutes(int layers)
    {
        return 2 * layers;
    }
    public static int totalTimeInMinutes(int layers,int oven)
    {
        return preparationTimeInMinutes(layers) + oven;
    }
}

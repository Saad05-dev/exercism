public class JedliksToyCar {
    private int distance = 0;
    private int battery = 100;
    public static JedliksToyCar buy() {
        return new JedliksToyCar();
    }

    public String distanceDisplay() {
        return "Driven " + distance + " meters";   
    }

    public String batteryDisplay() {
        return battery != 0  ? "Battery at " + battery + "%" : "Battery empty";
    }

    public void drive() {
        if(battery == 0)
        {
            batteryDisplay();
            return;
        }
        distance += 20;
        if(distance % 20 == 0)
        {
            battery--;
        }
        distanceDisplay();
        batteryDisplay();
    }
}

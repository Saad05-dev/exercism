class NeedForSpeed {
    public int Speed;
    public int battery = 100;
    public int batteryDrain;
    public int distanceDriven = 0;
    NeedForSpeed(int speed, int batteryDrain) {
       this.Speed = speed;
       this.batteryDrain = batteryDrain;
    }

    public boolean batteryDrained() {
        return this.battery < this.batteryDrain;
    }

    public int distanceDriven() {
        return this.distanceDriven;
    }

    public void drive() {
        if(!batteryDrained())
        {
            this.distanceDriven += this.Speed;
            this.battery -= this.batteryDrain; 
        }
    }

    public static NeedForSpeed nitro() {
        return new NeedForSpeed(50,4);
    }
}

class RaceTrack {
    public int distance;
    RaceTrack(int distance) {
        this.distance = distance;
    }

    public boolean canFinishRace(NeedForSpeed car) {
        return this.distance <= (100 / car.batteryDrain) * car.Speed;
    }
}

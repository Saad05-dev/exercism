class Darts {
    int score(double xOfDart, double yOfDart) {
        double outerRadius = Math.pow(10, 2);
        double middleRadius = Math.pow(5, 2);
        double innerRadius = Math.pow(1, 2);
        double coordinates = Math.pow(xOfDart, 2) + Math.pow(yOfDart, 2);
        if(coordinates <= outerRadius && coordinates > middleRadius && coordinates > innerRadius)
        {
            return 1;
        }
        else if(coordinates <= middleRadius && coordinates > innerRadius)
        {
            return 5;
        }
        else if(coordinates <= innerRadius || coordinates == 0)
        {
            return 10;
        }
        else
        {
            return 0;
        }
    }
}

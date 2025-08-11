
class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
        return new int[]{0, 2, 5, 3, 7, 8, 4};
    }

    public int getToday() {
        return birdsPerDay[birdsPerDay.length - 1];
    }

    public void incrementTodaysCount() {
        birdsPerDay[birdsPerDay.length - 1]++;
    }

    public boolean hasDayWithoutBirds() {
        boolean noVisits = false;
        for(int birds : birdsPerDay)
        {
            if(birds == 0)
            {
                noVisits =  true;
                break;
            }
            else 
            {
                noVisits = false;
            }
        }
        return noVisits;
    }

    public int getCountForFirstDays(int numberOfDays) {
        int sum = 0;
        if(numberOfDays > birdsPerDay.length)
        {
            numberOfDays = birdsPerDay.length;
        }
        for(int birds = 0; birds < numberOfDays;birds++)
        {
            sum += birdsPerDay[birds];            
        }
        return sum;
    }

    public int getBusyDays() {
        int count = 0;
        for(int birds : birdsPerDay)
        {
            if(birds >= 5)
            {
                count++;
            }
        }
        return count;
    }
}

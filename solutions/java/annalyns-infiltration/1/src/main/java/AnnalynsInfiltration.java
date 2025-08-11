class AnnalynsInfiltration {
    public static boolean canFastAttack(boolean knightIsAwake) {
        if(knightIsAwake == true)
        {
            return false;
        }
        else if(knightIsAwake == false)
        {
            return true;
        }
        throw new UnsupportedOperationException("Please implement the (static) AnnalynsInfiltration.canFastAttack() method");
    }

    public static boolean canSpy(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake) {
        if(!knightIsAwake && !archerIsAwake && !prisonerIsAwake)
        {
            return false;
        }
        else
        {
            return true;
        }
    }

    public static boolean canSignalPrisoner(boolean archerIsAwake, boolean prisonerIsAwake) {
        if(prisonerIsAwake)
        {
            if(!archerIsAwake)
            {
                return true;
            }
            else
            {
                return false;
            }
        }
        else
        {
            return false;
        }
    }

    public static boolean canFreePrisoner(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake, boolean petDogIsPresent) {
        if(petDogIsPresent)
        {
            if( archerIsAwake )
            {
                return false;
            }
            else
            {
                return true;
            }
        }
        else 
        {
            if(prisonerIsAwake && !knightIsAwake && !archerIsAwake)
            {
                return true;
            }
            else 
            {
                return false;
            }
        }
    }
}

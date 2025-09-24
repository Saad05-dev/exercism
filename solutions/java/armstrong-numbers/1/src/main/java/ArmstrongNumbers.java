class ArmstrongNumbers {

    boolean isArmstrongNumber(int numberToCheck) {

        int ArmstrongNumber = 0;
        int numberOfDigits = 0;
        int number = numberToCheck;
        if (numberToCheck < 0) numberOfDigits = 1;
        while(numberToCheck > 0)
        {
            numberToCheck = numberToCheck / 10;
            numberOfDigits++;
        }
        numberToCheck = number;
        int singleDigit = 0;
        while (numberToCheck > 0) {
            int power = 1;
            singleDigit = numberToCheck % 10;
            numberToCheck = numberToCheck / 10;
            for(int i = 0; i < numberOfDigits;i++)
            {
                power *= singleDigit; 
            }
            ArmstrongNumber += power;
        }
        if(ArmstrongNumber == number)
        {
            return true;
        }
        else 
        {
            return false;
        }

    }

}

class ResistorColorTrio {
    String label(String[] colors) {
        int[] foundDigits = new int[3];
    
            for(int i = 0; i < 3 ; i++)
            {
                switch (colors[i]) {
                    case "black":
                        foundDigits[i] = 0;
                        break;
                    case "brown":
                        foundDigits[i] = 1;
                        break;
                    case "red":
                        foundDigits[i] = 2;
                        break;
                    case "orange":
                        foundDigits[i] = 3;
                        break;
                    case "yellow":
                        foundDigits[i] = 4;
                        break;
                    case "green":
                        foundDigits[i] = 5;
                        break;
                    case "blue":
                        foundDigits[i] = 6;
                        break;
                    case "violet":
                        foundDigits[i] = 7;
                        break;
                    case "grey":
                        foundDigits[i] = 8;
                        break;
                    case "white":
                        foundDigits[i] = 9;
                        break;
                    default:
                        throw new IllegalArgumentException("Invalid color provided: " + colors[i]);
                }
            }
        long finalResistance = (foundDigits[0] * 10 + foundDigits[1]) * (long)Math.pow(10,foundDigits[2]);
        if(finalResistance > 1000 && finalResistance < 1000000)
        {
            return finalResistance / 1000 + " kiloohms";
        }
        if(finalResistance > 1000000 && finalResistance < 1000000000)
        {
            return finalResistance / 1000000 + " megaohms";
        }
        if(finalResistance > 1000000000)
        {
            return finalResistance / 1000000000 + " gigaohms";
        }
        return finalResistance + " ohms";
    }
}

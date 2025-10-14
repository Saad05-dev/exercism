class ResistorColorDuo {
    int value(String[] colors) {

        int[] foundDigits = new int[2];

        for(int i = 0; i < 2 ; i++)
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
        return foundDigits[0] * 10 + foundDigits[1];
    }
}

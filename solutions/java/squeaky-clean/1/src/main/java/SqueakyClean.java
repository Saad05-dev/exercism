class SqueakyClean {
    static String clean(String identifier) {
        StringBuilder result = new StringBuilder();
        boolean check = false;

        for(char c : identifier.toCharArray())
        {
            if(c == ' ')
            {
                result.append("_");
            }
            else if (c == '-') 
            {
                check = true;
            }
            else if (check) 
            {
                result.append(Character.toUpperCase(c));
                check = false;
            }
            else if (c == '3')
            {
                result.append('e');
            }
            else if (c == '4')
            {
                result.append('a');
            }
            else if (c == '0')
            {
                result.append('o');
            }
            else if (c == '1')
            {
                result.append('l');
            }
            else if (c == '7')
            {
                result.append('t');
            }
            else if (!Character.isLetterOrDigit(c) && c != ' ')
            {
                result.append("");
            }
            else 
            {
                result.append(c);
            }
        }
        return result.toString();
    }
}

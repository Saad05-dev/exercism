public class Twofer {
    public String twofer(String name) {
        if(name == null)
        {
            name = "you";
        }
        String dialogue = "One for " + name + ", one for me.";
        return dialogue;
    }
}

public class UndergradStudent extends Student {
    private int hope = 100; //initial hope = 100
    private int pizza = 0; //initial 0

    public UndergradStudent(String f, String l, String u) {
        super(f,l,u);
    }

    public int getHope() {
        return hope;
    }
    public void loseHope(int hopeLoss) {
        if (hopeLoss >= 0) { //hopeLoss cannot be negative
            if (hope - hopeLoss >= 0) //hope cannot go past 0
                hope -= hopeLoss;
            else
                hope = 0; //hopeLoss is greater than remaining hope. force hope to 0
        }
    }
    public int getPizza() {
        return pizza;
    }
    public void eatPizza(int pizzas) {
        if (pizzas >= 0) //can only add pizza
            pizza += pizzas;
    }
}

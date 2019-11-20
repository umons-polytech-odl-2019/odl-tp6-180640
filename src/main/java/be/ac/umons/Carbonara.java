package be.ac.umons;

public class Carbonara extends Pizza {
    public Carbonara () {
        super("Carbonara");
        addIngredient(new Dough());
        addIngredient(new WhiteCream());
        addIngredient(new Cheese());
        addIngredient(new Ham());
    }
}

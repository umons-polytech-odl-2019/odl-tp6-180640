package be.ac.umons;

public class Margherita extends Pizza {
    public Margherita() {
        super("Margherita");
        addIngredient(new Dough());
        addIngredient(new TomatoSauce());
        addIngredient(new Cheese());
    }
}

package be.ac.umons;

public class Prosciutto extends Pizza{
    public Prosciutto() {
        super("Prosciutto");
        addIngredient(new Dough());
        addIngredient(new TomatoSauce());
        addIngredient(new Cheese());
        addIngredient(new Ham());
    }
}

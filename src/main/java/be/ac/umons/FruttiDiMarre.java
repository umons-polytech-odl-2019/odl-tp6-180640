package be.ac.umons;

public class FruttiDiMarre extends Pizza {
    public FruttiDiMarre() {
        super("FruttiDiMare");
        addIngredient(new Dough());
        addIngredient(new TomatoSauce());
        addIngredient(new Cheese());
        addIngredient(new SeaFood());
    }
}

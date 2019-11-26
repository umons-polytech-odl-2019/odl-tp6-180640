package be.ac.umons;

import java.math.BigDecimal;
import java.util.ArrayList;

public class Pizza implements PizzaComponent {
    private String name ;
    private BigDecimal price ;
    private ArrayList<Ingredient>listingredients;
    Pizza(String name) {
        price = new BigDecimal(0.0);
    }
    public String getName(){
        return name;
    }
    public BigDecimal getPrice (){
        for (Ingredient i : listingredients){
            price.add(i.getPrice()) ;
        }
        return price;
    }
    public void setName(String n){
        this.name = n;
    }
    public void setPrice(BigDecimal p){
        this.price = p;
    }
    public ArrayList<Ingredient>getListIngredient(){
        return listingredients;
    }
    public void addIngredient(Ingredient i){
        listingredients.add(i);
    }
    public String toString(){
        return (String.valueOf(this.price)+name);
    }
}

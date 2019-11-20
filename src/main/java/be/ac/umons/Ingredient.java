package be.ac.umons;

import java.math.BigDecimal;

public class Ingredient implements PizzaComponent{
    private String name;
    private BigDecimal price;
    /*private ObserverCollection;*/
    public Ingredient() {
    }

    public Ingredient(String name, BigDecimal price) {
        this.name = name;
        this.price = price ;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String toString(){
        return (String.valueOf(this.price)+name);
    }/*
    public void registerObserver(Observer o){}
    public void unregisterObserver(Observer o){}
    public void notifyObserver(Observer o){}*/
}

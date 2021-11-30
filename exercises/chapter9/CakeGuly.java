package exercises.chapter9;

//The first one is going to be a superclass called CakeGuly and it will have two fields, flavor and price.
// Go ahead and make getter and setter methods for both of these fields.
//
// Next create a BirthdayCake class which will inherit from the CakeGuly class and it has a field of its own called candles.
// Go ahead and include the getter and setter method for candles.
//
//And then create a third class called WeddingCake which also inherits from CakeGuly
// and has a field called tiers and you'll include a getter and setter method for this.
//
//And then finally, a class called TasteTester which will test out your inheritance.

public class CakeGuly {

    protected String flavor;
    protected double price;

    public CakeGuly(String flavor){
        setFlavor(flavor);
        setPrice(9.99);
    }


    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }




}

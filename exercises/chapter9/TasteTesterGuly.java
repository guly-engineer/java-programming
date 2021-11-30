package exercises.chapter9;

public class TasteTesterGuly {

    public static void main(String[] args) {
        CakeGuly cake=new CakeGuly("strawberry");
       // cake.setFlavor("strawberry");
        cake.setPrice(10);
        System.out.println("This cake's price is "+cake.getPrice()+" and it has a "+cake.getFlavor()+" flavor.");

        BirthdayCakeGuly birthdaycake=new BirthdayCakeGuly("banana");
        birthdaycake.setCandles(40);
        birthdaycake.setPrice(1);
        System.out.println("This birthday cake has "+birthdaycake.getCandles()+" candles. It is "+birthdaycake.getPrice()+" pounds and has a "+birthdaycake.getFlavor()+" flavor.");

        WeddingCakeGuly weddingcake=new WeddingCakeGuly();
        //weddingcake.setFlavor("pineapple");
        System.out.println("Wedding cake flavor: " + weddingcake.getFlavor());
        System.out.println("Wedding cake price: " + weddingcake.getPrice());
    }


}

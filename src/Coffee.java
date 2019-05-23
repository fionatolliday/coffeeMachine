 public class Coffee {

    CoffeeMaker coffeeMaker;


     private String type;

     public int getWater() {
         return water;
     }

     public void setWater(int water) {
         this.water = water;
     }

     public int getCoffeePowder() {
         return coffeePowder;
     }

     public void setCoffeePowder(int coffeePowder) {
         this.coffeePowder = coffeePowder;
     }

     public int getMilk() {
         return milk;
     }

     public void setMilk(int milk) {
         this.milk = milk;
     }

     private int water;
     private int coffeePowder;
     private int milk;



     public String getType() {
             return type;
     }

     public void setType(String type) {
         this.type = type;
     }


     public Coffee() {
         this.type = type;
         this.water = water;
         this.milk = milk;
         this.coffeePowder = coffeePowder;
     }


 }

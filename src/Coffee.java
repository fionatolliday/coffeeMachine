 public class Coffee {

     public String type;
     public int water;
     public int coffeePowder;
     public int milk;

     private boolean isConsumed = false;

     public Coffee(String type, int water, int coffeePowder, int milk) {
         this.type = type;
         this.water = water;
         this.milk = milk;
         this.coffeePowder = coffeePowder;
     }

     public void consume() {
         if (isConsumed) {
             throw new RuntimeException("I've already been consumed");
         } else {
             isConsumed = true;
         }
     }
 }
 public class MilkDispenser {
     private int milk = 100;

     public int getMilk(int amount) {
         if (milk - amount < 0) throw new IllegalArgumentException("Insufficient milk levels");

         milk -= amount;
         return amount;
     }


     public void setMilk(int milk) {
         this.milk = milk;
     }

     public int getMilkLevel() {
         return milk;
     }
 }

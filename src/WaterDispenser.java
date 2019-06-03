 public class WaterDispenser {
        private int water = 200;

        public int getWater(int amount) {
            if (water - amount < 0) throw new IllegalArgumentException("Insufficient water levels");

            water -= amount;
            return amount;
        }


     public void setWater(int water) {
         this.water = water;
     }

     public int getWaterLevel() {
         return water;
     }
}




//
//     The Coffee Maker
//
//         Design your own class for a Coffee Maker.
//
//         - The Coffee Maker has three components. The WaterDispenser, CoffeePowderDispenser, and MilkDispenser
//         - The Coffee Maker knows how to dispense three types of coffee: black coffee, flat white, and latte
//         - Recipe for black coffee: 40 ml water, 15g coffee powder, and 0ml milk
//         - Recipe for flat white: 30ml water, 8g coffee powder, and 10ml milk
//         - Recipe for latte: 20ml water, 8g coffee powder, and 20ml milk
//
//
//         For this exercise, use the classes found below and focus on making the CoffeeMaker class.
//
//         Requirements:
        // - have only one public method Coffee makeCoffee(String type) and no public variables

//         - get all the ingredients for the coffee from the other components
//
//         - if the coffee maker receives a coffee type that it doesn't know how to create, return null
//         - if the other components do not have enough ingredients, return null
//
//         - feel free to have as many constructors as you'd like
//
//
// public class WaterDispenser {
//     private int water = 200;
//
//     public int getWater(int amount) {
//         if (water - amount > 0) throw new IllegalArgumentException("Insufficient water levels");
//
//         water -= amount;
//         return amount;
//     }
// }
//
// public class CoffeePowderDispenser {
//     private int coffeePowder = 50;
//
//     public int getCoffeePowder(int amount) {
//         if (coffeePowder - amount > 0) throw new IllegalArgumentException("Insufficient coffee powder levels");
//
//         coffeePowder -= amount;
//         return amount;
//     }
// }
//
// public class MilkDispenser {
//     private int milk = 100;
//
//     public int getMilk(int amount) {
//         if (milk - amount > 0) throw new IllegalArgumentException("Insufficient milk levels");
//
//         milk -= amount;
//         return amount;
//     }
// }
//
// public class Coffee {
//     public String type;
//     public int water;
//     public int coffeePowder;
//     public int milk;
//
//     public Coffee(String type, int water, int coffeePowder, int milk) {
//         this.type = type;
//         this.water = water;
//         this.milk = milk;
//     }
// }
//

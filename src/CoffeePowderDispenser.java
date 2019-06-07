public class CoffeePowderDispenser {
    private int coffeePowder = 50;

    public int getCoffeePowder(int amount) {
        if (coffeePowder - amount < 0) throw new IllegalArgumentException("Insufficient coffee " +
                "powder levels");

        coffeePowder -= amount;
        return amount;
    }

    public void setCoffeePowder(int coffeePowder) {
        this.coffeePowder = coffeePowder;
    }

    public int getCoffeePowderLevel() {
        return coffeePowder;
    }
}

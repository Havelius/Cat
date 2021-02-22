
public class Cat
{
    private double originWeight;
    private double weight;

    private double minWeight;
    private double maxWeight;
    private double amountFeed;
    private double amountDrink;
    private static int count;

    public Cat()
    {
        weight = 1500.0 + 3000.0 * Math.random();
        originWeight = weight;
        minWeight = 1000.0;
        maxWeight = 9000.0;
        amountFeed = 0;
        amountDrink = 0;
        count++;

    }
    
    public static int getCount() {
        return count;
    }
    
    public void meow(double amount)
    {
        weight = weight - amount;
        System.out.println("Meow");
        if (isAlive()) { this.weight += amount;
            this.amountDrink += amount;
            if (!isAlive()) { count--;
            }
        }
    }

    public void feed(double amount)
    {
        amountFeed = amountFeed + amount;
        if (isAlive()) { this.weight += amount;
            this.amountDrink += amount;
            if (!isAlive()) { count--;
            }
        }
    }

    public void drink(double amount)
    {
        amountDrink = amountDrink + amount;
        if (isAlive()) { this.weight += amount;
            this.amountDrink += amount;
            if (!isAlive()) { count--;
            }
        }
    }

    private void setWeight(Double weight) {
        if (isAlive()) {
            this.weight = weight;
            if (isAlive()) {
                count--;
            }
        }
    }
    
     private void addWeight(Double weight) {
        setWeight(getWeight() + weight);
    }
    
    public double getWeight()
    {
        return weight;
    }

    public String getStatus()
    {
        if(weight < minWeight) {
            return "Dead";
        }
        else if(weight > maxWeight) {
            return "Exploded";
        }
        else if(weight > originWeight) {
            return "Sleeping";
        }
        else {
            return "Playing";
        }
    }

    public void pee()
    {
        weight = weight - 100;
        System.out.println("Cat has pee");
    }

    public double getFeed()
    {
        return amountFeed;
    }

    public double getDrink()
    {
        return amountDrink;
    }
    
    public boolean isAlive() {
        return (weight > minWeight && weight < maxWeight);
    }
}

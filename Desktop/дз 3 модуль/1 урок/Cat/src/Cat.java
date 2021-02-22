
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
        if (isAlive()) {
            addWeight(amount);
        }
        while (weight >= minWeight)
        {
            weight = weight - amount;
            System.out.println("Meow");
            if (weight < minWeight) {
                getStatus();
            }
        }
    }

    public void feed(double amount)
    {
        if (isAlive()) {
            addWeight(amount);
        }
        amountFeed = amountFeed + amount;
        while (weight <= maxWeight)
        {
            weight = weight + amount;
            if (weight > maxWeight) {
                getStatus();
            }
        }
    }

    public void drink(double amount)
    {
        if (isAlive()) {
            addWeight(amount);
        }
        amountDrink = amountDrink + amount;
        while (weight <= maxWeight)
        {
            weight = weight + amount;
            if (weight > maxWeight) {
                getStatus();
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

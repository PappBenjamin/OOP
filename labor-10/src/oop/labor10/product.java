package oop.labor10;

public class product implements Comparable<product> {
    private int identifier;
    private String name;
    private int amount;
    private int price;

    public product(int identifier, String name, int amount, int price) {
        this.identifier = identifier;
        this.name = name;
        this.amount = amount;
        this.price = price;
    }

    public int getIdentifier() {
        return identifier;
    }

    public String getName() {
        return name;
    }

    public int getAmount() {
        return amount;
    }

    public int getPrice() {
        return price;
    }

    public void increaseAmount(int amount)
    {
        this.amount += amount;
    }

    @Override
    public String toString() {
        return "product { " +
                " identifier = " + identifier +
                ", name = " + name  +
                ", amount = " + amount +
                ", price = " + price +
                " }";
    }

    @Override
    public int compareTo(product o)
    {
        return Integer.compare(this.identifier,o.identifier); // return this.id - o.id
    }
}

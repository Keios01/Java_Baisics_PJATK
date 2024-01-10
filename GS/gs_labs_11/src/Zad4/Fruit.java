package Zad4;

public class Fruit {
    private String name;
    private double weight;

    Fruit(String name)
    {
        this.name = name;
        this.weight = Math.random() % 0.3 + 0.5;
    }

    public void show()
    {
        System.out.println(this.name + " " + this.weight);
    }
}

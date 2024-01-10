package Zad5;

public class Balloon {
  private double helium;
  Balloon() {
    this.helium = Math.random() % 0.004 + 0.005;
  }

  public double getLoad() {
    return this.helium / 0.007 * 0.006;
  }
}

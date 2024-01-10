package Zad5;

public class Main {
  public static void main(String[] args) {
    Balloon balloon = new Balloon();
    Donkey donkey = new Donkey();

    for(int i = 0; i < 66650; i++) {
      donkey.addBalloon(new Balloon());
    }

    System.out.println(donkey.isFlying()?"Ja latam!!!":"");
  }
}

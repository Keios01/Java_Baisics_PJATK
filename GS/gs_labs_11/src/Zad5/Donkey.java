package Zad5;

public class Donkey {
  private double mass = 400;
  private Balloon[] tablica = new Balloon[1];
  private Balloon[] tempArray;
  private int arrayLastOccupied = 0;

  public void addBalloon(Balloon baloon) {
    if(arrayLastOccupied == tablica.length) {
      tempArray = tablica;
      tablica = new Balloon[tablica.length + 10];
      for (int i = 0; i < tempArray.length; i++) {
        tablica[i] = tempArray[i];
      }
    }
    tablica[arrayLastOccupied++] = baloon;
  }

  private double sumaMaksCiezaru = 0;
  public boolean isFlying() {
    for (int i = 0; i < arrayLastOccupied; i++) {
      sumaMaksCiezaru += tablica[i].getLoad();
    }

    return sumaMaksCiezaru > mass;
  }
}

package Les43hw1_House;

public class ApartmentHouse extends House {

  public int entrance;

  public ApartmentHouse(String address, int entrance) {
    super(address);
    this.entrance = entrance;
  }

  public int getEntrance() {
    return entrance;
  }

  public void setEntrance(int entrance) {
    this.entrance = entrance;
  }

  @Override
  public String toString() {
    return ("Многоквартирный дом расположен по адресу: " + address + " и в нем " + entrance +
        " квартир.\n");
  }

  @Override
  public void destroy() {
    System.out.println("You have destroyed Apartmenthouse with " + entrance + " apartaments.");
  }
}

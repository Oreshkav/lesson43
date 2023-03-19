package Les43hw1_House;

public class ApartmentHouse extends House {

  public int entrance;

  public ApartmentHouse(String address) {
    super(address);
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
}

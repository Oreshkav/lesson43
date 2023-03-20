package Les43hw1_House;

public class PrivatHouse extends House {

  public PrivatHouse(String address) {
    super(address);
  }

  @Override
  public String toString() {
    return String.format("Частный дом расположен по адресу: %s.", address);
  }
}

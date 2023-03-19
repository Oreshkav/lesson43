package Les43hw1_House;

public class PrivatHouse extends House {

  public PrivatHouse(String address) {
    super(address);
  }

  @Override
  public void setEntrance(int entrance) {
    super.setEntrance(entrance);
  }

  @Override
  public String toString() {
    return  String.format("Частный дом расположен по адресу: %s и в нем %d квартир.", address,
        entrance);
      }
}

package Les43hw1_House;

public class House {
  public String address;

  public House(String address) {
    this.address = address;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  @Override
  public String toString() {
    return "Дом расположен по адресу: " + address;
  }

}

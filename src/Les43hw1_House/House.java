package Les43hw1_House;

public class House {
  public String address;

  public int entrance;

  public House(String address) {
    this.address = address;
//    this.entrance = 0;
   }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address){
    this.address = address;
  }

  public void setEntrance(int entrance) {
    this.entrance = entrance;
  }

  @Override
  public String toString() {
    return "Дом расположен по адресу: " + address;
  }

}

package Les43hw1_House;

public class Main {

  //Создайте абстрактный класс "Дом". В качестве аргумента конструктора принимайте адрес.
  //Напишите для адреса сеттер и геттер.
  //Создайте классы "Частный дом" и "Многоквартирный дом" - наследники класса "Дом".

  //При создании многоквартирного дома дополнительно принимайте в конструкторе целое
  // число - количество подъездов.

  //В методе toString() выводите в удобном виде всю известную информацию о доме.

  //В основном файле программы создайте список домов, в который поместите два частных
  // дома и один многоквартирный.

  //Выведите информацию о домах в списке с использованием цикла for-each.
  public static void main(String[] args) {

    House houseSting = new PrivatHouse("Sting street, 47");
    House houseMadonna = new PrivatHouse("Avenu Madonna, 15");
    House anthill = new ApartmentHouse("Муравейник, 21");
    System.out.println(houseSting + "\n" + houseMadonna + "\n" + anthill );

    anthill.setEntrance(7);
    System.out.println(anthill);
  }
}
package Les43hw1_House;

import java.util.ArrayList;
import java.util.List;

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

    List<House> houses = new ArrayList<>();
    houses.add(new PrivatHouse("Sting street, 47"));
    houses.add(new PrivatHouse("Avenu Madonna, 15"));
    houses.add(new ApartmentHouse("Муравейник, 21", 11));

    for (House i : houses) {
    System.out.println(i);
    }
  }
}
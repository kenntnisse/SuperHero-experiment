// Shunzo Hida
// Super Hero Bake Sale
// 09-29-2023
// Period 5

/**
* This project needs to be a bake sale in which
* super heros use their super powers to bake cakes
* to raise money for the PTA.
*
* It must include custom types for the following:
* - SuperHero
* - Cake
* - Store
* - Customer
*
* In your Main class, you must create:
* - at least 2 hero instances
* - at least 2 customer instances
* - at least 1 store instance
* - at least 3 cake instances
*
* Both customers must buy a Cake at a store 
*   so the store can raise money for the PTA.
* Neither customer can spend 
*   more money than they have.
* The hero must get better at making cakes 
*   with each cake they make
* Better cakes are made by better cake makers 
*   and sell for more money than worse cakes
*
* You may use the Turtle object or not
* You may create a PTA type or not
* The store must raise 1 MILLION DOLLARS!
* You should use a "FOR" loop
* You may use Arrays
*/
import java.util.Random;

class Main {
  static Random rand = new Random();
  static final int seed = rand.nextInt(20)+1;
  public static void main(String[] args) {
    
    System.out.println("Hello world!");
    
    SuperHero[] supes = new SuperHero[seed];
    for (int i = 0; i < seed; i++){
      supes[i] = new SuperHero("s"+(i+1), i+1);
    }

    Store s = new Store("PTA", seed);

    Customer[] customers = new Customer[seed];
    for (int i = 0; i < seed; i++){
      customers[i] = new Customer("c"+(i+1), (i+1)*100);
    }

    for (int i = 0; i < 1000; i++){
      System.out.println("Day " + i);
      passDay(supes, s, customers);
    }
    
  }
  public static void transaction(Customer c, Store s, int index){
    if (index == -1){
      System.out.println(c.name + " could not buy a cake.");
      return;
    }
    c.buyCake(s, index);
    s.sellCake(index);
  }
  
  public static void passDay(SuperHero[] supes, Store s, Customer[] customers){
    
    for (int i = 0; i < supes.length; i++){
      supes[i].createCake(s);
    }
    //for (Cake c: s.displayCakes()){
    //  System.out.println(c.appraise());
    //}
    for (int i = 0; i < customers.length; i++){
      customers[i].getMoney(customers[i].appraise());
      transaction(customers[i], s, customers[i].findCake(s));
    }
    s.displayStats();
    System.out.println();
  }
  
}
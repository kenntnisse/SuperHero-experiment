// Shunzo Hida
// Super Hero Bake Sale
// 09-29-2023
// Period 5


/*
 * Description:
 * SuperHeroes are bakers
 * when they bake a Cake, their level increases by one
 * a Cake's cost is higher if their level is higher
 
 */


public class SuperHero{
  /////////////////////
  // Properties
  /////////////////////
  String name;
  int level;


  ////////////////////
  // Constructor
  ////////////////////
  public SuperHero(String name, int level){
    this.name = name;
    this.level = level;
    System.out.println("The level " + level + " SuperHero " + name + " has appeared.");
  }

  ////////////////////
  // Methods
  ////////////////////

  public void createCake(Store s){
    int cost = this.level*10;
    Cake c = new Cake(cost);
    System.out.println(this.name + " baked a cake worth $" + cost + " and gave it to store " + s.name);
    s.getCake(c);
    this.level += 1;
  }
}
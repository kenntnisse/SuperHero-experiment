// Shunzo Hida
// Super Hero Bake Sale
// 09-29-2023
// Period 5


/*
 * Description:
 * A cake baked by a SuperHero
 * It has a cost, and is held by a Store
 
 */


public class Cake{
  /////////////////////
  // Properties
  /////////////////////
  int cost=0;


  ////////////////////
  // Constructor
  ////////////////////
  public Cake(){};
  public Cake(int cost){
    this.cost = cost;
    System.out.println("A $"+cost+" cake has been baked!");
  }

  ////////////////////
  // Methods
  ////////////////////
  public void remove(){
    //System.out.println("A $"+this.cost+" cake has been removed!");
    this.cost = 0;
  }
  public int appraise(){
    return this.cost;
  }
}
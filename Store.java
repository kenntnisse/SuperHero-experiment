// Shunzo Hida
// Super Hero Bake Sale
// 09-29-2023
// Period 5


/*
 * Description:
 * A store that can sell Cakes
 * Keeps track of profit and what Cakes it has
 
 */

public class Store{
  /////////////////////
  // Properties
  /////////////////////
  String name;
  int profit=0;
  Cake[] cakes;
  int numCakes=0;
  int capacity;


  ////////////////////
  // Constructor
  ////////////////////
  public Store(String name, int capacity){
    this.name = name;
    System.out.println("The " + capacity + "-cake store " + name + " has appeared.");
    this.cakes = new Cake[capacity];
    for (int i = 0; i < capacity; i++){
      this.cakes[i] = new Cake();
    }
    this.capacity = capacity;
  }

  ////////////////////
  // Methods
  ////////////////////
  public Cake[] displayCakes(){
    return this.cakes;
  }

  public Cake displayCake(int index){
    return this.cakes[index];
  }
  
  public void sellCake(int index){
    System.out.println("The store " + this.name + " has sold a $"+this.cakes[index].appraise() + " cake.");
    this.profit+=this.cakes[index].appraise();
    this.cakes[index].remove();
    this.numCakes -= 1;
  }

  public void getCake(Cake c){
    if (numCakes == capacity){
      System.out.println("The store " + name + " already has "+ capacity+" cakes.");
      return;
    }
    System.out.println(this.name + " has gained a $"+c.appraise() + " cake.");
    for (int i = 0; i < capacity; i++){
      if (this.cakes[i].appraise() == 0){
        this.cakes[i] = c;
        break;
      }
    }
    this.numCakes+=1;
  }

  public void displayStats(){
    System.out.println(this.name + " has $" + this.profit + " and " + this.numCakes + " cakes.");
  }
}
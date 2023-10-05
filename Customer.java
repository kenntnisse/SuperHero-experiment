// Shunzo Hida
// Super Hero Bake Sale
// 09-29-2023
// Period 5


/*
 * Description:
 * A customer that can buy Cakes from Stores
 * They have a budget, and cannot go over.
 
 */


public class Customer{
  /////////////////////
  // Properties
  /////////////////////
  String name;
  int budget;
  int cakesBought = 0;
  //Cake cake;
  Store location;
  Store home;

  ////////////////////
  // Constructor
  ////////////////////
  public Customer(String name, int budget){
    this.name = name;
    this.budget = budget;
    System.out.println("Customer " + name + " with budget $"+budget + " has appeared.");
  }

  ////////////////////
  // Methods
  ////////////////////
  public int findCake(Store s){
    int chosen = 0;
    Cake[] cakes = s.displayCakes();
    for (int i = 0; i < cakes.length; i++){
      if (cakes[chosen].appraise() < cakes[i].appraise() && cakes[i].appraise() <= this.budget) chosen = i;
    }
    if (cakes[chosen].appraise() == 0) return -1;
    return chosen;
  }
  
  public void buyCake(Store s, int index){
    this.budget -= s.displayCake(index).appraise();
    this.cakesBought += 1;
  }

  public void getMoney(int m){
    int gained = Math.min(this.budget + m+100, 1000000000) - this.budget;
    System.out.println(this.name + " gained $" + gained);
    this.budget += gained;
  }

  public void displayStats(){
    System.out.println(this.name + " has $" + this.budget + " and " + this.cakesBought + " cake(s).");
  }

  public int appraise(){
    return this.budget;
  }

  public void goTo(Store s){
    this.location = s;
  }

  public void goHome(){
    this.location = this.home; 
  }
}
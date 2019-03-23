package model;

public class HRoom{

  //Attributes

  private double parcialPrice;
  private double totalPrice;
  private boolean space;
  private int id;

  //Relations

  private Animal animals;

  //Methods

  public HRoom(double parcialPrice, double totalPrice, boolean space, int id, Animal animals){

    this.parcialPrice = parcialPrice;
    this.totalPrice = totalPrice;
    this.space = space;
    this.id = id;
    this.animals = animals;
  }

  //parcialPrice

  public double getParcialPrice(){
    return parcialPrice;
  }
  public void setParcialPrice(double parcialPrice){
    this.parcialPrice = parcialPrice;
  }

  //totalPrice

  public double getTotalPrice(){
    return totalPrice;
  }
  public void setTotalPrice(double totalPrice){
    this.totalPrice = totalPrice;
  }

  //space

  public boolean getSpace(){
    return space;
  }
  public void setSpace(boolean space){
    this.space = space;
  }

  //id

  public int getId(){
    return id;
  }
  public void setId(int id){
    this.id = id;
  }

  //animals

  public Animal getAnimals(){
    return animals;
  }
  public void setAnimals(Animal animals){
    this.animals = animals;
  }
}

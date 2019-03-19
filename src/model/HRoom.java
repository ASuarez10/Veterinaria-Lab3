package model;

public class HRoom{

  //Attributes

  private double parcialPrice;
  private double totalPrice;
  private int days;
  private boolean space;
  private int id;

  //Relations

  private Animal animals;

  //Methods

  public HRoom(double parcialPrice, double totalPrice, int days, boolean space, int id, Animal animals){

    this.parcialPrice = parcialPrice;
    this.totalPrice = totalPrice;
    this.days = days;
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

  //days

  public int getDays(){
    return days;
  }
  public void setDays(int days){
    this.days = days;
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
  public void setId(int){
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

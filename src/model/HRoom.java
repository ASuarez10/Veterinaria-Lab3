package model;

public class HRoom{

  //Attributes

  private boolean space;
  private int id;

  //Relations

  private Animal animals;

  //Methods

  public HRoom(boolean space, int id, Animal animals){

    this.space = space;
    this.id = id;
    this.animals = animals;
  }

  //space

  public boolean getSpace(){
    return space;
  }
  public void setSpace(boolean space){
    this.space = space;
  }

  //id

  public int getID(){
    return id;
  }
  public void setID(int id){
    this.id = id;
  }

  //animals

  public Animal getAnimals(){
    return animals;
  }
  public void setAnimals(Animal animals){
    this.animals = animals;
  }

  //hospitalizationCost

  public double hospitalizationCost(String typeA, double weightA, int aDay, int aMonth, int aYear){

    double cost = animals.hospitalizationCost(typeA, weightA, aDay, aMonth, aYear);

    return cost;
  }
}

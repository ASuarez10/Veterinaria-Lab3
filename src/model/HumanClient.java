package model;

public class HumanClient{

  //Attributes

  private String name;
  private int identification;
  private int phoneN;
  private String adress;

  //Relations

  private Animal pet;

  //Methods

  public HumanClient(String name, int identification, int phoneN, String adress, Animal pet){

    this.name = name;
    this.identification = identification;
    this.phoneN = phoneN;
    this.adress = adress;
    this.pet = pet;
  }

  //name

  public String getName(){
    return name;
  }
  public void setName(String name){
    this.name = name;
  }

  //identification

  public int getIdentification(){
    return identification;
  }
  public void setIdentification(int identification){
    this.identification = identification;
  }

  //phoneN

  public int getPhoneN(){
    return phoneN;
  }
  public void setPhoneN(int phoneN){
    this.phoneN = phoneN;
  }

  //adress

  public String getAdress(){
    return adress;
  }
  public void setAdress(String adress){
    this.adress = adress;
  }

  //pet

  public Animal getPet(){
    return pet;
  }
  public void setPet(Animal pet){
    this.pet = pet;
  }
}

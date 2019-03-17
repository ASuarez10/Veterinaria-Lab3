package model;

public class Animal{

  //Attributes

  private String name;
  private double weight;
  private char type;

  //Relations

  private ClinicHistory cH;

  //Methods

  public Animal(String name, double weight, char type, ClinicHistory cH){

    this.name = name;
    this.weight = weight;
    this.type = type;
    this.cH = cH;
  }

  //name

  public String getName(){
    return name;
  }
  public void setName(String name){
    this.name = name;
  }

  //weight

  public double getWeight(){
    return weight;
  }
  public void setWeight(double weight){
    this.weight = weight;
  }

  //type

  public char getType(){
    return type;
  }
  public void setType(char type){
    this.type = type;
  }

  //cH

  public ClinicHistory getCH(){
    return cH;
  }
  public void setCH(ClinicHistory cH){
    this.cH = cH;
  }
}

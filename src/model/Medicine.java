package model;

public class Medicine{

  //Attributes

  private String name;
  private double dose;
  private double dosePrice;
  private char frequency;

  //Methods

  public Medicine(String name, double dose, double dosePrice, char frequency){

    this.name = name;
    this.dose = dose;
    this.dosePrice = dosePrice;
    this.frequency = frequency;
  }

  //name

  public String getName(){
    return name;
  }
  public void setName(String name){
    this.name = name;
  }

  //dose

  public double getDose(){
    return dose;
  }
  public void setDose(double dose){
    this.dose = dose;
  }

  //dosePrice

  public double getDosePrice(){
    return dosePrice;
  }
  public void setDosePrice(double dosePrice){
    this.dosePrice = dosePrice;
  }

  //frequency

  public char getFrequency(){
    return frequency;
  }
  public void setFrequency(char frequency){
    this.frequency = frequency;
  }
}

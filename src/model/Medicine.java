package model;

public class Medicine{

  //Attributes

  private String name;
  private double dose;
  private double dosePrice;
  private int frequencyForDay;

  //Methods

  public Medicine(String name, double dose, double dosePrice, int frequencyForDay){

    this.name = name;
    this.dose = dose;
    this.dosePrice = dosePrice;
    this.frequencyForDay = frequencyForDay;
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

  //frequencyForDay

  public int getFrequencyForDay(){
    return frequencyForDay;
  }
  public void setFrequencyForDay(int frequencyForDay){
    this.frequencyForDay = frequencyForDay;
  }
}

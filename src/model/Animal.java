package model;

public class Animal{

  //Constantes

  public static final String GATO = "Gato";
  public static final String PERRO = "Perro";
  public static final String AVE = "Ave";
  public static final String OTRO = "Otro";

  //Attributes

  private String name;
  private double weight;
  private String type;
  private int age;
  private String breed;

  //Relations

  private ClinicHistory cH;

  //Methods

  public Animal(String name, double weight, String type, int age, String breed, ClinicHistory cH){

    this.name = name;
    this.weight = weight;
    this.type = type;
    this.age = age;
    this.breed = breed;
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

  public String getType(){
    return type;
  }
  public void setType(String type){
    this.type = type;
  }

  //age

  public int getAge(){
    return age;
  }
  public void setAge(int age){
    this.age = age;
  }

  //breed

  public String getBreed(){
    return breed;
  }
  public void setBreed(String breed){
    this.breed = breed;
  }

  //cH

  public ClinicHistory getCH(){
    return cH;
  }
  public void setCH(ClinicHistory cH){
    this.cH = cH;
  }

  //hospitalizationCost

  public double hospitalizationCost(String typeA, double weightA, int aDay, int aMonth, int aYear){
    double cost = cH.costOfMedicamentsAplicated();

    if(type.equals(GATO)){
      if(weight >= 1.0 && weight <= 3.0){
        cost += cH.daysInHospitalization(aDay, aMonth, aYear) * 10000.0;
      }
      else if(weight >= 3.1 && weight <= 10.0){
        cost += cH.daysInHospitalization(aDay, aMonth, aYear) * 12000.0;
      }
      else if(weight >= 10.1 && weight <= 20.0){
        cost += cH.daysInHospitalization(aDay, aMonth, aYear) * 15000.0;
      }
      else if(weight > 20.0){
        cost += cH.daysInHospitalization(aDay, aMonth, aYear) * 20000.0;
      }
    }

    else if(type.equals(PERRO)){
      if(weight >= 1.0 && weight <= 3.0){
        cost += cH.daysInHospitalization(aDay, aMonth, aYear) * 15000.0;
      }
      else if(weight >= 3.1 && weight <= 10.0){
        cost += cH.daysInHospitalization(aDay, aMonth, aYear) * 17000.0;
      }
      else if(weight >= 10.1 && weight <= 20.0){
        cost += cH.daysInHospitalization(aDay, aMonth, aYear) * 20000.0;
      }
      else if(weight > 20.0){
        cost += cH.daysInHospitalization(aDay, aMonth, aYear) * 25000.0;
      }
    }

    else if(type.equals(AVE)){
      if(weight >= 1.0 && weight <= 3.0){
        cost += cH.daysInHospitalization(aDay, aMonth, aYear) * 10000.0;
      }
      else if(weight >= 3.1 && weight <= 10.0){
        cost += cH.daysInHospitalization(aDay, aMonth, aYear) * 12000.0;
      }
      else if(weight >= 10.1 && weight <= 20.0){
        cost += cH.daysInHospitalization(aDay, aMonth, aYear) * 20000.0;
      }
      else if(weight > 20.0){
        cost += cH.daysInHospitalization(aDay, aMonth, aYear) * 25000.0;
      }
    }

    else if(type.equals(OTRO)){
      if(weight >= 1.0 && weight <= 3.0){
        cost += cH.daysInHospitalization(aDay, aMonth, aYear) * 10000.0;
      }
      else if(weight >= 3.1 && weight <= 10.0){
        cost += cH.daysInHospitalization(aDay, aMonth, aYear) * 17000.0;
      }
      else if(weight >= 10.1 && weight <= 20.0){
        cost += cH.daysInHospitalization(aDay, aMonth, aYear) * 30000.0;
      }
      else if(weight > 20.0){
        cost += cH.daysInHospitalization(aDay, aMonth, aYear) * 33000.0;
      }
    }

      return cost;
  }
}

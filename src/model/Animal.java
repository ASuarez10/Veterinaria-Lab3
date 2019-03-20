package model;

public class Animal{

  //Constantes

  public static final char GATO = 'A';
  public static final char PERRO = 'B';
  public static final char AVE = 'C';
  public static final char OTRO = 'D';

  //Attributes

  private String name;
  private double weight;
  private char type;
  private int age;
  private String breed;

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
}

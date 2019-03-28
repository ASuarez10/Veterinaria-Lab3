package model;
import java.util.ArrayList;

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
  private HRoom room;
  private ArrayList<ClinicalHistory> clientH;

  //Methods

  public Animal(String name, double weight, String type, int age, String breed, ClinicHistory cH){

    this.name = name;
    this.weight = weight;
    this.type = type;
    this.age = age;
    this.breed = breed;
    this.cH = cH;
    clientH = new ArrayList<ClinicalHistory>();
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

  public int getRoomNumber(){
		return room.getNumber();
	}
  public HRoom getRoom(){
		return room;
	}
	public void setRoom(HRoom room){
		this.room = room;


  //infoPet

  public String infoPet(){
  String msj = "";
  msj += "El name es:" + name + "\n";
  msj += "Su edad es:" + age + "\n";
  msj += "Mi peso es:" + weight + "\n";
  msj +="Mi tipo es:" + type + "\n";

    return msj;

 }

  //addMedRec

  public void addMedRec(ClinicHistory newMedRec, Medicine medic){

  	newMedRec.setPetInfo(showInfoPet());
  	clientH.add(newMedRec);

  	clientH.get((clientH.size()-1)).addmedicine1(medic);

  }
}

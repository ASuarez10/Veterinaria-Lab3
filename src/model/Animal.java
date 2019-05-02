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
  private double height;
  private double weight;
  private String type;
  private int age;
  private String breed;

  //Relations

  private ClinicHistory cH;
  private HRoom room;
  private ArrayList<ClinicHistory> clientH;

  //Methods

  public Animal(String name, double height, double weight, String type, int age, String breed, ClinicHistory cH){

    this.name = name;
    this.height = height;
    this.weight = weight;
    this.type = type;
    this.age = age;
    this.breed = breed;
    this.cH = cH;
    clientH = new ArrayList<ClinicHistory>();
  }

  //name

  /**
	* Description This method allows to get the symptom of the pet. <br>
	* <b>post:</b> The name of the medicine of a date is given.
	* @return The name of the medicine.
	*/

  public String getName(){
    return name;
  }
  public void setName(String name){
    this.name = name;
  }

  //weight

  /**
	* Description This method allows to get the symptom of the pet. <br>
	* <b>post:</b> The name of the medicine of a date is given.
	* @return The name of the medicine.
	*/

  public double getWeight(){
    return weight;
  }
  public void setWeight(double weight){
    this.weight = weight;
  }

  //type

  /**
	* Description This method allows to get the symptom of the pet. <br>
	* <b>post:</b> The name of the medicine of a date is given.
	* @return The name of the medicine.
	*/

  public String getType(){
    return type;
  }
  public void setType(String type){
    this.type = type;
  }

  //age

  /**
	* Description This method allows to get the symptom of the pet. <br>
	* <b>post:</b> The name of the medicine of a date is given.
	* @return The name of the medicine.
	*/

  public int getAge(){
    return age;
  }
  public void setAge(int age){
    this.age = age;
  }

  //breed

  /**
	* Description This method allows to get the symptom of the pet. <br>
	* <b>post:</b> The name of the medicine of a date is given.
	* @return The name of the medicine.
	*/

  public String getBreed(){
    return breed;
  }
  public void setBreed(String breed){
    this.breed = breed;
  }

  //room

  /**
	* Description This method allows to get the symptom of the pet. <br>
	* <b>post:</b> The name of the medicine of a date is given.
	* @return The name of the medicine.
	*/

  public HRoom getRoom(){
		return room;
	}
	public void setRoom(HRoom room){
		this.room = room;
  }

  //infoPet

  public String infoPet(){
  String msj = "";
  msj += "El name es:" + name + "\n";
  msj += "Su edad es:" + age + "\n";
  msj += "Mi peso es:" + weight + "\n";
  msj +="Mi tipo es:" + type + "\n";
  msj +="Mi indice de masa corporal es: "+ calculateBMI();
    return msj;

 }

 /**
*Description This method allows to calculate the body mass index for a pet.
*pre: The pet was created before and its attributes height and weight are not null neither height must be zero.
*post: The BMI is calculated.
*@return The pet body mass index. Returns -1 if the height is zero  due to the division on zero does not exist.
*/

 //calculateBMI

 public double calculateBMI(){
   double bmi = 0.0;

   if(height == 0){
     bmi = -1.0;
   }else{
     bmi += (weight / (height * height));
   }
   return bmi;
 }
}

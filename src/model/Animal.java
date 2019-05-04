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
	* Description This method allows to get the name of the pet. <br>
	* <b>post:</b> The name of the pet is given.
	* @return The name of the pet.
	*/

  public String getName(){
    return name;
  }

  /**
	* Description This method allows to change the name of the pet. <br>
	* <b>post:</b> The name of the pet is changed.
	* @param The new name of the pet.
	*/

  public void setName(String name){
    this.name = name;
  }

  //height

  /**
	* Description This method allows to get the height of the pet. <br>
	* <b>post:</b> The height of the pet is given.
	* @return The height of the pet.
	*/

  public double getHeight(){
    return height;
  }

  /**
	* Description This method allows to change the height of the pet. <br>
	* <b>post:</b> The height of the pet is changed.
	* @param The new height of the pet.
	*/

  public void setHeight(double height){
    this.height = height;
  }

  //weight

  /**
	* Description This method allows to get the weight of the pet. <br>
	* <b>post:</b> The weight of the pet is given.
	* @return The weight of the pet.
	*/

  public double getWeight(){
    return weight;
  }

  /**
	* Description This method allows to change the weight of the pet. <br>
	* <b>post:</b> The weight of the pet is changed.
	* @param The new weight of the pet.
	*/

  public void setWeight(double weight){
    this.weight = weight;
  }

  //type

  /**
	* Description This method allows to get the type of the pet. <br>
	* <b>post:</b> The type of the pet is given.
	* @return The type of the pet.
	*/

  public String getType(){
    return type;
  }

  /**
	* Description This method allows to change the type of the pet. <br>
	* <b>post:</b> The type of the pet is changed.
	* @param The new type of the pet.
	*/

  public void setType(String type){
    this.type = type;
  }

  //age

  /**
	* Description This method allows to get the age of the pet. <br>
	* <b>post:</b> The age of the pet is given.
	* @return The age of the pet.
	*/

  public int getAge(){
    return age;
  }

  /**
	* Description This method allows to change the age of the pet. <br>
	* <b>post:</b> The age of the pet is changed.
	* @param The new age of the pet.
	*/

  public void setAge(int age){
    this.age = age;
  }

  //breed

  /**
	* Description This method allows to get the breed of the pet. <br>
	* <b>post:</b> The breed of the pet is given.
	* @return The breed of the pet.
	*/

  public String getBreed(){
    return breed;
  }

  /**
	* Description This method allows to change the breed of the pet. <br>
	* <b>post:</b> The breed of the pet is changed.
	* @param The new breed of the pet.
	*/

  public void setBreed(String breed){
    this.breed = breed;
  }

  //room

  /**
	* Description This method allows to get the whole object. <br>
	* <b>post:</b> The whole object is given.
	* @return The object room.
	*/

  public HRoom getRoom(){
		return room;
	}

  /**
	* Description This method allows to change the object room. <br>
	* <b>post:</b> The object room is changed.
	* @param The new object room.
	*/

	public void setRoom(HRoom room){
		this.room = room;
  }

  //infoPet

  public String infoPet(){
    String msj = "";

    msj += "Mi nombre es:" + name + "\n";
    msj += "Su edad es:" + age + "\n";
    msj += "Su altura es:" + height + "\n";
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

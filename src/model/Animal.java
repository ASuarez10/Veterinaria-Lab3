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

  /**
	* Description This method allows to make a list with the pet information. <br>
  * <b>pre:</b> The pet was created before and its attributes are not null.
	* @return The information of the animal.
	*/

  //infoPet

  public String infoPet(){
    String msj = "";

    msj += "Mi nombre es:" + name + "\n";
    msj += "Su edad es:" + age + "\n";
    msj += "Su altura es:" + height + "\n";
    msj += "Mi peso es:" + weight + "\n";
    msj +="Mi tipo es:" + type + "\n";
    msj +="Mi indice de masa corporal es: "+ calculateBMI() + "\n\n";

  return msj;
 }

 /**
 * Description This method allows to get symptom of the animal in the room and allows to do another method. <br>
 * @return The symptom of the pet in the room.
 */

 public String symptomPet(){
   return cH.getSymptom();
 }

 /**
 * Description This method allows to get diagnosis of the animal in the room and allows to do another method. <br>
 * @return The diagnosis of the pet in the room.
 */

 public String diagnosisPet(){
   return cH.getDiagnosis();
 }

 //calculateBMI

 /**
*Description This method allows to calculate the body mass index for a pet.
*pre: The pet was created before and its attributes height and weight are not null neither height must be zero.
*post: The BMI is calculated.
*@return The pet body mass index. Returns -1 if the height is zero  due to the division on zero does not exist.
*/

 public double calculateBMI(){
   double bmi = 0.0;

   if(height == 0){
     bmi = -1.0;
   }else{
     bmi += (weight / (height * height));
   }
   return bmi;
 }

 /**
 *Description This method allows to add new medicines that were prescription during the hospitalization at the patient stories.
 *pre: The patient clinic story must be not null.
 *post: New medicines were added to the patient clinic story.
 *@param The medicine name. This param must be not null.
 *@param The medicine dose, this param refers to the amount of medicine supplied to the pet each time according the frequence assigned.
 *@param The medicine cost by each dose. This param could be empty.
 *@param The frequency of medicine application. This param could be empty.
 *@return A message that indiques if medicine was added to the patient clinic story
 */

 public String addNewMedicine(String mName, double mDose, double mDP, String mFreq){
   String msj = "El medicamento ha sido agregado";

   cH.addNewMedicine(mName, mDose, mDP, mFreq);

   return msj;
 }

 /**
 *Description This method allows to add new notes to the possible diagnostic during the hospitalization at the patient stories.
 *pre: The patient clinic story must be not null.
 *post: New notes were added to the possible diagnostic in the patient clinic story.
 *@param The notes of possible diagnostic. This param must be not null.
 */

 public void addNewDiagnosis(String nDiagnosis){
   cH.addNewDiagnosis(nDiagnosis);
 }

 /**
 *Description This method allows to add new notes to the possible diagnostic during the hospitalization at the patient stories.
 *pre: The patient clinic story must be not null.
 *post: New notes were added to the possible diagnostic in the patient clinic story.
 *@param The notes of possible diagnostic. This param must be not null.
 */

 public void addNewSymptom(String nSymptom){
   cH.addNewSymptom(nSymptom);
 }

}//final

package model;
import java.util.ArrayList;
public class HumanClient{

  //Attributes

  private String name;
  private String identification;
  private String phoneN;
  private String adress;

  //Relations

  private ArrayList<Animal>pets;

  //Methods

  public HumanClient(String name, String identification, String phoneN, String adress){

    this.name = name;
    this.identification = identification;
    this.phoneN = phoneN;
    this.adress = adress;
    pets = new ArrayList<Animal>();
  }

  //name

  /**
	* Description This method allows to get the name of the client. <br>
	* <b>post:</b> The name of the client is given.
	* @return The name of the client.
	*/

  public String getName(){
    return name;
  }

  /**
	* Description This method allows to change the name of the client. <br>
	* <b>post:</b> The name of the client is changed.
	* @param The new name of the client.
	*/

  public void setName(String name){
    this.name = name;
  }

  //identification

  /**
	* Description This method allows to get the id of the client. <br>
	* <b>post:</b> The id of the client is given.
	* @return The id of the client.
	*/

  public String getIdentification(){
    return identification;
  }

  /**
	* Description This method allows to change the id of the client. <br>
	* <b>post:</b> The id of the client is changed.
	* @param The new id of the client.
	*/

  public void setIdentification(String identification){
    this.identification = identification;
  }

  //phoneN

  /**
	* Description This method allows to get the phone number of the client. <br>
	* <b>post:</b> The phone number of the client is given.
	* @return The phone number of the client.
	*/

  public String getPhoneN(){
    return phoneN;
  }

  /**
	* Description This method allows to change the phone number of the client. <br>
	* <b>post:</b> The phone number of the client is changed.
	* @param The new phone number of the client.
	*/

  public void setPhoneN(String phoneN){
    this.phoneN = phoneN;
  }

  //adress

  /**
	* Description This method allows to get the adress of the client. <br>
	* <b>post:</b> The client of the client is given.
	* @return The adress of the client.
	*/

  public String getAdress(){
    return adress;
  }

  /**
	* Description This method allows to change the adress of the client. <br>
	* <b>post:</b> The adress of the client is changed.
	* @param The new adress of the client.
	*/

  public void setAdress(String adress){
    this.adress = adress;
  }

  //addPet

  /**
	* Description This method allows to add an animal. <br>
  * <b>pre:</b> The ArrayList have to be initialized.
	* <b>post:</b> True / False.
	* @param The new Animal object.
  * @return A boolean that indicates if the object can be added.
	*/

  public boolean addPet(Animal pet){

    return pets.add(pet);
  }

  /**
	* Description This method allows to see the client information. <br>
  * <b>pre:</b> The client has to be initialized.
  * @return Name, id, adress, phone and pets name of the client.
	*/

  public String infoClient(){
    String msj = "";
    msj += "Mi nombre es:" + name + "\n" ;
    msj += "Mi identificacion es:" + identification + "\n";
    msj += "Mi direccion es:" + adress + "\n" ;
    msj += "Mi numero es:" + phoneN + "\n" ;
    msj += "Mis mascotas son: \n";

    for(int i = 0; i < pets.size(); i++){


      msj += pets.get(i).getName() + "\n";
    }
    return msj;
  }

  /**
	* Description This method allows to add an animal. <br>
  * <b>pre:</b> The ArrayList have to be initialized.
	* <b>post:</b> This method will add the pets of the client.
	* @param The new ArrayList for the pets.
	*/

  public void addPet(ArrayList<Animal> clientsPets){
   pets = clientsPets;

   }

   /**
 	* Description This method allows to see the information of the pets. <br>
   * <b>pre:</b> The ArrayList have to be initialized.
   * @return All the pets information.
 	*/

   //infoPet

   public String infoPet(){
     String msj = "";

     for(int i = 0; i < pets.size(); i++){

       msj += pets.get(i).infoPet();
     }

     return msj;
   }
}

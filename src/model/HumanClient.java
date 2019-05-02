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

  public boolean addPet(Animal pet){

    return pets.add(pet);
  }

  public String infoClient(){
    String msj = "";
    msj += "Mi nombre es:" + name  ;
    msj += "Mi identificacion es:" + identification;
    msj += "Mi direccion es:" + adress  ;
    msj += "Mi numero es:" + phoneN  ;

    int j = 0;
    for(int i = 0; i<pets.size(); i++){
    	++j;
      msj += "Pet"+ j + "";
      msj += pets.get(i).infoPet();
    }
    return msj;
  }

  //findPet

  public Animal findPet(String namePe){

  	Animal restrepo = null;
  	boolean found = false;

  	for(int i = 0; i< pets.size() && !found; i++){

  		if(pets.get(i).getName().equals(namePe)){
  			restrepo = pets.get(i);
  			found = true;
  		}
    }
    return restrepo;
	}

  //searchAPet

  public Animal searchAPet(String pName){
    Animal mascota = null;
    boolean found = false;

    for(int i = 0; i<pets.size() && !found; i++){
      if(pets.get(i).getName().equals(pName)){
        mascota = pets.get(i);
        found = true;
      }
    }
    return mascota;
  }

  //petsName

  public String petsName(){
    String msj = "Mascotas: "+"\n" ;

    for(int i = 0; i < pets.size(); i++){

      msj += "- " + pets.get(i).getName() + "\n";
    }
    return msj;
  }

  public void addPet(ArrayList<Animal> clientsPets){
   pets = clientsPets;

   }

}

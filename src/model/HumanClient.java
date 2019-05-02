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

  public String getName(){
    return name;
  }
  public void setName(String name){
    this.name = name;
  }

  //identification

  public String getIdentification(){
    return identification;
  }
  public void setIdentification(String identification){
    this.identification = identification;
  }

  //phoneN

  public String getPhoneN(){
    return phoneN;
  }
  public void setPhoneN(String phoneN){
    this.phoneN = phoneN;
  }

  //adress

  public String getAdress(){
    return adress;
  }
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

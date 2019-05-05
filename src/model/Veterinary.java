package model;
import java.util.ArrayList;
public class Veterinary{

  //Constantino

  public static final int NROOM = 8;

  //Attributes

  private String name;

  //Relations

  private ArrayList<HumanClient>clients;
  private HRoom[] rooms;

  //Methods

  public Veterinary(String name){

    this.name = name;
    clients = new ArrayList<HumanClient>();
    rooms = new HRoom[NROOM];
  }

  //name

  /**
	* Description This method allows to get the name of the veterinary. <br>
	* <b>post:</b> The name of the veterinary is given.
	* @return The name of the veterinary.
	*/

  public String getName(){
    return name;
  }

  /**
	* Description This method allows to change the name of the veterinary. <br>
	* <b>post:</b> The name of the veterinary is changed.
	* @param The new name of the veterinary.
	*/

  public void setName(String name){
    this.name = name;
  }

  /**
	* Description This method allows to add a client with his/her pets. <br>
  * <b>pre:</b> The ArrayList have to be initialized.
	* <b>post:</b> The client is added with his/her pets.
	* @param The new Animal object.
	*/

  //addClient

  public void addClient(HumanClient client, ArrayList<Animal> clientsPets){

  clients.add(client);
  clients.get((clients.size()-1)).addPet(clientsPets);

  }

  /**
	* Description This method allows to add a pet to a room. <br>
  * <b>pre:</b> The Array have to be initialized.
	* <b>post:</b> Ha sido agregado / No pudo ser agregado.
	* @param The new Animal object.
  * @return A message that indicates if the animal can be added.
	*/

  //addPetToARoom

  public String addPetToARoom(Animal nwPet){

  String msj = "";
  boolean found = false;

    for(int i=0; i< rooms.length && !found; i++){

      if(rooms[i].getSpace()){
        found = true;
        rooms[i].setAnimals(nwPet);
        rooms[i].setSpace(false);

        msj = "" + nwPet.getName() +" ha sido agregado en el cuarto "+(i+1);
      }
    }
    if(found){
      msj = "No hay cuartos vacios";
    }
    return msj;
  }

  /**
	* Description This method allows to see the information of a client. <br>
  * <b>pre:</b> The ArrayList has to be initialized.
  * @return A message with the information.
	*/

  //clientsInfo

  public String clientsInfo(String clientIdentifier){
    String info = "El cliente no esta registrado";

    for(int i = 0; i < clients.size(); i++){

      if(clients.get(i).getIdentification().equals(clientIdentifier)){

        info = clients.get(i).infoClient();
      }
    }
    return info;
  }

  /**
	* Description This method allows to see if a room is available. <br>
  * <b>pre:</b> The Array have to be initialized.
	* <b>post:</b> There is space / There isn't space.
  * @return A message that indicates if the room is available.
	*/

  public String roomAviability(){
    String msj = "";
    boolean hay = false;

    for(int i = 0; i < rooms.length && !hay; i++){
      if(rooms[i].getSpace() == true){
        msj = "Hay espacio en el cuarto " + (i+1);
      }else{
        msj = "No hay espacio en ningun cuarto";
      }
    }
    return msj;
  }

  /**
	* Description This method allows to know the cost of an hospitalization. <br>
	* @param The type, weight and days in hospitalization of the animal.
  * @return The hospitalization cost.
	*/

  //hospitalizationCost

  public double hospitalizationCost(String typeA, double weightA, int days){
    double cost = 0.0;


    if(typeA.equals(Animal.GATO)){
      if(weightA >= 1.0 && weightA <= 3.0){
        cost = (days * 10000.0);
      }
      else if(weightA >= 3.1 && weightA <= 10.0){
        cost =   (days * 12000.0);
      }
      else if(weightA >= 10.1 && weightA <= 20.0){
        cost =  (days * 15000.0);
      }
      else if(weightA > 20.0){
        cost = (days * 20000.0);
      }
    }

    else if(typeA.equals(Animal.PERRO)){
      if(weightA >= 1.0 && weightA <= 3.0){
        cost =  (days * 15000.0);
      }
      else if(weightA >= 3.1 && weightA <= 10.0){
        cost =  (days * 17000.0);
      }
      else if(weightA >= 10.1 && weightA <= 20.0){
        cost =  (days * 20000.0);
      }
      else if(weightA > 20.0){
        cost = (days * 25000.0);
      }
    }

    else if(typeA.equals(Animal.AVE)){
      if(weightA >= 1.0 && weightA <= 3.0){
        cost =  (days * 10000.0);
      }
      else if(weightA >= 3.1 && weightA <= 10.0){
        cost =  (days * 12000.0);
      }
      else if(weightA >= 10.1 && weightA <= 20.0){
        cost = (days * 20000.0);
      }
      else if(weightA > 20.0){
        cost =  (days * 25000.0);
      }
    }

    else if(typeA.equals(Animal.OTRO)){
      if(weightA >= 1.0 && weightA <= 3.0){
        cost =   (days * 10000.0);
      }
      else if(weightA >= 3.1 && weightA <= 10.0){
        cost =  (days * 17000.0);
      }
      else if(weightA >= 10.1 && weightA <= 20.0){
        cost =  (days * 30000.0);
      }
      else if(weightA > 20.0){
        cost = (days * 33000.0);
      }
    }

      return cost;
  }

  /**
	* Description This method allows to add rooms to the array. <br>
  * <b>pre:</b> The Array have to be initialized, rooms has to be initialized.
	* <b>post:</b> Rooms will be assigned in each section.
	* @param The 8 rooms
	*/

  public void addMiniRoom(HRoom rooms1, HRoom rooms2, HRoom rooms3, HRoom rooms4, HRoom rooms5, HRoom rooms6,HRoom rooms7,HRoom rooms8){


    rooms[0] = rooms1;
    rooms[1] = rooms2;
    rooms[2] = rooms3;
    rooms[3] = rooms4;
    rooms[4] = rooms5;
    rooms[5] = rooms6;
    rooms[6] = rooms7;
    rooms[7] = rooms8;
  }


  // contactClient

  /**
	* Description This method allows to see the cell number of a client. <br>
  * <b>pre:</b> The Array have to be initialized.
	* @param The id of the client that is looking for.
  * @return The contact if the client exists.
	*/

  public String contact(String iDN){
    String msj = "No existe este cliente";
    boolean esta = false;

    for(int i = 0; i < clients.size() && !esta; i++){
      if(iDN.equals(clients.get(i).getIdentification())){
        msj = "El numero telefonico del cliente es: "+clients.get(i).getPhoneN();
        esta = true;
      }
    }

    return msj;
  }

  /**
	* Description This method allows to see the information of a pet in a room. <br>
  * <b>pre:</b> The Array have to be initialized.
	* @param The name of the animal that is looking for.
  * @return A message with the information.
	*/

  public String infoPetCuarto(String bName){
    String msj = "Este animal no esta hospitalizado";

    for(int i = 0; i < rooms.length; i++){
      if(bName.equals(rooms[i].nombrePet())){
        msj = rooms[i].infoPet();
      }
    }
    return msj;
  }

  /**
	* Description This method allows to see the information of a pet of a client. <br>
  * <b>pre:</b> The ArrayList have to be initialized.
	* @param The id of the client that is looking for.
  * @return A message with the information.
	*/

  public String infoPetClient(String idInfo){
    String msj = "Este cliente no esta registrado";

    for(int i = 0; i < clients.size(); i++){

      if(idInfo.equals(clients.get(i).getIdentification())){
        msj = clients.get(i).infoPet();
      }
    }
    return msj;
  }
}

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

  public String getName(){
    return name;
  }
  public void setName(String name){
    this.name = name;
  }

  //addClient

  public void addClient(Client client, ArrayList<Animal> clientsPets){

  clients.add(client);
  clients.get((clients.size()-1)).addPet(clientsPets);

}

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

  public String showClients(){
      String msj = "";
      msj += clients.size();
       for(int i = 0 ; i<clients.size(); i++){
         msj +=  (i+1) + clients.get(i).infoClient();
      }
      return msj;

  }

  //hospitalization

  public String hospitalization(String cIdentification, String pName){

    String msj = "";
    Animal p = null;

    for(int i = 0; i<clients.size() && p==null; i++){
      if(clients.get(i).getIdentification().equals(cIdentification)){
        p = clients.get(i).searchAPet(pName);
        if(p!=null){
          msj = "El cliente no tiene esta mascota";
        }
      }
    }
    if(p!=null){
      msj = addPetToARoom(p);
    }
    return msj;
  }

  //clientsInfo

  public String clientsInfo(String clientIdentifier){
    String info = "";
    boolean esta = false;

    for(int i = 0; i < clients.size() && !esta; i++){
      if(clients.get(i).getIdentification().equals(clientIdentifier)){
        esta = true;
        info += "Nombre: "+ clients.get(i).getName() + "\n";
        info += "Identificacion: "+ clients.get(i).getIdentification() + "\n";
        info += "Numero de telefono: "+ clients.get(i).getPhoneN() + "\n";
        info += "Direccion: "+ clients.get(i).getAdress() + "\n";
        info += clients.get(i).petsName();
      }
      info += "No existe este cliente";
    }
    return info;
  }

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

  //hospitalizeVet

  public void hospitalizeAPet(String nameClie, String idClie , String namePe, ClinicHistory newMedRec, Medicine medic){
		boolean theStop = false;

		for(int i = 0;i < clients.size() && !theStop;i++){
			if(clients.get(i).getName().equals(nameClie) && clients.get(i).getIdentification() == idClie){

				theStop = true;
				clients.get(i).startHospita(namePe, newMedRec, medic);


			}else{
        Animal petRelation = clients.get(i).findPet(namePe);

      }

		}
	}

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

  public String contact(String iDN){
    String msj = "No existe este cliente";
    boolean esta = false;

    for(int i = 0; i < clients.size() && !esta; i++){
      if(iDN.equals(clients.get(i).getIdentification())){
        msj = "El numero del cliente es "+clients.get(i).getPhoneN();
        esta = true;
      }
    }

    return msj;
  }

  //findPet

  public Animal findPet(String nameClie, String idClie, String  namePe){

  boolean theStop = false;
  Animal relationshipOfPet = null;

  for(int i= 0;i < clients.size() && !theStop; i++){
    if (!clients.get(i).getName().equals(nameClie) && clients.get(i).getIdentication() == idClie){
      relationshipOfPet = clients.get(i).findPet(namePe);

      theStop = true;
    }
  }

}
}

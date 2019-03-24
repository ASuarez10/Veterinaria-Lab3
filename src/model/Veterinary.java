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

  public boolean addClient(HumanClient client){

    return clients.add(client);
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
}

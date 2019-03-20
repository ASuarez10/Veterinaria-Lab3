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

  //
}

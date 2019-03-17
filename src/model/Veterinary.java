package model;

public class Veterinary{

  //Attributes

  private String name;

  //Relations

  private HumanClient client;
  private HRoom room;

  //Methods

  public Veterinary(String name, HumanClient client, HRoom room){

    this.name = name;
    this.client = client;
    this.room = room;
  }

  //name

  public String getName(){
    return name;
  }
  public void setName(String name){
    this.name = name;
  }

  //client

  public HumanClient getClient(){
    return client;
  }
  public void setClient(HumanClient client){
    this.client = client;
  }

  //room

  public HRoom getRoom(){
    return room;
  }
  public void setRoom(HRoom room){
    this.room = room;
  }
}

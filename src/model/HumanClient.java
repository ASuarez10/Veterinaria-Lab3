package model;
import java.uit.ArrayList;
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

}

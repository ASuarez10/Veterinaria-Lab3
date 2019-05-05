package model;
import java.util.ArrayList;
public class Service{

  //Constantes
  public final static double WASH = 20000;
  public final static double WASHDELIVERY = 30000;
  public final static double CNAILS = 8000;
  public final static double DENTIST = 12000;
  public final static double VACUNNE = 45000;

  public final static String SERVICE1 = "Lavado de perros";
  public final static String SERVICE2 = "Lavado de mascotas a domicilio";
  public final static String SERVICE3 = "Corte de uñas";
  public final static String SERVICE4 = "Profilaxia dental";
  public final static String SERVICE5 = "Aplicacion de vacunas";
  //Atributos
  private String serviceName;
  private double cost;
  private String date;
  private String petID;
  private String clientID;

  //Relaciones

  private Animal sIP;

  public Service(String serviceName, double cost ,String date, String petID, String clientID, Animal sIP){

  this.serviceName = serviceName;
  this.cost = cost;
  this.date = date;
  this.petID = petID;
  this.clientID = clientID;
  this.sIP = sIP;
  }

  /**
   *Description este metodo obtiene el servicio
  *@return String  el servicio
  */
  public String getServiceName(){
    return serviceName;
  }
  /**
  *Description este metodo establece el servicio
  *@param serviceName String el servicio
  */
  public void setServiceName(String serviceName){
    this.serviceName = serviceName;
  }
  /**
  *Description este metodo obtiene el costo del servicio
  *@return double el costo del servicio
  */
  public double getCost(){
    return cost;
  }
  /**
  *Description este mtodo establece el costo del servicio
  *@param cost double el costo del servicio
  */
  public void setCost(double cost){
    this.cost = cost;
  }
  /**
  *Description este metodo obtiene la fecha en la que se hizo
  *@return String la fecha en la que se hizo
  */
  public String getDate(){
    return date;
  }
  /**
  *Description este metodo establece en la fecha en la que se hizo
  *@param date String la fecha que se hizo
  */
  public void setDate(String date){
    this.date = date;
  }
  /**
  *Description este metodo obtiene la identificacion de la mascota
  *@return String la identificacion de la mascota
  */
  public String getPetID(){
    return petID;
  }
  /**
  *Description este metodo establece la identificacion de la mascota
  *@param petID String la identificacion de la mascota
  */
  public void setpetID(String petID){
    this.petID = petID;
  }
  /**
  *Description este metodo obtiene la identificacion del cliente
  *@return String la identificacion del cliente
  */
  public String getClientID(){
    return clientID;
  }
  /**
  *Description este metodo establece la identificacion del cliente
  *@param clientID String la identificacion del cliente
  */
  public void setClientID(String clientID){
    this.clientID = clientID;
  }
  /**
   *Description este metodo obtiene el ArrayList de las mascotas
  *@return Animal el Arraylist de las mascotas
  */
  public Animal getSIP(){
    return sIP;
  }
  /**
  *Description este metodo establece el arraylist de las mascotas
  *@param sIP Animal el arraylist de mascotas
  */
  public void setSIP(Animal sIP){
  	this.sIP = sIP;

  }

  /**
  *Description este metodo obtiene la informacion del servicio
  *@return String la info del servicio
  */
  public String serviceInfo(){
  String msj = "";

  msj = "Nombre del servicio: " + serviceName;
  msj = "Costo: " + cost;
  msj = "Fecha de realizacion: " + date;
  msj = "La ID de la mascota es: " + petID;
  msj = "La ID del cliente es: " + clientID;

  return msj;
  }

}//final

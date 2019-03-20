package model;
import java.util.ArrayList;
public class ClinicHistory{

  //Attributes

  private char state;
  private String diagnosis;
  private String symptom;

  //Relations

  private Date eDate;
  private Date dDate;
  private ArrayList<Medicine>medicine1;

  //Methods

  public ClinicHistory(char state, String diagnosis, String symptom, Date eDate, Date dDate){

    this.state = state;
    this.diagnosis = diagnosis;
    this.symptom = symptom;
    this.eDate = eDate;
    this.dDate = dDate;
    medicine1 = new ArrayList<Medicine>();
  }

  //state

  public char getState(){
    return state;
  }
  public void setState(char state){
    this.state = state;
  }

  //diagnosis

  public String getDiagnosis(){
    return diagnosis;
  }
  public void setDiagnosis(String diagnosis){
    this.diagnosis = diagnosis;
  }

  //symptom

  public String getSymptom(){
    return symptom;
  }
  public void setSymptom(String symptom){
    this.symptom = symptom;
  }

  //eDate

  public Date getEDate(){
    return eDate;
  }
  public void setEDate(Date eDate){
    this.eDate = eDate;
  }

  //dDate

  public Date getDDate(){
    return dDate;
  }
  public void setDDate(Date dDate){
    this.dDate = dDate;
  }

  //addMedicine

  public boolean addMedicine(Medicine medicine){

    return clients.add(medicine);
  }
}

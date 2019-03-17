package model;

public class ClinicHistory{

  //Attributes

  private char state;
  private String diagnosis;
  private String symptom;

  //Relations

  private Date eDate;
  private Date dDate;
  private Medicine medicine1;

  //Methods

  public ClinicHistory(char state, String diagnosis, String symptom, Date eDate, Date dDate, Medicine medicine1){

    this.state = state;
    this.diagnosis = diagnosis;
    this.symptom = symptom;
    this.eDate = eDate;
    this.dDate = dDate;
    this.medicine1 = medicine1;
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

  //medicine1

  public Medicine getMedicine1(){
    return medicine1;
  }
  public void setMedicine1(Medicine medicine1){
    this.medicine1 = medicine1;
  }
}

package model;
import java.util.ArrayList;
public class ClinicHistory{

  //Attributes

  private int state;
  private String diagnosis;
  private String symptom;

  //Relations

  private ArrayList<Medicine>medicine1;

  //Methods

  public ClinicHistory(int state, String diagnosis, String symptom){

    this.state = state;
    this.diagnosis = diagnosis;
    this.symptom = symptom;
    medicine1 = new ArrayList<Medicine>();
  }

  //state

  public int getState(){
    return state;
  }
  public void setState(int state){
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



  //addMedicine

  public boolean addMedicine(Medicine medicine){

    return medicine1.add(medicine);
  }

}

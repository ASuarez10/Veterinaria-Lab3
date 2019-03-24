package model;
import java.util.ArrayList;
public class ClinicHistory{

  //Attributes

  private int state;
  private String diagnosis;
  private String symptom;

  //Relations

  private Date eDate;
  private ArrayList<Medicine>medicine1;

  //Methods

  public ClinicHistory(int state, String diagnosis, String symptom, Date eDate){

    this.state = state;
    this.diagnosis = diagnosis;
    this.symptom = symptom;
    this.eDate = eDate;
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

  //eDate

  public Date getEDate(){
    return eDate;
  }
  public void setEDate(Date eDate){
    this.eDate = eDate;
  }


  //addMedicine

  public boolean addMedicine(Medicine medicine){

    return medicine1.add(medicine);
  }

  //daysInHospitalization

  public int daysInHospitalization(int aDay, int aMonth, int aYear){
    int totalDays = eDate.daysInHospitalization(aDay, aMonth, aYear);

    return totalDays;
  }

  //costOfMedicamentsAplicated

  public double costOfMedicamentsAplicated(){
    double costMedicaments = 0.0;

    for(int i = 0; i < medicine1.size(); i++){
      costMedicaments += medicine1.get(i).getDose() * medicine1.get(i).getDosePrice();
    }

    return costMedicaments;
  }
}

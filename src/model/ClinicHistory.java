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

  /**
	* Description This method allows to get the state of the clinic history. <br>
	* <b>post:</b> The state of the clinic history is given.
	* @return The state of the clinic history.
	*/

  public int getState(){
    return state;
  }

  /**
	* Description This method allows to change the state of the clinic history. <br>
	* <b>post:</b> The state of the clinic history is changed.
	* @param The new state of the clinic history.
	*/

  public void setState(int state){
    this.state = state;
  }

  //diagnosis

  /**
	* Description This method allows to get the diagnosis of the pet. <br>
	* <b>post:</b> The name of the medicine of a date is given.
	* @return The name of the medicine.
	*/

  public String getDiagnosis(){
    return diagnosis;
  }

  /**
	* Description This method allows to change the diagnosis in the clinic history. <br>
	* <b>post:</b> The price per dose of the medicne is changed.
	* @param The new price per dose of the medicine.
	*/

  public void setDiagnosis(String diagnosis){
    this.diagnosis = diagnosis;
  }

  //symptom

  /**
	* Description This method allows to get the symptom of the pet. <br>
	* <b>post:</b> The name of the medicine of a date is given.
	* @return The name of the medicine.
	*/

  public String getSymptom(){
    return symptom;
  }

  /**
	* Description This method allows to change the symptom in the clinic history. <br>
	* <b>post:</b> The symptom of the clinic history is changed.
	* @param The new symptom of the clinic history.
	*/

  public void setSymptom(String symptom){
    this.symptom = symptom;

  }

  /**
	* Description This method allows to add a object and indicates if it can be added . <br>
  * <b>pre:</b> The ArrayList have to be initialized
	* <b>post:</b> True / False.
	* @return A boolean that indicates if the object can be added.
	*/

  //addMedicine

  public boolean addMedicine(Medicine medicine){

    return medicine1.add(medicine);
  }

}

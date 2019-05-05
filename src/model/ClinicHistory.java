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

  /**
  *Description This method allows to add new medicines that were prescription during the hospitalization at the patient stories.
  *pre: The patient clinic story must be not null.
  *post: New medicines were added to the patient clinic story.
  *@param The medicine name. This param must be not null.
  *@param The medicine dose, this param refers to the amount of medicine supplied to the pet each time according the frequence assigned.
  *@param The medicine cost by each dose. This param could be empty.
  *@param The frequency of medicine application. This param could be empty.
  *@return A message that indiques if medicine was added to the patient clinic story
  */

  public String addNewMedicine(String mName, double mDose, double mDP, String mFreq){
    String msj = "El medicamento ha sido agregado";
    Medicine nMedicine = new Medicine(mName, mDose, mDP, mFreq);

    medicine1.add(nMedicine);

    return msj;
  }

  /**
  *Description This method allows to add new notes to the possible diagnostic during the hospitalization at the patient stories.
  *pre: The patient clinic story must be not null.
  *post: New notes were added to the possible diagnostic in the patient clinic story.
  *@param The notes of possible diagnostic. This param must be not null.
  */
  public void addNewDiagnosis(String nDiagnosis){

  setDiagnosis(nDiagnosis + getDiagnosis());

  }

  /**
  *Description This method allows to add a new symptom presented during the hospitalization at the patient stories.
  *pre: The patient clinic story must be not null.
  *post: A new symptom were added to the patient clinic story.
  *@param The new symptom presented. This param must be not null.
  */
  public void addNewSymptom(String nSymptom){

  setSymptom(nSymptom + getSymptom());

  }

}//Final

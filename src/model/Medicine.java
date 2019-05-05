package model;

public class Medicine{

  //Attributes

  private String name;
  private double dose;
  private double dosePrice;
  private String frequence;

  //Methods

  public Medicine(String name, double dose, double dosePrice, String frequence){

    this.name = name;
    this.dose = dose;
    this.dosePrice = dosePrice;
    this.frequence = frequence;
  }

  //name

  /**
	* Description This method allows to get the name of the medicine. <br>
	* <b>post:</b> The name of the medicine is given.
	* @return The name of the medicine.
	*/

  public String getName(){
    return name;
  }

  /**
	* Description This method allows to change the name of the medicine. <br>
	* <b>post:</b> The name of the medicne is changed.
	* @param The new name of the medicine.
	*/

  public void setName(String name){
    this.name = name;
  }

  //dose

  /**
	* Description This method allows to get the dose amount of the medicine. <br>
	* <b>post:</b> The dose amount of the medicine is given.
	* @return The dose amount of the medicine.
	*/

  public double getDose(){
    return dose;
  }

  /**
	* Description This method allows to change the dose amount of the medicine. <br>
	* <b>post:</b> The dose amount of the medicne is changed.
	* @param The new dose amount of the medicine.
	*/

  public void setDose(double dose){
    this.dose = dose;
  }

  //dosePrice

  /**
	* Description This method allows to get the price per dose of the medicine. <br>
	* <b>post:</b> The name of the medicine of a date is given.
	* @return The name of the medicine.
	*/

  public double getDosePrice(){
    return dosePrice;
  }

  /**
	* Description This method allows to change the price per dose of the medicine. <br>
	* <b>post:</b> The price per dose of the medicne is changed.
	* @param The new price per dose of the medicine.
	*/

  public void setDosePrice(double dosePrice){
    this.dosePrice = dosePrice;
  }

  //frequence

  /**
	* Description This method allows to get the frequence of the medicine. <br>
	* <b>post:</b> The frequence of the medicine is given.
	* @return The frequence of the medicine.
	*/

  public String getFrequence(){
    return frequence;
  }

  /**
	* Description This method allows to change the frequence of the medicine. <br>
	* <b>post:</b> The frequence of the medicne is changed.
	* @param The new frequence of the medicine.
	*/

  public void setFrequence(String frequence){
    this.frequence = frequence;
  }

}

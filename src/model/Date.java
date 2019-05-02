package model;

public class Date{

  //Attributes

  private int day;
  private int month;
  private int year;

  //Metodos

  public Date(int day, int month, int year){

    this.day = day;
    this.month = month;
    this.year = year;
  }

  //day

  /**
	* Description This method allows to get the number of the day of a date. <br>
	* <b>post:</b> The number of the day of a date is given.
	* @return The number of the day of a date.
	*/

  public int getDay(){
    return day;
  }

  /**
	* Description This method allows to change the number of the day of a date. <br>
	* <b>post:</b> The number of the day of a date is changed.
	* @param The number of the day of a date. This param must be greater than zero.
	*/

  public void setDay(int day){
    this.day = day;
  }

  //month

  /**
	* Description This method allows to get the number of the month of a date. <br>
	* <b>post:</b> The number of the month of a date is given.
	* @return The number of the month of a date.
	*/

  public int getMonth(){
    return month;
  }

  /**
	* Description This method allows to change the number of the month of a date. <br>
	* <b>post:</b> The number of the month of a date is changed.
	* @param The number of the month of a date. This param must be greater than zero.
	*/

  public void setMonth(int month){
    this.month = month;
  }

  //year

  /**
	* Description This method allows to get the number of the year of a date. <br>
	* <b>post:</b> The number of the year of a date is given.
	* @return The number of the year of a date.
	*/

  public int getYear(){
    return year;
  }

  /**
	* Description This method allows to change the number of the year of a date. <br>
	* <b>post:</b> The number of the year of a date is changed.
	* @param The number of the year of a date. This param must be greater than zero.
	*/

  public void setYear(int year){
    this.year = year;
  }

}

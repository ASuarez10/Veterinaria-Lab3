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
  public int getDay(){
    return day;
  }
  public void setDay(int day){
    this.day = day;
  }

  //month
  public int getMonth(){
    return month;
  }
  public void setMonth(int month){
    this.month = month;
  }

  //year
  public int getYear(){
    return year;
  }
  public void setYear(int year){
    this.year = year;
  }

  //daysInHospitalization

  public int daysInHospitalization(int aDay, int aMonth, int aYear){
    int totalDays = 0;
    int dH = 0;
    int dA = 0;

    dH += ((month - 1) * 30) + day;
    dA += ((aMonth - 1) * 30) + aDay;
    totalDays += (365 - dH) + dA;

    return totalDays;
  }
}

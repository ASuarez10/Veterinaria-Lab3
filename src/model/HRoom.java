package model;

public class HRoom{

  //Attributes

  private boolean space;
  private int id;
  private int number;


  //Relations

  private Animal animals;

  //Methods

  public HRoom(boolean space, int id, int number, Animal animals){

    this.space = space;
    this.id = id;
    this.number = number;
    this.animals = animals;
  }

  //space

  /**
	* Description This method allows to know if the room is empty. <br>
	* <b>post:</b> The name of the pet is given.
	* @return The name of the pet.
	*/

  public boolean getSpace(){
    return space;
  }

  /**
	* Description This method allows to change the space of the room if this is empty or crowded. <br>
	* <b>post:</b> The space of the room is changed.
	* @param The new space of the room.
	*/

  public void setSpace(boolean space){
    this.space = space;
  }

  //id

  /**
	* Description This method allows to get the id of the room. <br>
	* <b>post:</b> The id of the room is given.
	* @return The id of the room.
	*/

  public int getID(){
    return id;
  }

  /**
	* Description This method allows to change the id of the room. <br>
	* <b>post:</b> The id of the room is changed.
	* @param The new id of the room.
	*/

  public void setID(int id){
    this.id = id;
  }

  //number

  /**
	* Description This method allows to get the number of the room. <br>
	* <b>post:</b> The number of the room is given.
	* @return The number of the room.
	*/

  public int getNumber(){
    return number;
  }

  /**
	* Description This method allows to change the number of the room. <br>
	* <b>post:</b> The number of the room is changed.
	* @param The new number of the room.
	*/

  public void setNumber(int number){
    this.number = number;
  }

  //animals

  /**
	* Description This method allows to get the whole object. <br>
	* <b>post:</b> The whole object is given.
	* @return The object animal.
	*/

  public Animal getAnimals(){
    return animals;
  }

  /**
	* Description This method allows to change the object room. <br>
	* <b>post:</b> The object animal is changed.
	* @param The new object animal.
	*/

  public void setAnimals(Animal animals){
    this.animals = animals;
  }


}

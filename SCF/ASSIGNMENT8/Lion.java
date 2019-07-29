
/**
 *define the lion class
 */
public  class Lion extends Mammal {

	/**
	 * @param name define the name of lion 
	 * @param age define the age of lion
	 * @param animalWeight define the weight of lion
	 */
	public Lion(String name, int age, float animalWeight) {
		super(name, age, animalWeight);
		
	}

	/** 
	 * return the animal name
	 */
	public String getType(){ 
		return "Lion";
	}

	/**
	 * return the lion sound
	 */
	public String getSound(){
		return "Roar";
	}

	
}
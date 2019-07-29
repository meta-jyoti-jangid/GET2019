
/**
 * define the Tiger class
 *
 */
public  class Tiger extends Mammal {

	/**
	 * @param name  define the tiger name
	 * @param age define the tiger age
	 * @param animalWeight define the tiger weight
	 */
	public Tiger(String name, int age, float animalWeight) {
		super(name, age, animalWeight);
		
	}

	/**
	 * return the animal name
	 */
	public String getType(){
		return "Tiger";
	}

	/**
	 * return the animal sound
	 */
	public String getSound(){
		return "Roar";
	}

	
}
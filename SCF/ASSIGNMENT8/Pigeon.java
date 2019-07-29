/**
 * define the Pigeon class
 *
 */
public  class Pigeon extends Bird {

	/**
	 * @param name define the Pigeon name
	 * @param age define the Pigeon age
	 * @param animalWeight define the Pigeon weight
	 */
	public Pigeon(String name, int age, float animalWeight) {
		super(name, age, animalWeight);
		
	}

	/**
	 * return the Bird name
	 */
	public String getType(){
		return "Pigeon";
	}

	/**
	 * return the Pigeon sound
	 */
	public String getSound(){
		return "Chirp";
	}

	
}
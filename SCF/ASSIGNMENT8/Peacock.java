
/**
 * define the Peacock class
 *
 */
public  class Peacock extends Bird {

	/**
	 * @param name define the Peacock name
	 * @param age define the Peacock age
	 * @param weight define the Peacock weight
	 */
	public Peacock(String name, int age, int weight) {
		super(name, age, weight);
		
	}
	
	/** 
	 * return the animal name
	 */
	public String getType(){
		return "Peacock";
	}
	
	/**
	 * return the animal sound
	 */
	public String getSound(){
		return "Chirp";
	}

	
}
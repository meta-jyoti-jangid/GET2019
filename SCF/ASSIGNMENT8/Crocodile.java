/**
 * define the Crocodile class
 *
 */
public  class Crocodile extends Reptile {

	/**
	 * @param name define the name of the Crocodile
	 * @param age define the age of the Crocodile
	 * @param weight define the weight of Crocodile
	 */
	public Crocodile(String name, int age, int weight) {
		super(name, age, weight);
		
	}

	/** 
	 * returns Animal name
	 */
	public String getType(){
		return "Crocodile";
	}

	/** 
	 * returns sound of animal
	 */
	public String getSound(){
		return "Cruk ";
	}

	
}
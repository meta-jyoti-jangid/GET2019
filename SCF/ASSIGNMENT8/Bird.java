/**
 * define the bird class
 */
abstract class Bird extends Animal {
	static String BIRD = "Bird";

	/**
	 * @param name
	 *            define the name of bird
	 * @param age
	 *            define the age of bird
	 * @param animalWeight
	 *            define the weight of animal
	 */
	public Bird(String name, int age, float animalWeight) {
		super(name, age, animalWeight);

	}

	public String getCategory() {
		return "Bird";
	}

	public abstract String getSound();

	public abstract String getType();

}
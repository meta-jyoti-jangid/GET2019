package OrganicChemistry;

/**
 * @author Jyoti
 *
 */
public class Compounds {
	private char element;
	private int base;

	/**
	 * @param element
	 *            is element name
	 * @param base
	 *            is the occurrence of that element in the compound
	 */
	public Compounds(char element, int base) {
		this.element = element;
		this.base = base;
	}

	public char getElement() {
		return element;
	}

	public void setElement(char element) {
		this.element = element;
	}

	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}
}

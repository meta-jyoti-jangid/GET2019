package Counselling;

/**
 * Allocated Student class define the allocated program to the student
 * 
 * @author Jyoti
 *
 */
public class AllocatedStudent {
	public String studentName;
	public String allocateProgram;

	public AllocatedStudent(String name, String program) {
		this.studentName = name;
		this.allocateProgram = program;
	}

	/**
	 * @return Student Name
	 */
	public String getStudentName() {
		return studentName;
	}

	/**
	 * @return Program Name
	 */
	public String getProgramName() {
		return allocateProgram;
	}
}

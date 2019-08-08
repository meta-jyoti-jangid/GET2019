package Employee;

import java.util.*;

public class MyComparator implements Comparator {

	public int compare(Object obj1, Object obj2) {
		EmployeeDetails emp1 = (EmployeeDetails) obj1;
		EmployeeDetails emp2 = (EmployeeDetails) obj2;
		String emp1Name = emp1.getEmpName();
		String emp2Name = emp2.getEmpName();
		return emp1Name.compareTo(emp2Name);
	}
}
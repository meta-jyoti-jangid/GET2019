package Employee;

public class EmployeeDetails implements Comparable {
	    private int empId;
	    private String empName;
	    private String empAddress;

	    public EmployeeDetails(int empId, String empName, String empAddress) 
     {
		       this.empId = empId;
		       this.empName = empName;
		       this.empAddress = empAddress;
	    }

	    public int getEmpId() 
     {
		       return empId;
	    }

	    public void setEmpId(int empId) 
     {
		       this.empId = empId;
	    }

	    public String getEmpName() 
     {
		       return empName;
	    }
	    public void setEmpName(String empName) 
     {
		       this.empName = empName;
	    }
	    public String getEmpAddress() 
     {
		       return empAddress;
	    }

	    public void setEmpAdresses(String empAddress) 
     {
		       this.empAddress = empAddress;
	    }
	   /**
	    * sorting of employee on the basis of the Id using the comparable 
	    */
	
	    public int compareTo(Object emp) 
     {
		       int empId=((EmployeeDetails)emp).getEmpId();
         if(this.empId<empId)
		           return -1;
         else
             if(this.empId>empId)
                 return 1;
                else 
                     return 0;
	    }
	   /**
	    * method converts Employee object in readable form 
	    */ 
	    public String toString() 
     {
		       return "Employee [empId=" + empId + ", empName=" + empName + ", empAddress=" + empAddress + "]";
	    }
    /**
	    * method compares two employee on the empId basis 
	    */
     public boolean equals(Object employee)
     {
    	 EmployeeDetails emp1=(EmployeeDetails)employee;
         if(this.empId==emp1.getEmpId())
              return true;
         else 
              return false;
     }
}
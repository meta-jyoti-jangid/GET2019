package Employee;

import java.util.*;
public class UseEmployee{
     public static void main(String args[])
     {
    	 EmployeeDetails e1=new EmployeeDetails(1001,"Raju","Jaipur");
    	 EmployeeDetails e2=new EmployeeDetails(1002,"Rajesh","Sikar");
    	 EmployeeDetails e3=new EmployeeDetails(1003,"Manish","Jaipur");
    	 EmployeeDetails e4=new EmployeeDetails(1004,"Ramesh","Sikar");
    	 EmployeeDetails e5=new EmployeeDetails(1005,"Nitesh","Sikar");
         TreeSet employeeRocord=new TreeSet();
         employeeRocord.add(e1);
         employeeRocord.add(e2);
         employeeRocord.add(e3);
         employeeRocord.add(e4);
         employeeRocord.add(e5);
         System.out.println(employeeRocord);
         
         TreeSet employeeRocordCustom=new TreeSet(new MyComparator());
         employeeRocordCustom.add(e1);
         employeeRocordCustom.add(e2);
         employeeRocordCustom.add(e3);
         employeeRocordCustom.add(e4);
         employeeRocordCustom.add(e5);
         System.out.println(employeeRocordCustom);
         
         System.out.println(employeeRocord.add(new EmployeeDetails(1002,"HJ","fig")));
         
     }
}
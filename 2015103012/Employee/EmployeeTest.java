import java.io.*;
import java.util.Scanner;

public class EmployeeTest
{
	public static void main(String args[])
	{
		String fName,lName;
		double mSalary;
		Employee e1=new Employee();
		Employee e2=new Employee();
		Scanner in=new Scanner(System.in);
		System.out.print("Enter Employee 1 First Name:");
		fName=in.next();
		e1.setFirstName(fName);
		System.out.print("Enter Employee 1 Last Name:");
		lName=in.next();
		e1.setLastName(lName);
		System.out.print("Enter Employee 1 Monthly Salary:");
		mSalary=in.nextDouble();
		e1.setMonthlySalary(mSalary);
		System.out.print("\nEnter Employee 2 First Name:");
		fName=in.next();
		e2.setFirstName(fName);
		System.out.print("Enter Employee 2 Last Name:");
		lName=in.next();
		e2.setLastName(lName);
		System.out.print("Enter Employee 2 Monthly Salary:");
		mSalary=in.nextDouble();
		e2.setMonthlySalary(mSalary);
		System.out.println("/nYearly Salary of Employee 1:"+(12*e1.getMonthlySalary()));
		System.out.println("Yearly Salary of Employee 2:"+(12*e2.getMonthlySalary()));
		System.out.println("/nYearly Salary of Employee 1 After Raise:"+(12*e1.getMonthlySalary()+(12*e1.getMonthlySalary()*0.1)));
		System.out.println("Yearly Salary of Employee 2 After Raise:"+(12*e2.getMonthlySalary()+(12*e2.getMonthlySalary()*0.1)));
	}
}

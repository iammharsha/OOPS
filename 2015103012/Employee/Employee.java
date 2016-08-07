class Employee
{
	private String firstName;
	private String lastName;
	private double monthlySalary;
	public Employee()
	{
		firstName=null;
		lastName=null;
		monthlySalary=0.0;
	}

	public void setFirstName(String fName)
	{
		firstName=fName;	
	}

	public void setLastName(String lName)
	{
		lastName=lName;
	}

	public void setMonthlySalary(double mSalary)
	{
		if(mSalary>=0)
			monthlySalary=mSalary;
	}

	public String getFirstName()
	{
		return firstName;
	}

	public String getLastName()
	{
		return lastName;
	}

	public double getMonthlySalary()
	{
		return monthlySalary;
	}
}

class Date
{
	int month,day,year;
	
	public Date()
	{
		day=01;
		month=01;
		year=2000;
	}
	
	public void setDay(int d)
	{
		day=d;
	}

	public void setMonth(int m)
	{
		month=m;
	}

	public void setYear(int y)
	{
		year=y;
	}

	public int getDay()
	{
		return day;
	}

	public int getMonth()
	{
		return month;
	}

	public int getYear()
	{
		return year;
	}

	public void displayDate()
	{
		System.out.println(day+"/"+month+"/"+year);
	}
}

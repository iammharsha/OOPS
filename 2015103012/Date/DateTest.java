import java.io.*;
import java.util.Scanner;

class DateTest
{
	public static void main(String args[])
	{	
		Date d=new Date();
		System.out.println("Constructor:"+d.getDay()+"/"+d.getMonth()+"/"+d.getYear());
		Scanner in= new Scanner(System.in);
		int day,year,month;
		System.out.print("Enter Day:");
		day=in.nextInt();
		d.setDay(day);
		System.out.print("Enter Month:");
		month=in.nextInt();
		d.setMonth(month);
		System.out.print("Enter Year:");
		year=in.nextInt();
		d.setYear(year);
		System.out.print("Date:");
		d.displayDate();
	}
}

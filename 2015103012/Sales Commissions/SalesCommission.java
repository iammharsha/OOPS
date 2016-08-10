import java.util.*;
class SalesCommission
{
	public static void main(String args[])
	{
		int  sales=0;
		Scanner in=new Scanner(System.in);
		ArrayList<Integer> grossSales=new ArrayList<Integer>();
		int[] count=new int[9];
		Arrays.fill(count,0);
		while(sales!=-1)
		{
			System.out.print("Enter Gross Sales Of Employee (-1 To End) : ");
			sales=in.nextInt();
			if(sales!=-1)
			grossSales.add(sales);
		}
		for(int i=0;i<grossSales.size();i++)
		{
			int commission=200+(int)(0.9*grossSales.get(i));
			grossSales.set(i,commission);
		}
		for(int i:grossSales)
		{
			if(i>=200 && i<=299)
				count[0]+=1;
			else if(i>=300 && i<=399)
				count[1]+=1;
			else if(i>=400 && i<=499)
				count[2]+=1;
			else if(i>=500 && i<=599)
				count[3]+=1;
			else if(i>=600 && i<=699)
				count[4]+=1;
			else if(i>=700 && i<=799)
				count[5]+=1;
			else if(i>=800 && i<=899)
				count[6]+=1;
			else if(i>=900 && i<=999)
				count[7]+=1;
			else if(i>=1000)
				count[8]+=1;
		}
			System.out.println("$200-$299 : "+count[0]);
			System.out.println("$300-$399 : "+count[1]);
			System.out.println("$400-$499 : "+count[2]);
			System.out.println("$500-$599 : "+count[3]);
			System.out.println("$600-$699 : "+count[4]);
			System.out.println("$700-$799 : "+count[5]);
			System.out.println("$800-$899 : "+count[6]);
			System.out.println("$900-$999 : "+count[7]);
			System.out.println("$1000 and Over : "+count[8]);
	}
}

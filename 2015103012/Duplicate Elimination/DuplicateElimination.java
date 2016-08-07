import java.util.*;

class DuplicateElimination
{
	public static void main(String args[])
	{
		int count=0;
		int i;
		Scanner in=new Scanner(System.in);
		ArrayList<Integer> a=new ArrayList<Integer>();
		while(count<5)
		{
			System.out.print("Enter Element : ");
			i=in.nextInt();
			if(a.indexOf(i)==-1)
			{
				a.add(i);
				count++;
			}
			else
				System.out.println("Element already exists.");
		}
		for(int j:a)
		{
			System.out.println(j);
		}
	}
}
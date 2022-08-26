public class Pattern13
{
	public static void main(String[] args)
	{
		int no=0, space=4;
		for (int i= 1; i<=4; i++)
		{
			space--;
			no++;
			int count =1;
				for(int j=1;j<=space;j++)
				{
					System.out.print(" ");
				}
				for(int j=1;j<=no; j++)
				{
					System.out.print(count++);
				}
				if(i>=2)
				{
					for (int j =i-1 ; j >= 1; j--)
					{
						System.out.print(j);
					}
				}


			System.out.println();
		}
	}
}
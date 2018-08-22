
public class Factory
{
	public String returnFactorial (int bignumber)
	{
		int variable = 2;
		int counter = 0;
		while(true)
		{
			if (bignumber == 1 && counter == 0)
			{
				return "Error: Not Distinguishable ";
			}
			counter++;
			if (bignumber == 1)
			{
				return counter+"!";
			}
			if (bignumber < 1)
			{
				return "Not a factorial";
			}
			bignumber = bignumber/variable;
			variable++;
		}
	}
}

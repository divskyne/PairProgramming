package Doggo;

public class finishPos {

	public String position(int pos) {
		
		String newString="";
		int array[] = new int[100];
		for (int i = 1; i < 101; i++) {
			if(i==pos) {
			array[i-1]=0;
			}
			else {
				array[i-1]=i;
			}
			if(array[i-1] == 0)
			{
				
			}
			if(array[i-1] == 1)
			{
				newString += array[i-1]+"st, ";
			}
			if(array[i-1] == 2)
			{
				newString += array[i-1]+"nd, ";
			}
		if(array[i-1] == 3)
			{
				newString += array[i-1]+"rd, ";
			}
		if (array[i-1] == 100)
		{
			newString += array[i-1]+"th";
		}
			else if (i!=pos&&!(array[i-1] == 2)&&!(array[i-1] == 0)&&!(array[i-1] == 1)&&!(array[i-1] == 3))
			{
				newString += array[i-1]+"th, ";
			}
			
		}	
		return newString;
	}
}
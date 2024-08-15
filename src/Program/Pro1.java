package Program;

public class Pro1 
{
public static void main(String[] args) 
{
	 int count=0;
	 int[] v= {12,34,56,77};
	
	for(int i=0;i<=v.length-1;i++)
	{
		if(v[i]%2==1)
		{
			while(v[i]!=0)
		{
				int rem=v[i]%100;
				count++;
				v[i]=v[i]/100;
		}
		}
		
		}
	System.out.print(count);
	}
}



public class qs6_b 
{

	public static void main(String[] args)
	{
        int y=2000;
        if(y%100==0)
        {
        	if(y%400==0)
        	  System.out.println(y+" is a leap year");
        	else
        	  System.out.println(y+" is not a leap year");	
        		
        }
        else
        {
        	if(y%4==0)
        	{
        		if(y%400==0)
        			System.out.println(y+" is not a leap year");
        		else
        			System.out.println(y+" is not a leap year");
        	}
        }
        	
        


    }
}
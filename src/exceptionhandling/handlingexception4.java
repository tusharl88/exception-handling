package exceptionhandling;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class handlingexception4 {

	public static void main(String []args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
	// Here we will use keyword finally. 
		int i,j,k=0;
		i = 8;
		j = 2;
		
		try{
			System.out.println("enter a number");
			
			// now suppose user inputs value zero which gives arithmetic exception and statements after k= i/j will not be printed like ***,
			//then we will include this statement in finally. 
			j= Integer.parseInt( br.readLine());     
		
			k = i/j;
			System.out.println(k);
			//System.out.println("i will never give up");   //***
				
			
		}
		catch(NumberFormatException e)			{System.out.println("cant dance sala " + e);}
		catch(IOException e)					{System.out.println("papu cant dance sala " + e);}	
		catch(ArithmeticException e)    		{System.out.println("papu  dance sala " + e);}	
		catch (Exception e)						{System.out.println("stay consistent "+ e);}
				
		finally{ 						//hamare code me exception ho ya nhi finally block hamesha execute hoga.
		System.out.println("i will never give up");	
	
		}
		}
}

	




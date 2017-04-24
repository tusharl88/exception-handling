package exceptionhandling;
import java.io.*;
public class handlingexception3 {

	public static void main(String []args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int i,j,k=0;
		i = 8;
		j=2;
		String s = null;
		int [] a = new int [4];
		try{
			j= Integer.parseInt( br.readLine());      // br throws IO Exception because it is associated with inputstream
													//and Integer.parseInt throws numberformat exception if value user give is null or zero.
			k= i/j;									// if value of j given by user if zero then arithmetic expression is thrown.
			System.out.println(k);
				
			System.out.println(s.length());      // throws null pointer exception
	
			for ( int c =0; c<= 4; c++){		// throws ArrayIndexOutOfBoundsException.
			a[c] = c+1;
			}
			for ( int value:a)
			{
				System.out.println(value);
			}
		}
		catch(NumberFormatException e)			{System.out.println("what doesnt kills you makes you stronger " + e);}
		catch(IOException e)					{System.out.println("papu cant dance sala " + e);}	
		catch(ArithmeticException e)    		{System.out.println("papu  dance sala " + e);}	
		catch(NullPointerException e)    		{System.out.println("papu  " + e);}	
		catch(ArrayIndexOutOfBoundsException e) {System.out.println("focus or die " + e);}
		catch (Exception e)						{System.out.println("stay consistent "+ e);}
				
		System.out.println("what if today is your last day");	// this statement has nothing to do with above try and catch blocks.
		}
		}

	




package exceptionhandling;

import java.io.InputStreamReader;
import java.io.BufferedReader;


public class handlingexception2 {
	public static void main(String [] args) throws Exception  // we can also use try catch.
	{
		String str = "";
		
		InputStreamReader isr = new InputStreamReader(System.in);
	BufferedReader br = new BufferedReader(isr);
	
	//we can also write this:  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			str = br.readLine();
			System.out.println("hello "+str);
			
	
	}

}

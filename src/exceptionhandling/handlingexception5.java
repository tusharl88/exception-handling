package exceptionhandling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class handlingexception5 {

	public static void main(String []args) throws Exception      // if we dont write throw exception here then br.close() shows exception.
	{
		
BufferedReader br = null;

		try{
			String str = "";
		 br =	new BufferedReader(new InputStreamReader(System.in));
		str = br.readLine();
		System.out.println("hello "+str);
		
	}
		catch (IOException e){
			System.out.println(e);
		}
			finally{
					br.close();    		// br.close() method is used to close the br of BufferedReader.
										// br.close() throws IOException because of br in it and hence we write throws exception after PSVmain.
					}            // see method 3 in notebook.
	}
}
		


	
	



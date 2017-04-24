package exceptionhandling;

public class handlingexception {
public static void main(String [] args){
	// Arithmetic exception
	int i,j,k=0;
	i = 8;
	j= 0;
	
	try{
	k= i/j;
	
	}
	catch(Exception e)							//double click arithmetic exception and go to serialized form where
															// we find that arithmetic exception extends runtime exception class.
	{
		System.out.println("papu cant dance sala " + e);        
	}
	System.out.println(k);
	
// NullPointerException
try{
	String s = null;					// this statement will not give exception.
	System.out.println(s.length());    //s.length() will give exception. this exception bounces in air which is catched by catch.
}
catch(NullPointerException g){
	
System.out.println("you are intelligent " + g);
}

//Array index out of bound exceptiion
int [] a = new int [4];
	for ( int c =0; c<= 4; c++){
		try{
		a[c] = c+1;
		}
		catch(Exception e){
			System.out.println("focus or die " + e);      //do watch handlingexception1
		}
	}
	




}
}

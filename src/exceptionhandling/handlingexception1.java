package exceptionhandling;


public class handlingexception1 {
	public static void main(String []args){
		
	// Arithmetic exception and lot more.
		int i,j,k=0;
		i = 8;
		j= 0;
		String s = null;
		int [] a = new int [4];
		try{
		
			k= i/j;
				
			System.out.println(s.length());   
	
			for ( int c =0; c<= 4; c++){
			a[c] = c+1;
			}
			for ( int value:a)
			{
				System.out.println(value);
			}
		}
		catch(ArithmeticException e)							//double click arithmetic exception and go to serialized form where
																// we find that arithmetic exception extends runtime exception class.
		{
			System.out.println("papu cant dance sala " + e);        
		}
		catch(NullPointerException g){
			
			System.out.println("you are intelligent " + g);
			}
	
	
		catch (ArrayIndexOutOfBoundsException e)	
		{
			System.out.println("focus or die " + e);      //do watch handlingexception1
		}
		catch (Exception e)	{
			System.out.println("stay consistent "+ e);
		} 
		System.out.println("what if today is your last day");	// this statement has nothing to do with above try and catch blocks.
		}
		}

	


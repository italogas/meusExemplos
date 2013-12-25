package exemplos.Serializacao;

import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class CreateTransactionTextFile 
{	
	private Formatter output;
	
	public void openFile()
	{
		try 
		{
			output = new Formatter("trans.txt");	
		} 
		catch(SecurityException securityException)
		{
			System.err.println(" Voçê não possui permissão para acessar este arquivo.");
			System.exit(1);	
		} 
		catch (FileNotFoundException e) 
		{			
			System.err.println(" Erro ao tentar abrir ou criar arquivo.");
			System.exit(1);
		}
		
	}
	
	public void addTransactionRecord()
	{
		 // object to be written to file
	      TransactionRecord record = new TransactionRecord();

	      @SuppressWarnings("resource")
		Scanner input = new Scanner( System.in );

	      System.out.printf( "%s\n%s\n\n",
	         "To terminate input, type the end-of-file indicator ",
	         "when you are prompted to enter input.",
	         "On UNIX/Linux/Mac OS X type <ctrl> d then press Enter",
	         "On Windows type <ctrl> z then press Enter" );

	      System.out.printf( "%s\n%s", 
	         "Enter account number (> 0) and amount.",
	         "? " );

	      while ( input.hasNext() ) // loop until end-of-file indicator
	      {
	         try // output values to file
	         {
	            // retrieve data to be output
	            record.setAccount( input.nextInt() );//read account number
	            record.setAmount(input.nextDouble());// read amount number

	            if ( record.getAccount() > 0 )
	            {
	               // write new record
	               output.format( "%d %.2f\n", record.getAccount(), 
	                  record.getAmount() );
	            } // end if
	            else
	            {
	               System.out.println(
	                  "Account number must be greater than 0." );
	            } // end else
	         } // end try
	         catch ( FormatterClosedException formatterClosedException )
	         {
	            System.err.println( "Error writing to file." );
	            return;
	         } // end catch
	         catch ( NoSuchElementException elementException )
	         {
	            System.err.println( "Invalid input. Please try again." );
	            input.nextLine(); // discard input so user can try again
	         } // end catch

	         System.out.printf( "%s\n%s", "Enter account number (>0) and amount", "? " );
	      } // end while
	      input.close();
	}
	
	public void closeFile()
	{
		if(output!=null)
			output.close();	
	}

}

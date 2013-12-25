package exemplos.Serializacao;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.Scanner;

public class FileMatch {

	private Scanner input;
	private Scanner input2;
	private Formatter output;
	private Formatter log;
	
	public void openReadFile(){
		try {
			input = new Scanner(new File("oldmast.txt"));
		} catch (FileNotFoundException e) {
			System.err.println("Erro ao abrir arquivo. ");
			System.exit(1);
		}
		
		try {
			input2 = new Scanner(new File("trans.txt"));
		} catch (FileNotFoundException e) {
			System.err.println("Erro ao abrir arquivo. ");
			System.exit(1);
		}
	    
	}
	
	public void openWriteFile(){
		try {
			output = new Formatter(new File("newmast.txt"));
		} catch (FileNotFoundException e) {
			System.err.println("Erro ao abrir arquivo. ");
			System.exit(1);
		}
		try {
			log = new Formatter(new File("log.txt"));
		} catch (FileNotFoundException e) {
			System.err.println("Erro ao abrir arquivo. ");
			System.exit(1);
		}
		
	}
	
	public void computeRecords(){
		AccountRecord accRec = new AccountRecord();
		
		while(input.hasNext()){
			accRec.setAccount(input.nextInt());
			accRec.setFirstName(input.next());
			accRec.setLastName(input.next());
			accRec.setBalance(input.nextDouble());
			
			TransactionRecord transRec = new TransactionRecord();
			
			try {
				input2.hasNext();
			} catch (IllegalStateException e) {
				try {
					input2 = new Scanner(new File("trans.txt"));
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
			
			while(input2.hasNext()){
				transRec.setAccount(input2.nextInt());
				transRec.setAmount(input2.nextDouble());
                
				if(transRec.getAccount()==accRec.getAccount()){
                    accRec.setBalance(accRec.getBalance()+transRec.getAmount());
				}
			}
			
            output.format( "%d %s %s %.2f\n", accRec.getAccount(), 
            		accRec.getFirstName(), accRec.getLastName(),
                    accRec.getBalance() );
            
            input2.close();
			
		}
		
		try {
			input2.hasNext();
		} catch (IllegalStateException e) {
			try {
				input2 = new Scanner(new File("trans.txt"));
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		
		if(input2.hasNext()){
			TransactionRecord transRec = new TransactionRecord();
			while(input2.hasNext()){
				transRec.setAccount(input2.nextInt());
				transRec.setAmount(input2.nextDouble());
                
	            log.format( "Unmatched transction record for account number: %d\n", 
	            		transRec.getAccount());
			}
		}
	}
	
	public void closeReadFile(){
		if(input!=null){
			input.close();
		}
		if(input2!=null){
			input2.close();
		}

	}
	
	public void closeWriteFile(){
		if(output!=null){
			output.close();
		}
		if(log!=null){
			log.close();
		}
	}
	
	

}

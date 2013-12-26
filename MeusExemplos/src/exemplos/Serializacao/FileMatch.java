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
	
	public void openRegisterFile(){
		try {
			input = new Scanner(new File("oldmast.txt"));
		} catch (FileNotFoundException e) {
			System.err.println("Erro ao abrir arquivo. ");
			System.exit(1);
		}
	}
	
	public void openTransctionsRegisterFile(){
		try {
			input2 = new Scanner(new File("trans.txt"));
		} catch (FileNotFoundException e) {
			System.err.println("Erro ao abrir arquivo. ");
			System.exit(1);
		}
	    
	}
	
	public void createNewRegisterFile(){
		try {
			output = new Formatter(new File("newmast.txt"));
		} catch (FileNotFoundException e) {
			System.err.println("Erro ao abrir arquivo. ");
			System.exit(1);
		}
	}
	
	public void createLogFile(){
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
			try {
				input2 = new Scanner(new File("trans.txt"));
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	public void computeLogInfo(){
		TransactionRecord t = new TransactionRecord();
		AccountRecord acc = new AccountRecord();
		while(input2.hasNext()){
			t.setAccount(input2.nextInt());
			t.setAmount(input2.nextDouble());
			while(input.hasNext()){
				acc.setAccount(input.nextInt());
				acc.setFirstName(input.next());
				acc.setLastName(input.next());
				acc.setBalance(input.nextDouble());
				if(acc.getAccount() == t.getAccount()){
				    break;
				}
			}
			if(acc.getAccount() == t.getAccount()){
			    break;
			}
			
			log.format( "Unmatched transction record for account number: %d\n", t.getAccount());
		}
	}
	
	public void closeRegisterFile(){
		if(input!=null){
			input.close();
		}
	}
	
	public void closeTransctionsRegisterFile(){
		if(input2!=null){
			input2.close();
		}
	}
	
	public void closeNewRegisterFile(){
		if(output!=null){
			output.close();
		}
	}
	
	public void closeLogFile(){
		if(log!=null){
			log.close();
		}
	}
}

package exemplos.Serializacao;

public class FileMatchTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
        FileMatch fileMatch = new FileMatch();
        fileMatch.openRegisterFile();
        fileMatch.openTransctionsRegisterFile();
        fileMatch.createNewRegisterFile();
        fileMatch.createLogFile();
        fileMatch.computeRecords();
        fileMatch.computeLogInfo();
        fileMatch.closeRegisterFile();
        fileMatch.closeTransctionsRegisterFile();
        fileMatch.closeNewRegisterFile();
        fileMatch.closeLogFile();
	}

}

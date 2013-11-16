package exemplos.Gerais;

import javax.swing.JFrame;

public class DesenhaSmileyTeste {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		DesenhaSmiley panel = new DesenhaSmiley();
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(panel);
		frame.setSize(230, 250);
		frame.setVisible(true);

	}

}

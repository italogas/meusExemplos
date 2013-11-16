package exemplos.Gerais;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class DesenhaSmiley extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1244131619504830107L;

	public void paintComponent(Graphics g) {
		super.paintComponents(g);
		
		g.setColor(Color.YELLOW);
		g.fillOval(10, 10, 200, 200);
		
		g.setColor(Color.BLACK);
		g.fillOval(55, 65, 30, 30);
		g.fillOval(135, 65, 30, 30);
		
		g.fillOval(50, 110, 120, 60);
		
		g.setColor(Color.YELLOW);
		g.fillRect(50, 110, 120, 30);
		
		
	}

}

package strutturali.bridge.start;


import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Canvas extends JPanel {

	public static void main(String[] args) {
		
		JFrame frame = new JFrame();
		frame.setSize(500, 400);
		frame.add(new Canvas());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);

	}

	@Override
	public void paint(Graphics g) {
		Triangle t = new GreenTriangle();
		t.draw(g);
		Square s = new GreenSquare();
		s.draw(g);
		Circle c = new GreenCircle();
		c.draw(g);
		
	}

	
	
}

package strutturali.bridge.end;


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
		Triangle t = new Triangle(new BluColorShape());
		t.draw(g);
		Square s = new Square(new GreenColorShape());
		s.draw(g);
		Circle c = new Circle(new RedColorShape());
		c.draw(g);
		
	}

	
	
}

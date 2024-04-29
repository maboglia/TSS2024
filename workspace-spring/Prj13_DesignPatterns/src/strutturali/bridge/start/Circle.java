package strutturali.bridge.start;

import java.awt.Graphics;

public abstract class Circle extends Shape {

	@Override
	public void draw(Graphics graphics) {
		graphics.fillOval(75, 15, 50, 50);

	}

}

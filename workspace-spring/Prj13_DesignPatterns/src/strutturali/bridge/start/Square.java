package strutturali.bridge.start;

import java.awt.Graphics;

public abstract class Square extends Shape {

	@Override
	public void draw(Graphics graphics) {
		graphics.fillRect(5, 15, 50, 50);
	}

}

package strutturali.bridge.start;

import java.awt.Color;
import java.awt.Graphics;

public class RedCircle extends Circle {

	@Override
	public void draw(Graphics graphics) {
		graphics.setColor(Color.RED);
		super.draw(graphics);
	}
	
}

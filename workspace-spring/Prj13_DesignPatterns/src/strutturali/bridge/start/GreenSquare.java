package strutturali.bridge.start;

import java.awt.Color;
import java.awt.Graphics;

public class GreenSquare extends Square {

	@Override
	public void draw(Graphics graphics) {
		graphics.setColor(Color.GREEN);
		super.draw(graphics);
	}
	
}

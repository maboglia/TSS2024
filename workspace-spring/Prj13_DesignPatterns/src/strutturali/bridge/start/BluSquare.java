package strutturali.bridge.start;

import java.awt.Color;
import java.awt.Graphics;

public class BluSquare extends Square {

	@Override
	public void draw(Graphics graphics) {
		graphics.setColor(Color.BLUE);
		super.draw(graphics);
	}
	
}

package strutturali.bridge.start;

import java.awt.Color;
import java.awt.Graphics;

public class RedTriangle extends Triangle {

	@Override
	public void draw(Graphics graphics) {
		graphics.setColor(Color.RED);
		super.draw(graphics);
	}
	
}

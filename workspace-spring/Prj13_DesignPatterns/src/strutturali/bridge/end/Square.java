package strutturali.bridge.end;

import java.awt.Graphics;

public class Square extends Shape {

	ColorShape colorShape;
	
	public Square(ColorShape colorShape) {
		this.colorShape = colorShape;
	}

	@Override
	public void draw(Graphics graphics) {
		colorShape.setColor(graphics); 
		graphics.fillRect(5, 15, 50, 50);
	}

}

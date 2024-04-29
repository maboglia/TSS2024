package strutturali.bridge.end;

import java.awt.Color;
import java.awt.Graphics;

public class BluColorShape implements ColorShape {

	@Override
	public void setColor(Graphics graphics) {
		graphics.setColor(Color.BLUE);

	}

}

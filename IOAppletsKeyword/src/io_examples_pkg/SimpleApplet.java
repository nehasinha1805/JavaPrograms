package io_examples_pkg;
/*<applet class = "SimpleApplet" width = 200 height =60>
</applet>*/
import java.applet.*;
import java.awt.*;

public class SimpleApplet extends Applet {
	public void paint(Graphics g) {
		g.drawString("A Simple Applet", 20, 20);
	}
}

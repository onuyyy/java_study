import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class GameMain extends JFrame {

	GameView gv = new GameView(); {
		add("Center",gv);
		setSize(1024,768);
		setVisible(true);

	}
	
	public static void main(String[] args) {
		new GameMain();
	}
	
	
}

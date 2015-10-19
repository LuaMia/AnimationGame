package name.panitz.ludens.animationGame;
import java.awt.Graphics;

public class SimpleSizedPanel extends SizedPanel {
	
	public void paintComponent(java.awt.Graphics g){
		g.fillRect(80, 40, 30, 30);
	}
	
	public static void main(String []args){
		ShowInFrame.show(new SimpleSizedPanel());
	}

}

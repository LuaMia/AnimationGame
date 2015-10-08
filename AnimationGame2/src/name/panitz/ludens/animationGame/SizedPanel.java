package name.panitz.ludens.animationGame;
import javax.swing.*;
import java.awt.Dimension;
import name.panitz.ludens.animationGame.ShowInFrame;


public class SizedPanel extends JPanel {

	int prefferedWidth = 400;
	int prefferedHeight = 300;
	
	public SizedPanel(int w, int h){
		prefferedWidth = w;
		prefferedHeight = h;
	}
	
	public SizedPanel(){}
	

	public Dimension getPrefferedSize(){
		return new Dimension(prefferedWidth, prefferedHeight);
	}
	
	public static void main(String [] args){
		JFrame frame = new JFrame("hallo");
		frame.setBounds(200,20,200,200);
		//SizedPanel panel = new SizedPanel();
		//frame.add(panel);
		frame.setVisible(true);
	}
}

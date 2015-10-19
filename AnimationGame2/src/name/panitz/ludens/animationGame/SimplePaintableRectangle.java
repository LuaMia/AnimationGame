package name.panitz.ludens.animationGame;

public class SimplePaintableRectangle extends SimpleRectangle implements Paintable{
	
	public SimplePaintableRectangle(double width, double height, Vertex pos){
		super(width, height, pos);
	}
	
	public void paintTo(java.awt.Graphics g){
		g.fillRect((int)pos.x, (int)pos.y, (int)width, (int)height);
	}

}

package name.panitz.ludens.animationGame;

public class Vertex {
	public double x;
	public double y;
	
	public Vertex(double xx, double yy){
		x = xx;
		y = yy;
	}
	
	public String toString(){
		return "("+x+", "+y+")";
	}
	
	public double length(){
		return Math.sqrt(x*x + y*y);
	}
	
	public Vertex skalarMult(double s){
		return new Vertex(x*s, y*s);
	}
	
	public void skalarMultMod(double s){
		x = x*s;
		y = y*s;
	}
	
	public Vertex add (Vertex v2){
		return new Vertex(x+v2.x, y+v2.y);
	}
	
	public void addMod(Vertex v2){
		x = x+v2.x;
		y = y+v2.y;
	}
	
	public void setX(double x){
		this.x =x;
	}
	
	public void setY(double y){
		this.y = y;
	}
	
	public double getX(){
		return x;
	}
	
	public double getY(){
		return y;
	}
	
	public Vertex sub (Vertex v2){
		return new Vertex(x-v2.x, y-v2.y);
	}
	
	public double distance(Vertex v2){
		return Math.sqrt((x-v2.x)*(x-v2.x)+(y-v2.y)*(y-v2.y));
	}
	
	public Vertex normalized(){
		return new Vertex (x/(Math.sqrt(x*x+y*y)), y/Math.sqrt(x*x + y*y));
	}
	
	public boolean equals(Object thatObject){
		if (thatObject instanceof Vertex){
			Vertex that = (Vertex)thatObject;
			return this.x==that.x && this.y == that.y;
		}
		return false;
	}


}
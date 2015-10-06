package name.panitz.ludens.animationGame;

public class SimpleSquare extends GeometricObject{
	
	public SimpleSquare(double w, Vertex pos){
		super(w,w,pos);
	}
	
	@Override public double area(){
		return width*width;
	}
	
	public @Override String toString(){
		return "SimpleSquare("+super.toString()+")";
	}
	
	public @Override boolean equals(Object that){
		return (that instanceof SimpleSquare) && super.equals(that);
	}
	
	
}

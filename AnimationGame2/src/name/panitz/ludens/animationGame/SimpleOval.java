package name.panitz.ludens.animationGame;

public class SimpleOval extends GeometricObject {

	public SimpleOval(double w, double h, Vertex pos){
		super(w,h,pos);
	}
	
	@Override public double area(){
		return Math.PI*width*height/4;
	}
	
	public @Override String toString(){
		return "SimpleOval (" +super.toString()+")";
	}
	
	public @Override boolean equals(Object that){
		return (that instanceof SimpleOval) && super.equals(that);
	}
	
}

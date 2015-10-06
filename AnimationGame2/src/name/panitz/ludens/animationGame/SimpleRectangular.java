package name.panitz.ludens.animationGame;

public class SimpleRectangular extends GeometricObject {

	public SimpleRectangular(double w,double h, Vertex pos){
		super(w,h,pos);
	}
	
	@Override public double area(){
		return width*height;
	}
	
	public @Override String toString(){
		return "SimpleRectangular ("+super.toString()+")";
	}

	public @Override boolean equals(Object that){
		return (that instanceof SimpleRectangular) && super.equals(that);
	}
}

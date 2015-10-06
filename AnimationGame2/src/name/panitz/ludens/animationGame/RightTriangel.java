package name.panitz.ludens.animationGame;

public class RightTriangel extends GeometricObject{
	
	public RightTriangel(double w, double h, Vertex pos){
		super(w,h,pos);
	}
	
	@Override public double area(){
		return width*height/2;
	}
	
	public @Override String toString(){
		return "RightTriangel("+super.toString()+")";
	}
	
	public @Override boolean equals(Object that){
		return (that instanceof RightTriangel) && super.equals(that);
	}

}

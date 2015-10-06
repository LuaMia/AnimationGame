package name.panitz.ludens.animationGame;

import name.panitz.ludens.animationGame.Vertex;

public class GeometricObject {
	public Vertex pos;
	public double width;
	public double height;
	
	public double getWidth(){
		return width;
	}
	
	public double getHeight(){
		return height;
	}
	
	public Vertex getPos(){
		return pos;
	}
	
	public String toString(){
		return  this.width+ "," +this.height+","+this.pos;
	}
	
	public GeometricObject(double w, double h, Vertex poss){
		pos = poss;
		width = w;
		height = h;
		if (width<0){
			width = -width;
			pos.x = pos.x - width;
		}
		if (height<0){
			height= -height;
			pos.y =pos.y -height;
		}
	}
	
	public GeometricObject(double w, double h){
		this(w,h,new Vertex(0,0));
	}
	
	public GeometricObject(double w){
		this(w,w);
	}
	
	public GeometricObject(){
		this(10);
	}
	
	public GeometricObject(Vertex pos){
		this(0,0,pos);
	}
	
	public double circumference(){
		return 2*(width+height);
	}
	
	public double area(){
		return width*height;
	}
	
	public boolean contains(Vertex v){
		return v.x >= pos.x && v.x <= pos.x+width // x is within
				&& v.y>=pos.y && v.y <= pos.y+height; //y is within
	}
	
	public boolean isLargerThan(GeometricObject that){
		return this.area() > that.area();
	}

	public void moveTo(Vertex pos){
		this.pos = pos;
	}
	
	public void move(Vertex v){
		moveTo(pos.add(v));
	}
	
	public boolean equals(Object thatObject){
		if (thatObject instanceof GeometricObject){
			GeometricObject that = (GeometricObject)thatObject;
			return that.width == this.width && 
					that.height == this.height && 
					this.pos.equals(that.pos);
		}
		return false;
	}
	
	public boolean touch (GeometricObject thatObject){
		double x1 = this.pos.getX();
		double x2 = thatObject.pos.getX();
		double y1 = this.pos.getY();
		double y2 = thatObject.pos.getY();
		if ((x1>=x2 && x1 <=x2+thatObject.width ||
				x1+this.height >= x2 && x1+this.height <= x2+thatObject.height)
				&&
				(y1>=y2 && x1 <=y2+thatObject.height ||
				y1+this.width >= y2 && y1+this.width <= y2+thatObject.width)){
			return true;
		}
		return false;
	}
		
}


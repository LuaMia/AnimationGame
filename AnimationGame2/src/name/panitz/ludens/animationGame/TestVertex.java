package name.panitz.ludens.animationGame;

public class TestVertex {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vertex v1 = new Vertex(19,2);
		Vertex v2 = new Vertex(19,9);
		
		System.out.println(v2.toString());
		Vertex v3 = v1.add(v2);
		Vertex v4 = v3.sub(v1);
		System.out.println(v3.toString());
		System.out.println(v4.toString());
		System.out.println(v2.distance(v1));
		Vertex v5 = v1.normalized();
		System.out.println(v5.toString());
		
		GeometricObject o1 = new GeometricObject(12,12);
		double weite = o1.getWidth();
		double höhe = o1.getHeight();
		Vertex v6 = o1.getPos();
		System.out.println(weite);
		System.out.println(höhe);
		System.out.println(v6.toString());
		System.out.println(o1.circumference());
		System.out.println(o1.contains(v1));
		
		SimpleOval so1 = new SimpleOval(1,2,v1);
		SimpleRectangle sr1 = new SimpleRectangle(1,2,v1);
		System.out.println(so1.toString());
		System.out.println(sr1.area());

	}
}
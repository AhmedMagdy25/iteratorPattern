package iteratorPattern;

public class ShapeStorage{
	private int index;
	private Shape []shapes;
	
	public ShapeStorage() {
		this.shapes = new Shape[2];
	}
	public ShapeStorage(int num) {
		this.shapes = new Shape[num];
	}
	
	public void addShape(String name) {
		int i = index++;
		shapes[i]= new Shape(i, name);
	}
	public Shape[] getShapes() {
		return shapes;
	}
}

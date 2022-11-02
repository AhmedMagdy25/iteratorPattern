package iteratorPattern;

public class Main{
	public static void main(String []args) {
		ShapeStorage storage = new ShapeStorage(4);
		storage.addShape("circle");
		storage.addShape("square");
		storage.addShape("rectangle");
		storage.addShape("triangle");
		
		ShapeIterator iterator = new ShapeIterator(storage.getShapes());
		
		System.out.println("incremental iterating...");
		while(iterator.hasNext()) {
			System.out.println(iterator.next().getName());
		}
		System.out.println("decremental iterating...");
		while(iterator.hasPrev()) {
			System.out.println(iterator.prev().getName());
		}
		System.out.println("removing while iterating...");
		while(iterator.hasNext()) {
			System.out.println(iterator.next().getName());
			iterator.remove();
		}
		
	}
}
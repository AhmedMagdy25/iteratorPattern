package iteratorPattern;

import java.util.Iterator;

public class ShapeIterator implements Iterator<Shape>{
	private Shape []shapes;
	int nextPos;
	int currentPos = -1;
	
	public ShapeIterator(Shape []shapes) {
		this.shapes = shapes;
	}
	@Override
	public boolean hasNext() {
		if(nextPos >= shapes.length || shapes[nextPos]== null)
			return false;
		return true;
	}
	@Override
	public Shape next() {
		currentPos++;
		return shapes[nextPos++];
	}
	@Override
	public void remove() {
		if(currentPos < 0 )
			throw new IllegalStateException("Illegal position");
		if(shapes[currentPos] != null) {
			for(int i = currentPos; i<(shapes.length-1); i++) {
				shapes[i] = shapes[i+1];
			}
			shapes[shapes.length-1] = null;
		}
	}
	public boolean hasPrev() {
		if(currentPos-1 < 0)
			return false;
		return true;
	}
	public Shape prev() {
		nextPos--;
		return shapes[--currentPos];
	}
}